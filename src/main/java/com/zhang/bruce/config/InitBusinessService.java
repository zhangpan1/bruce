package com.zhang.bruce.config;


import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;


@Component
public class InitBusinessService implements ServletContextAware {
    private static final Logger logger = LoggerFactory
            .getLogger(InitBusinessService.class);

    @Override
    public void setServletContext(ServletContext servletContext) {
        try{
            SMUtils.init();
            logger.info("InitBusinessService finish !");
        }catch (Exception e) {
            logger.error("InitBusinessService is error",e);
        }
    }
}
