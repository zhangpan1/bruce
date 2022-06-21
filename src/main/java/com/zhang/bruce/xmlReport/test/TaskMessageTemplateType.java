package com.zhang.bruce.xmlReport.test;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum TaskMessageTemplateType {
    PROCESSING("��������Ϣ"),
    BACK("���˻���Ϣ"),
    REVOKED("δ�����˻�"),
    REVOKE("��������Ϣ"),
    ADD_REVIEWER("����ǩ��Ϣ"),
    REMOVE_REVIEWER("����ǩ��Ϣ"),
    PROCESS_END("����ֹ��Ϣ"),
    CARBON_COPY("����������Ϣ"),
    PROCESS_STATUS("�����˻�õ����������Ϣ"),
    REJECT("�����ܾ�"),
    DOWNLOAD_DATA("����������Ϣ");
    ;

    public static TaskMessageTemplateType getInstance(String name){
        return cache.get(name);
    }

    private static final Map<String,TaskMessageTemplateType> cache =
            Arrays.stream(TaskMessageTemplateType.values()).collect(Collectors.toMap(e->e.name(),e->e));

    private String name;

    public String getName() {
        return name;
    }

    public boolean equalsName(String name){
        return StringUtils.equals(this.name(),name);
    }

    TaskMessageTemplateType(String name) {
        this.name = name;
    }
}
