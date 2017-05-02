package com.kaamoo.customermanagement.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

public class CustomerGrade {
    private Long id;

    @NotEmpty(message = "等级名字不能为空")
    private String name;

    @NotEmpty(message = "appKey不能为空")
    private String appKey;

    private Date created;

    private Date updated;

    private Integer version;

    private Integer limitAmounts;

    @NotEmpty(message = "等级收费标识不能为空")
    private Long daijiaAreaId;

    private Boolean defaultGrade;

    @NotEmpty(message = "公司标识不能为空")
    private Long companyId;

    private String companyName;

    private Long parallelOrderNumber;

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

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
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

    public Integer getLimitAmounts() {
        return limitAmounts;
    }

    public void setLimitAmounts(Integer limitAmounts) {
        this.limitAmounts = limitAmounts;
    }

    public Long getDaijiaAreaId() {
        return daijiaAreaId;
    }

    public void setDaijiaAreaId(Long daijiaAreaId) {
        this.daijiaAreaId = daijiaAreaId;
    }

    public Boolean getDefaultGrade() {
        return defaultGrade;
    }

    public void setDefaultGrade(Boolean defaultGrade) {
        this.defaultGrade = defaultGrade;
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

    public Long getParallelOrderNumber() {
        return parallelOrderNumber;
    }

    public void setParallelOrderNumber(Long parallelOrderNumber) {
        this.parallelOrderNumber = parallelOrderNumber;
    }
}