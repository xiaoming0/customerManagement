package com.kaamoo.customermanagement.entity;

import java.util.Date;

public class Enterprise {
    private Long id;

    private String name;

    private String address;

    private String memo;

    private Boolean allowOverdraw;

    private Long grade_id;

    private Date created;

    private Date updated;

    private Integer version;

    private String appKey;

    private Long companyId;

    private String companyName;

    private Double drawMoney;

    private Double nodrawMoney;

    private Double frozenMoney;

    private String grade_name;

    private Long drivingNumberTimes;

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Boolean getAllowOverdraw() {
        return allowOverdraw;
    }

    public void setAllowOverdraw(Boolean allowOverdraw) {
        this.allowOverdraw = allowOverdraw;
    }

    public Long getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Long grade_id) {
        this.grade_id = grade_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Double getDrawMoney() {
        return drawMoney;
    }

    public void setDrawMoney(Double drawMoney) {
        this.drawMoney = drawMoney;
    }

    public Double getNodrawMoney() {
        return nodrawMoney;
    }

    public void setNodrawMoney(Double nodrawMoney) {
        this.nodrawMoney = nodrawMoney;
    }

    public Double getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(Double frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public String getGrade_name() {
        return grade_name;
    }

    public void setGrade_name(String grade_name) {
        this.grade_name = grade_name == null ? null : grade_name.trim();
    }

    public Long getDrivingNumberTimes() {
        return drivingNumberTimes;
    }

    public void setDrivingNumberTimes(Long drivingNumberTimes) {
        this.drivingNumberTimes = drivingNumberTimes;
    }
}