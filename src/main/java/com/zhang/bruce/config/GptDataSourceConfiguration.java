package com.zhang.bruce.config;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.provider.AbstractDataSourceProvider;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import com.yeepay.g3.utils.common.datasource.DataSourceFactoryBean;
import com.yeepay.g3.utils.common.datasource.PooledDataSourceFactory;
import com.yeepay.g3.utils.common.datasource.impl.DruidPooledDataSourceFactory;
import org.apache.commons.lang.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lijunhao
 * @date 2022/9/14 17:43
 */
@Configuration
public class GptDataSourceConfiguration {

    /**
     * 将动态数据源设置为首选的
     * 当spring存在多个数据源时, 自动注入的是首选的对象
     * 设置为主要的数据源之后，就可以支持shardingjdbc原生的配置方式了
     * 3.4.0版本及以上使用以下方式注入,老版本请阅读文档  进阶-手动注入多数据源
     */
    @Bean("dataSource")
    public DynamicRoutingDataSource dataSource() {
        DynamicRoutingDataSource dataSource = new DynamicRoutingDataSource();
        // 设置默认的数据源或者数据源组,默认值即为ANTI
        dataSource.setPrimary(DataSourceConstants.GPTBUSINESS);
        // 严格匹配数据源,默认false. true未匹配到指定数据源时抛异常,false使用默认数据源
        dataSource.setStrict(true);
        return dataSource;
    }

    /**
     * 获取数据源
     *
     * @param pooledDataSourceFactory
     * @param properties
     * @return
     * @throws Exception
     */
    private DataSource getDataSource(PooledDataSourceFactory pooledDataSourceFactory, String properties) throws Exception {
        DataSourceFactoryBean dataSourceFactoryBean = new DataSourceFactoryBean();
        dataSourceFactoryBean.setName(properties);
        dataSourceFactoryBean.setPooledDataSourceFactory(pooledDataSourceFactory);
        return (DataSource) dataSourceFactoryBean.getObject();
    }

    /**
     * 所有的数据源需要汇总在这里
     * 目前使用的是 公司的数据源（反洗钱业务库）和 shardingjdbc封装的数据源（反洗钱集市）
     *
     * @return
     * @throws Exception
     */
    @Bean
    public DynamicDataSourceProvider dynamicDataSourceProvider() throws Exception {

        DataSource fkjsDs = getDataSource(druidPooledDataSourceFactory(), DataSourceConstants.FKJS);
        DataSource businessDs = getDataSource(druidPooledDataSourceFactory(), DataSourceConstants.GPTBUSINESS);
        DataSource localDs = getDataSource(druidPooledDataSourceFactory(), DataSourceConstants.LOCAL);
        DataSource yunDs = getDataSource(druidPooledDataSourceFactory(), DataSourceConstants.BUSINESS);


        return new AbstractDataSourceProvider() {
            @Override
            public Map<String, DataSource> loadDataSources() {
                HashMap<String, DataSource> sourceHashMap = new HashMap<>();
                sourceHashMap.put(DataSourceConstants.BUSINESS, yunDs);
                sourceHashMap.put(DataSourceConstants.FKJS, fkjsDs);
                sourceHashMap.put(DataSourceConstants.GPTBUSINESS, businessDs);
                sourceHashMap.put(DataSourceConstants.LOCAL, localDs);
                return sourceHashMap;
            }
        };
    }


    /**
     * 数据库连接池
     *
     * @return
     */
    @Bean("pooledDataSourceFactory")
    public DruidPooledDataSourceFactory druidPooledDataSourceFactory() {
        return new DruidPooledDataSourceFactory();
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactory factory = null;
        final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        final ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        org.springframework.core.io.Resource[] resources = {};
        String location = "classpath:mapper/*.xml";
        resources = (org.springframework.core.io.Resource[]) ArrayUtils.addAll(resources, resolver.getResources(location));
        bean.setMapperLocations(resources);
        bean.setTypeAliasesPackage("com.yeepay.bruce");
        factory = bean.getObject();
        factory.getConfiguration().setDefaultStatementTimeout(60);
        return factory;
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage("com.zhang.bruce.general.mysql");
        scannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return scannerConfigurer;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
