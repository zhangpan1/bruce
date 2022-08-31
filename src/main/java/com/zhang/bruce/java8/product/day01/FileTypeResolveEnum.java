package com.zhang.bruce.java8.product.day01;

public enum FileTypeResolveEnum {
    File_A_RESOLVE("", "ACTIVITY_ID_SEQUENCE_LOCK", "ACTIVITY_ID", 1, "活动ID序列号"),
    File_B_RESOLVE("", "ACTIVITY_ID_SEQUENCE_LOCK", "ACTIVITY_ID", 1, "活动ID序列号"),
    File_DEFAULT_RESOLVE("", "ACTIVITY_ID_SEQUENCE_LOCK", "ACTIVITY_ID", 1, "活动ID序列号"),
    ACTIVITY_ID_SEQUENCE("", "ACTIVITY_ID_SEQUENCE_LOCK", "ACTIVITY_ID", 1, "活动ID序列号")
    ;

    /**
     *
     * @param seqRedisKey lua+redis+mysql时缓存中序列号的key，mysql的方式无需此key
     * @param redisLock 分布式锁
     * @param scene 业务场景，如活动ID等
     * @param step 步长，lua+redis+mysql的方式需要步长，mysql的方式无需步长
     */
    FileTypeResolveEnum(String seqRedisKey, String redisLock, String scene, long step, String desc) {
        this.seqRedisKey = seqRedisKey;
        this.redisLock = redisLock;
        this.scene = scene;
        this.step = step;
        this.desc = desc;
    }
    private String seqRedisKey;
    private String redisLock;
    private String scene;
    private long step;
    private String desc;

    public String getSeqRedisKey() {
        return seqRedisKey;
    }

    public String getRedisLock() {
        return redisLock;
    }

    public String getScene() {
        return scene;
    }

    public long getStep() {
        return step;
    }

    public String getDesc() {
        return desc;
    }
}
