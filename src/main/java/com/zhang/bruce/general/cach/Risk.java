package com.zhang.bruce.general.cach;

import com.tcredit.streaming.bean.NotifyPolicy;
import com.tcredit.streaming.bean.VerifyPolicy;
import com.tcredit.streaming.core.bean.HandleStrategy;
import com.tcredit.streaming.core.bean.NotifiedParty;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/12 17:31
 * @Description:
 */
public class Risk implements Serializable {
    private static final long serialVersionUID = 1L;
    public String comments;
    public Date createTime;
    public Map<String, Object> customization;
    public NotifyPolicy notifyPolicy;
    public String riskType;
    public String ruleName;
    public String rulePackageName;
    public Double score;
    public String uuid;
    public VerifyPolicy verifyPolicy;
    public Double weight;
    public HandleStrategy handleStrategy;
    public NotifiedParty notifiedParty;
    public int indate;
    public List<VerifyPolicy> verifyPolicyList;

    public Risk() {
        this((String)null, 0, 1, new Date());
    }

    public Risk(String uuid) {
        this();
        this.setUuid(uuid);
    }

    public Risk(String ruleName, int score, int weight, Date date) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setScore(score);
        this.setWeight(weight);
        this.setCreateTime(date);
    }

    public Risk(String ruleName, int score, Date date) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setScore(score);
        this.setCreateTime(date);
    }

    public Risk(String ruleName, String rulePackageName, int score, int weight, String comments, NotifyPolicy notifyPolicy, VerifyPolicy verifyPolicy) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setRulePackageName(rulePackageName);
        this.setScore(score);
        this.setWeight(weight);
        this.setComments(comments);
        this.setNotifyPolicy(notifyPolicy);
        this.setVerifyPolicy(verifyPolicy);
        this.setCreateTime(new Date());
    }

    public Risk(String ruleName, String rulePackageName, int score, int weight, String comments, NotifyPolicy notifyPolicy, VerifyPolicy verifyPolicy, String strArr) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setRulePackageName(rulePackageName);
        this.setScore(score);
        this.setWeight(weight);
        this.setComments(comments);
        this.setNotifyPolicy(notifyPolicy);
        this.setVerifyPolicy(verifyPolicy);
        this.setRiskType(strArr);
        this.setCreateTime(new Date());
    }

    public Risk(String ruleName, String rulePackageName, int score, int weight, String comments, NotifiedParty notifiedParty, HandleStrategy handleStrategy, NotifyPolicy notifyPolicy, VerifyPolicy verifyPolicy) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setRulePackageName(rulePackageName);
        this.setScore(score);
        this.setWeight(weight);
        this.setComments(comments);
        this.setNotifyPolicy(notifyPolicy);
        this.setVerifyPolicy(verifyPolicy);
        this.setNotifiedParty(notifiedParty);
        this.setHandleStrategy(handleStrategy);
        this.setCreateTime(new Date());
    }

    public Risk(String ruleName, String rulePackageName, int score, int weight, String comments, NotifiedParty notifiedParty, HandleStrategy handleStrategy, NotifyPolicy notifyPolicy, VerifyPolicy verifyPolicy, String strArr) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setRulePackageName(rulePackageName);
        this.setScore(score);
        this.setWeight(weight);
        this.setComments(comments);
        this.setNotifyPolicy(notifyPolicy);
        this.setVerifyPolicy(verifyPolicy);
        this.setNotifiedParty(notifiedParty);
        this.setHandleStrategy(handleStrategy);
        this.setRiskType(strArr);
        this.setCreateTime(new Date());
    }

    public Risk(String ruleName, String rulePackageName, int score, int weight, int indate, String comments, NotifiedParty notifiedParty, HandleStrategy handleStrategy) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setRulePackageName(rulePackageName);
        this.setScore(score);
        this.setWeight(weight);
        this.setComments(comments);
        this.setNotifiedParty(notifiedParty);
        this.setHandleStrategy(handleStrategy);
        this.setIndate(indate);
        this.setCreateTime(new Date());
    }

    public Risk(String ruleName, String rulePackageName, int score, int weight, int indate, String comments, NotifiedParty notifiedParty, HandleStrategy handleStrategy, String strArr) {
        this.score = 0.0D;
        this.customization = new HashMap();
        this.weight = 1.0D;
        this.setRuleName(ruleName);
        this.setRulePackageName(rulePackageName);
        this.setScore(score);
        this.setWeight(weight);
        this.setComments(comments);
        this.setNotifiedParty(notifiedParty);
        this.setHandleStrategy(handleStrategy);
        this.setIndate(indate);
        this.setRiskType(strArr);
        this.setCreateTime(new Date());
    }

    public Risk(String ruleName, String rulePackageName, int score, String comments, NotifyPolicy notifyPolicy, VerifyPolicy verifyPolicy, String strArr) {
        this(ruleName, rulePackageName, score, 1, comments, notifyPolicy, verifyPolicy, strArr);
    }

    public Map<String, Object> custom() {
        return this.customization;
    }

    public String getComments() {
        return this.comments;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public NotifyPolicy getNotifyPolicy() {
        return this.notifyPolicy;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public String getRulePackageName() {
        return this.rulePackageName;
    }

    public Double getScore() {
        return this.score;
    }

    public String getUuid() {
        return this.uuid;
    }

    public VerifyPolicy getVerifyPolicy() {
        return this.verifyPolicy;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCreateTime(Date date) {
        this.createTime = date;
    }

    public void setNotifyPolicy(NotifyPolicy notifyPolicy) {
        this.notifyPolicy = notifyPolicy;
    }

    public String getRiskType() {
        return this.riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public void setRulePackageName(String rulePackageName) {
        this.rulePackageName = rulePackageName;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setScore(Integer num) {
        this.score = num.doubleValue();
    }

    public void setUuid(Object uuid) {
        this.uuid = uuid.toString();
    }

    public void setVerifyPolicy(VerifyPolicy verifyPolicy) {
        this.verifyPolicy = verifyPolicy;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight.doubleValue();
    }

    public Map<String, Object> getCustomization() {
        return this.customization;
    }

    public void setCustomization(Map<String, Object> customization) {
        this.customization = customization;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public HandleStrategy getHandleStrategy() {
        return this.handleStrategy;
    }

    public void setHandleStrategy(HandleStrategy handleStrategy) {
        this.handleStrategy = handleStrategy;
    }

    public NotifiedParty getNotifiedParty() {
        return this.notifiedParty;
    }

    public void setNotifiedParty(NotifiedParty notifiedParty) {
        this.notifiedParty = notifiedParty;
    }

    public int getIndate() {
        return this.indate;
    }

    public void setIndate(int indate) {
        this.indate = indate;
    }

    public List<VerifyPolicy> getVerifyPolicyList() {
        return this.verifyPolicyList;
    }

    public void setVerifyPolicyList(List<VerifyPolicy> verifyPolicyList) {
        this.verifyPolicyList = verifyPolicyList;
    }

    @Override
    public String toString() {
        return "Risk [comments=" + this.comments + ", createTime=" + this.createTime + ", customization=" + this.customization + ", notifyPolicy=" + this.notifyPolicy + ", riskType=" + this.riskType + ", ruleName=" + this.ruleName + ", rulePackageName=" + this.rulePackageName + ", score=" + this.score + ", uuid=" + this.uuid + ", verifyPolicy=" + this.verifyPolicy + ", weight=" + this.weight + ", handleStrategy=" + this.handleStrategy + ", notifiedParty=" + this.notifiedParty + ", indate=" + this.indate + ", verifyPolicyList=" + this.verifyPolicyList + "]";
    }
}
