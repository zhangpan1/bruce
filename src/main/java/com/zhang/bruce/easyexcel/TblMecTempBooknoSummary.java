package com.zhang.bruce.easyexcel;

/**
 * null
 *
 * @author wcyong
 *
 * @date 2024-07-27
 */
public class TblMecTempBooknoSummary {
    private Long id;

    private String mecNo;

    private String bookNo;

    private String bookNoAdvanceBankcardName;

    private String createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMecNo() {
        return mecNo;
    }

    public void setMecNo(String mecNo) {
        this.mecNo = mecNo == null ? null : mecNo.trim();
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo == null ? null : bookNo.trim();
    }

    public String getBookNoAdvanceBankcardName() {
        return bookNoAdvanceBankcardName;
    }

    public void setBookNoAdvanceBankcardName(String bookNoAdvanceBankcardName) {
        this.bookNoAdvanceBankcardName = bookNoAdvanceBankcardName == null ? null : bookNoAdvanceBankcardName.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }
}
