package com.zhang.bruce.util;

import com.yeepay.g3.utils.common.StringUtils;
import com.yeepay.g3.utils.common.encrypt.AES;
import com.yeepay.g3.utils.config.ConfigParam;
import com.yeepay.g3.utils.config.ConfigurationUtils;

/**
 * Created by gengshunli ON 2019-08-14.<br>
 */
public class DoorGodAESUtils {
    private static String dataEncryKey = "";
    public static final String WIND_GOD_ENCRY_KEY = "BiRw.mhv4Eq^E6We";
    public static final String DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_PREFIX = "7xiBvb+FYadUzqXRTBsrrw==";
    public static final String DOOROGD_SENSITIVE_INFO_ENCRYKEY_KEY = "DOOROGD_SENSITIVE_INFO_ENCRYKEY_KEY";
    public static final String DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_SUFFIX = "DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_SUFFIX";
    public static String encode(String message, String password) {
        return StringUtils.isBlank(message) ? message : AES.encryptToBase64(message, password);
    }

    public static String decode(String message, String password) {
        if (StringUtils.isBlank(message)) {
            return message;
        } else {
            try {
                return AES.decryptFromBase64(message, password);
            } catch (Exception var3) {
                throw new RuntimeException(var3.getMessage());
            }
        }
    }

    public static String getDataEncryKey() {
        if (StringUtils.isBlank(dataEncryKey)) {
            try {
                String key = getEncrykey();
                String dataEncryKeyPrefix = decode("7xiBvb+FYadUzqXRTBsrrw==", key);
                String dataEncryKeySuffix = decode(getDataEncrykeySuffix(), key);
                dataEncryKey = dataEncryKeyPrefix + dataEncryKeySuffix;
            } catch (Exception var3) {
                throw new RuntimeException(var3.getMessage());
            }
        }

        return dataEncryKey;
    }

    public static String getEncrykey() {
        String key = "";

        try {
            ConfigParam<String> configParam = ConfigurationUtils.getSysConfigParam("DOOROGD_SENSITIVE_INFO_ENCRYKEY_KEY");
            key = (String)configParam.getValue();
            return key;
        } catch (Exception var2) {
            throw new RuntimeException(var2.getMessage());
        }
    }

    public static String getDataEncrykeySuffix() {
        String encrykeySuffix = "";

        try {
            ConfigParam<String> configParam = ConfigurationUtils.getSysConfigParam("DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_SUFFIX");
            encrykeySuffix = (String)configParam.getValue();
            return encrykeySuffix;
        } catch (Exception var2) {
            throw new RuntimeException(var2.getMessage());
        }
    }

    static {
        try {
            ConfigurationUtils.init();
            String key = getEncrykey();
            String dataEncryKeyPrefix = decode("7xiBvb+FYadUzqXRTBsrrw==", key);
            String dataEncryKeySuffix = decode(getDataEncrykeySuffix(), key);
            dataEncryKey = dataEncryKeyPrefix + dataEncryKeySuffix;
        } catch (Exception var3) {
            System.exit(0);
        }

    }
}
