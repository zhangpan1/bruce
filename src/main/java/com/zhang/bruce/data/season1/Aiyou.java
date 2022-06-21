package com.zhang.bruce.data.season1;

import com.google.common.collect.Lists;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/3/11 2:13 下午
 */
public class Aiyou {
//
//    /**
//     * @author bruce
//     * @version 1.0
//     * @date 2022/1/10 15:52
//     * @Description: 可疑报告打包, 上传，下载相关业务
//     */
//    @Service
//    public class SuspiciousGeneratePackageService {
//        private static final Logger LOGGER = LoggerFactory.getLogger(SuspiciousGeneratePackageService.class);
//        @Resource
//        private ThreadPoolTaskExecutor executor;
//
//        @Resource
//        private DataPackageService dataPackageService;
//
//
//        @Resource
//        private SuspiciousReportHandleService reportHandleService;
//
//
//        @Resource
//        private SuspiciousReportService reportService;
//
//
//        /**
//         * @param fi 打包，生成数据包服务
//         * @return
//         */
//        public List<PackagePackResult> packetSuspiciousReport(SuspiciousPacketFI fi) {
//            List<PackagePackResult> results = Lists.newArrayList();
//            // 进行打包生成数据包
//            ReportGenRetEnum retEnum;
//            String file = "";
//            try {
//                // 进行打包生成数据包
//                Future<String> submit = submitSuspiciousReportTask(fi);
//                file = submit.get(10, TimeUnit.SECONDS);
//                retEnum = ReportGenRetEnum.OK;
//            } catch (InterruptedException e) {
//                // 任务被取消
//                retEnum = ReportGenRetEnum.CANCEL;
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                retEnum = ReportGenRetEnum.ERROR;
//                e.printStackTrace();
//            } catch (TimeoutException e) {
//                retEnum = ReportGenRetEnum.DOING;
//                e.printStackTrace();
//            }
//            for (Long report : fi.getReportList()) {
//                PackagePackResult of = PackagePackResult.of(report, retEnum, AntiPackageBizEnum.SUSPICIOUS);
//                of.setFile(file);
//                results.add(of);
//            }
//            return results;
//        }
//
//        /**
//         * 多个报告单合并打包.相同商户下的合并成一个xml
//         * 单个打包 ，不合并，多个需要合并
//         *
//         * @param fi 打包入参
//         * @param
//         * @return 报告名称
//         */
//        private Future<String> submitSuspiciousReportTask(SuspiciousPacketFI fi) {
//            return executor.submit(() -> {
//                String operator = fi.getPackageOperator();
//                //  return executor.submit(() -> {});
//                List<AntiSuspiciousMerchantReportEntity> packetFIS = Lists.newArrayList();
//                for (Long reportId : fi.getReportList()) {
//                    AntiSuspiciousMerchantReportEntity report = reportService.findOne(reportId);
//                    // 状态为待打包的需要打包，或者打包失败的包，其他状态不允许打包 TODO 先放开，等最终测试放开
//                /*if (ReportStatusEnum.to_be_packed.getCode().equals(report.getReportStatus())) {
//                    packetFIS.add(report);
//                }*/
//                }
//                // 先区分类型--得到两个类型    1 为待复核打包  2 为待修改打包
//                List<AntiSuspiciousMerchantReportEntity> doNewentity = packetFIS.stream().filter(s -> s.getPackingType() == 1).collect(Collectors.toList());
//                // 先区分类型--得到两个类型    1 为待复核打包  2 为待修改打包
//                List<AntiSuspiciousMerchantReportEntity> doModifyentity = packetFIS.stream().filter(s -> s.getPackingType() == 2).collect(Collectors.toList());
//                // 待复核打包--新增打包，按照一个客户下一个list
//                Map<String, List<AntiSuspiciousMerchantReportEntity>> newPackCoustom = null;
//                if (!CollectionUtils.isEmpty(doNewentity)) {
//                    newPackCoustom = doNewentity.stream()
//                            .collect(Collectors.groupingBy(AntiSuspiciousMerchantReportEntity::getCustomerNo));
//                }
//                Map<String, List<AntiSuspiciousMerchantReportEntity>> modifyPackCoustom = null;
//                if (!CollectionUtils.isEmpty(doModifyentity)) {
//                    // 待修改打包--修改打包
//                    modifyPackCoustom = doModifyentity.stream()
//                            .collect(Collectors.groupingBy(AntiSuspiciousMerchantReportEntity::getCustomerNo));
//                }
//
//                String fileCreate = null;
//                String fileModify = null;
//                if (!CollectionUtils.isEmpty(newPackCoustom)) {
//                    // 新增一个压缩包
//                    // 导出文件 -- 新增打包
//                    fileCreate = doPacking(newPackCoustom, AntiPackageOpTypeEnum.CREATE, operator);
//                }
//                if (!CollectionUtils.isEmpty(modifyPackCoustom)) {
//                    fileModify = doPacking(modifyPackCoustom, AntiPackageOpTypeEnum.MODIFY, operator);
//                }
//                fileCreate = fileCreate == null ? "" : fileCreate;
//                fileModify = fileModify == null ? "" : fileModify;
//                return fileCreate + fileModify;
//            });
//        }
//
//        private String doPacking(Map<String, List<AntiSuspiciousMerchantReportEntity>> newPackCoustom, AntiPackageOpTypeEnum genTypeEnum, String operator) {
//            Map<String, ReportPacketExportResult<List<AntiSuspiciousMerchantReportEntity>>> reportPacketExportResult;
//            String result;
//            List<ReportPackageExportResult> exportZipFile = null;
//            // 判断是失败重试，还是首次打包或者重新打包
//            boolean flag = checkRetry(newPackCoustom);
//
//            // 商户-报文信息
//            reportPacketExportResult = reportHandleService.export(newPackCoustom, genTypeEnum, operator);
//
//            // 判断所有数据包是否全部成功
//            boolean allAreSuccess = reportPacketExportResult.values().stream().allMatch(ReportPacketExportResult::isExportSucc);
//            if (allAreSuccess) {
//                // 因为数据包需要依赖生成的报文打包。如果报文打包失败，后续的报文分包就无法实现
//                ZipReportExport zipReportExport = new ZipReportExport();
//                for (Map.Entry<String, ReportPacketExportResult<List<AntiSuspiciousMerchantReportEntity>>> entry : reportPacketExportResult.entrySet()) {
//                    ReportPacketExportResult<List<AntiSuspiciousMerchantReportEntity>> exportResult = entry.getValue();
//                    try {
//                        zipReportExport.addFile(exportResult.getPacketFileName(), new File(exportResult.getPacketLocalPath()));
//                    } catch (Exception e) {
//                        LOGGER.error("可疑监控异步任务, 生成可疑压缩包过程中，customer={}" + entry.getKey() + ", 的数据包:" + exportResult.getPacketFileName() + " 失败!!", e);
//                    }
//                }
//                LOGGER.info("开始打包ZIP============");
//                try {
//                    exportZipFile = zipReportExport.export();
//                    // 生成zip文件，然后上传到对象存储，返回报文对应的数据包信息
//                    // 报文信息-数据包信息
//                    Map<String, PackageInfo> packageInfo = dataPackageService.uploadSuspiciousPackageFile(flag,reportPacketExportResult, AntiPackageBizEnum.SUSPICIOUS, genTypeEnum, exportZipFile, operator);
//                    List<String> packageNames = packageInfo.values().stream().map(PackageInfo::getPackageName).collect(Collectors.toList());
//                    LOGGER.info("可疑监控异步任务，数据包上传成功。生成以下数据包：" + packageNames);
//                    for (Map.Entry<String, ReportPacketExportResult<List<AntiSuspiciousMerchantReportEntity>>> entry : reportPacketExportResult.entrySet()) {
//                        ReportPacketExportResult<List<AntiSuspiciousMerchantReportEntity>> exportResult = entry.getValue();
//                        String packetFileName = exportResult.getPacketFileName();
//                        PackageInfo packageIF = packageInfo.get(packetFileName);
//                        // 上传数据包到YCS
//                        PackagePacket packagePacket = dataPackageService.uploadPacketFile(packageIF.getId(), packetFileName,
//                                AntiPackageBizEnum.SUSPICIOUS, AntiPackageTypeEnum.PACKAGE, exportResult.getPacketLocalPath(), operator);
//                        // 更新每个商户的报告数据包内容
//                        reportService.updateReportPackage(packagePacket.getPacketName(), exportResult.getReportEntity(), packagePacket, ReportStatusEnum.packaged.getCode(), operator);
//                    }
//                    // TODO 入库打包日志信息表--正确打包日志
//                    List<PackageInfo> packageInfoList = new ArrayList<PackageInfo>(packageInfo.values());
//                    for (PackageInfo packageInfo1 : packageInfoList) {
//                        saveOperationLog(packageInfo1,genTypeEnum);
//                    }
//                    result = "success";
//                    // 打包成功，直接返回
//                    return result;
//                } catch (Exception e) {
//                    LOGGER.error("【可疑】生成数据包失败", e);
//                } finally {
//                    if (exportZipFile != null) {
//                        for (ReportPackageExportResult zipExportResult : exportZipFile) {
//                            FileUtils.deleteQuietly(new File(zipExportResult.getPackageLocalPath()));
//                        }
//                    }
//                    reportPacketExportResult.forEach((aLong, packetExportResult) -> FileUtils.deleteQuietly(new File(packetExportResult.getPacketLocalPath())));
//                }
//
//            }
//            // 如果有失败报文，或者打包失败，生成虚拟包，不能打包
//            try {
//                // 只保存报文信息
//                // 生成一个临时的数据包，后期重新打包有可能因为拆包会拆分成多个
//                PackageInfo packageInfo = dataPackageService.generateSuspiciousFailPackage(reportPacketExportResult, AntiPackageTypeEnum.PACKAGE, LocalDate.now(),
//                        genTypeEnum, AntiPackageBizEnum.SUSPICIOUS, operator);
//                // 上传数据包
//                reportPacketExportResult.forEach((customerNo, packetExportResult) -> {
//                    // 失败的生成报文数据，不上传文件
//                    PackagePacket packagePacket = dataPackageService.generateFailPacket(packageInfo.getId(), packetExportResult.getPacketFileName(), AntiPackageTypeEnum.PACKAGE,
//                            genTypeEnum, AntiPackageBizEnum.SUSPICIOUS, operator);
//
//                    LOGGER.info("可疑监控异步任务,上传报文成功，customer=" + customerNo + ", 对应的数据包为：" + packageInfo.getPackageName() + ",对应的报文为：" + packetExportResult.getPacketFileName());
//                    // TODO 更新每个商户的报告数据包内容--打包失败
//                    reportService.updateReportPackage(packagePacket.getPacketName(), packetExportResult.getReportEntity(), packagePacket, ReportStatusEnum.package_failed.getCode(), operator);
//                });
//                // TODO 失败打包记录日志
//                saveOperationLog(packageInfo,genTypeEnum);
//            } catch (Exception e) {
//                LOGGER.error("【可疑】生成打包失败数据包异常", e);
//            } finally {
//                reportPacketExportResult.forEach((customerNo, packetExportResult) -> FileUtils.deleteQuietly(new File(packetExportResult.getPacketLocalPath())));
//            }
//            result = "fail";
//            return result;
//        }
//
//        /**
//         * 记录打包操作日志
//         * @param packageInfo
//         * @param genTypeEnum
//         */
//        private void saveOperationLog(PackageInfo packageInfo, AntiPackageOpTypeEnum genTypeEnum) {
//            reportService.saveOperationLog(packageInfo,genTypeEnum.getValue());
//        }
//
//        /**
//         * 判断打包是否重试
//         * @param newPackCoustom
//         * @return 如果是打包失败重试，返回true;
//         */
//        private boolean checkRetry(Map<String, List<AntiSuspiciousMerchantReportEntity>> newPackCoustom) {
//            List<Integer> status = Lists.newArrayList();
//            for (Map.Entry<String, List<AntiSuspiciousMerchantReportEntity>> entry : newPackCoustom.entrySet()) {
//                List<AntiSuspiciousMerchantReportEntity> antiSuspiciousMerchantReportEntities = entry.getValue();
//                List<Integer> reportStatus = antiSuspiciousMerchantReportEntities.stream().map(AntiSuspiciousMerchantReportEntity :: getReportStatus).collect(Collectors.toList());
//                status.addAll(reportStatus);
//            }
//            for (Integer state : status) {
//                if (state == ReportStatusEnum.package_failed.getCode()) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//
//    }
}
