package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Shop {
    /**
     * 商铺编码
     */
    private Integer id;

    /**
     * 社区编码
     */
    private Integer communityId;

    /**
     * 社区名称
     */
    private String communityName;

    /**
     * 商铺名称
     */
    private String name;

    /**
     * 商铺详细地址
     */
    private String address;

    /**
     * 社区坐标
     */
    private String coordinate;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系人手机号
     */
    private String phone;

    /**
     * 营业时间（8:00-21:00）
     */
    private String shopHours;

    /**
     * 信用度
     */
    private Integer creditLine;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 食品流通许可证
     */
    private String foodDistributionLicense;

    /**
     * 对公开户银行
     */
    private String bankName;

    /**
     * 对公银行账号
     */
    private String bankCode;

    /**
     * 审核状态（0：待审核状态 1：审核通过 2：审核驳回）
     */
    private Integer auditStatus;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态标记（1：正常；2：删除）
     */
    private Integer flag;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 商铺编码
     *
     * @return id 商铺编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商铺编码
     *
     * @param id 商铺编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 社区编码
     *
     * @return community_id 社区编码
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * 社区编码
     *
     * @param communityId 社区编码
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * 社区名称
     *
     * @return community_name 社区名称
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * 社区名称
     *
     * @param communityName 社区名称
     */
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    /**
     * 商铺名称
     *
     * @return name 商铺名称
     */
    public String getName() {
        return name;
    }

    /**
     * 商铺名称
     *
     * @param name 商铺名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 商铺详细地址
     *
     * @return address 商铺详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 商铺详细地址
     *
     * @param address 商铺详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 社区坐标
     *
     * @return coordinate 社区坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 社区坐标
     *
     * @param coordinate 社区坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 联系人
     *
     * @return contacts 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 联系人手机号
     *
     * @return phone 联系人手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系人手机号
     *
     * @param phone 联系人手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 营业时间（8:00-21:00）
     *
     * @return shop_hours 营业时间（8:00-21:00）
     */
    public String getShopHours() {
        return shopHours;
    }

    /**
     * 营业时间（8:00-21:00）
     *
     * @param shopHours 营业时间（8:00-21:00）
     */
    public void setShopHours(String shopHours) {
        this.shopHours = shopHours;
    }

    /**
     * 信用度
     *
     * @return credit_line 信用度
     */
    public Integer getCreditLine() {
        return creditLine;
    }

    /**
     * 信用度
     *
     * @param creditLine 信用度
     */
    public void setCreditLine(Integer creditLine) {
        this.creditLine = creditLine;
    }

    /**
     * 营业执照
     *
     * @return business_license 营业执照
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 营业执照
     *
     * @param businessLicense 营业执照
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * 食品流通许可证
     *
     * @return food_distribution_license 食品流通许可证
     */
    public String getFoodDistributionLicense() {
        return foodDistributionLicense;
    }

    /**
     * 食品流通许可证
     *
     * @param foodDistributionLicense 食品流通许可证
     */
    public void setFoodDistributionLicense(String foodDistributionLicense) {
        this.foodDistributionLicense = foodDistributionLicense;
    }

    /**
     * 对公开户银行
     *
     * @return bank_name 对公开户银行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 对公开户银行
     *
     * @param bankName 对公开户银行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 对公银行账号
     *
     * @return bank_code 对公银行账号
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 对公银行账号
     *
     * @param bankCode 对公银行账号
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 审核状态（0：待审核状态 1：审核通过 2：审核驳回）
     *
     * @return audit_status 审核状态（0：待审核状态 1：审核通过 2：审核驳回）
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态（0：待审核状态 1：审核通过 2：审核驳回）
     *
     * @param auditStatus 审核状态（0：待审核状态 1：审核通过 2：审核驳回）
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 创建者
     *
     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     *
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新者
     *
     * @return update_by 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     *
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 状态标记（1：正常；2：删除）
     *
     * @return flag 状态标记（1：正常；2：删除）
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 状态标记（1：正常；2：删除）
     *
     * @param flag 状态标记（1：正常；2：删除）
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 备注信息
     *
     * @return remarks 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}