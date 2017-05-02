package com.kaamoo.customermanagement.entity;

import java.util.Date;

public class Customer {

    /**
     * Andriod设备
     */
    public static final String DEVICE_ANDROID = "ANDROID";
    /**
     * iOS设备
     */
    public static final String DEVICE_IOS = "IOS";

    /**
     * 个人
     */
    public static final Integer TYPE_PASSENGER = 0;

    /**
     * 企业
     */
    public static final Integer TYPE_ENTERPRISE = 1;

    /**
     * 客户推荐
     */
    public static final Integer INTRODUCE_TYPE_PASSENGER = 0;
    /**
     * 司机推荐
     */
    public static final Integer INTRODUCE_TYPE_DRIVER = 1;


    public static final String PASSENGER_CHANNEL_PHONE = "电话预约";
    public static final String PASSENGER_CHANNEL_APP = "APP预约";
    public static final String PASSENGER_CHANNEL_WEIXIN = "微信预约";
    public static final String PASSENGER_CHANNEL_WEB = "网站预约";
    public static final String PASSENGER_CHANNEL_BUDAN = "司机补单";
    public static final String PASSENGER_CHANNEL_MANAGER = "客户经理";
    public static final String PASSENGER_CHANNEL_INVITE = "推荐";
    public static final String PASSENGER_CHANNEL_ACTIVITY = "活动推广";


    private Long id;

    private String name;

    private String phone;

    private Boolean allowOverdraw;

    private Double drawMoney;

    private Double nodrawMoney;

    private Double frozenMoney;

    private Long enterpriseId;

    private String enterpriseName;

    private String plateNumber;

    private String photo;

    private Long gradeId;

    private String gradeName;

    private Boolean inBlackList;

    private Integer type;

    private String idcard;

    private Integer gender;

    private String email;

    private String memo;

    private Double latitude;

    private Double longitude;

    private String address;

    private Date created;

    private Date updated;

    private Integer version;

    private Long channelId;

    private String channelName;

    private String app_key;

    private Long companyId;

    private String companyName;

    private String introducer;

    private Integer introduceType;

    private Long drivingNumberTimes;

    private String deviceType;

    private String appVersion;

    private Double receiptMoney;

    private Double mileage;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Boolean getAllowOverdraw() {
        return allowOverdraw;
    }

    public void setAllowOverdraw(Boolean allowOverdraw) {
        this.allowOverdraw = allowOverdraw;
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

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Boolean getInBlackList() {
        return inBlackList;
    }

    public void setInBlackList(Boolean inBlackList) {
        this.inBlackList = inBlackList;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getApp_key() {
        return app_key;
    }

    public void setApp_key(String app_key) {
        this.app_key = app_key == null ? null : app_key.trim();
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

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public Integer getIntroduceType() {
        return introduceType;
    }

    public void setIntroduceType(Integer introduceType) {
        this.introduceType = introduceType;
    }

    public Long getDrivingNumberTimes() {
        return drivingNumberTimes;
    }

    public void setDrivingNumberTimes(Long drivingNumberTimes) {
        this.drivingNumberTimes = drivingNumberTimes;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public Double getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Double receiptMoney) {
        this.receiptMoney = receiptMoney;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
}