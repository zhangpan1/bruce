package com.zhang.bruce.base.bru1;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/31 2:28 下午
 */
public class BlackTest {
    public static void main(String[] args) {
        String indexCode = "function boolean bizStrAndProdStrContains(Object productions, Object productIds, Object production, Object productId) {\n" +
                "        try {\n" +
                "            if (productions == null || productIds == null || production == null || productId == null) {\n" +
                "                return false;\n" +
                "            }\n" +
                "            String productionStr = production.toString();\n" +
                "            String productIdStr = productId.toString();\n" +
                "            List<String> productionsList = Arrays.asList(productions.toString().split(\",|;\"));\n" +
                "            List<String> productIdsList = Arrays.asList(productIds.toString().split(\",|;\"));\n" +
                "            //因为在规则引擎中WALLETPAY_G3MEMBER_PAYMENT做了特殊处理\n" +
                "            if (\"WALLETPAY_G3MEMBER_PAYMENT\".equalsIgnoreCase(productionStr) || \"WALLETPAY_BANK_TRANS_PAYMENT\".equalsIgnoreCase(productionStr) || \"YJZF_FE\".equals(productionStr) || \"DS_FE\".equals(productionStr) || \"EPOS_FE\".equals(productionStr)){\n" +
                "            \n" +
                "                String[] s = productionStr.split(\"_\");\n" +
                "                productionStr = s[0];\n" +
                "            }\n" +
                "            if ((productionsList.contains(productionStr)) && productIdsList.contains(productIdStr)) {\n" +
                "                return true;\n" +
                "            }\n" +
                "        } catch (Exception e) {\n" +
                "            LoggerUtil.getLogger().error(\"全局方法出现异常 bizStrAndProdStrContains\", e);\n" +
                "            return false;\n" +
                "        }\n" +
                "        return false;\n" +
                "    }";
        String up = indexCode.toLowerCase();
        boolean isBlack = BlackMethodVerify.mathClass(up);
        System.out.println(isBlack);
    }


}
