package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Address {
    /**
     * 地址编码
     */
    private Integer id;

    /**
     * 收货人
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 社区编码
     */
    private Integer communityId;

    /**
     * 社区名称
     */
    private String communityName;

    /**
     * 街道门牌号
     */
    private String street;

    /**
     * 默认地址
     */
    private Integer isDefault;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
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
     * 地址编码
     *
     * @return id 地址编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 地址编码
     *
     * @param id 地址编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 收货人
     *
     * @return name 收货人
     */
    public String getName() {
        return name;
    }

    /**
     * 收货人
     *
     * @param name 收货人
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 手机号
     *
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 省
     *
     * @return province 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 市
     *
     * @return city 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 区
     *
     * @return region 区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 区
     *
     * @param region 区
     */
    public void setRegion(String region) {
        this.region = region;
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
     * 街道门牌号
     *
     * @return street 街道门牌号
     */
    public String getStreet() {
        return street;
    }

    /**
     * 街道门牌号
     *
     * @param street 街道门牌号
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 默认地址
     *
     * @return is_default 默认地址
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 默认地址
     *
     * @param isDefault 默认地址
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 创建人
     *
     * @return create_by 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     *
     * @param createBy 创建人
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
     * 更新人
     *
     * @return update_by 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     *
     * @param updateBy 更新人
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
}