package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Buyer {
    /**
     * 客户编码
     */
    private Integer id;

    /**
     * 微信编码
     */
    private String wechatId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 头像地址
     */
    private String image;

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
     * 状态（1：微信关注 2：取消关注）
     */
    private Integer status;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 客户编码
     *
     * @return id 客户编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 客户编码
     *
     * @param id 客户编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 微信编码
     *
     * @return wechat_id 微信编码
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * 微信编码
     *
     * @param wechatId 微信编码
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    /**
     * 昵称
     *
     * @return nick_name 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
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
     * 盐值
     *
     * @return salt 盐值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐值
     *
     * @param salt 盐值
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 头像地址
     *
     * @return image 头像地址
     */
    public String getImage() {
        return image;
    }

    /**
     * 头像地址
     *
     * @param image 头像地址
     */
    public void setImage(String image) {
        this.image = image;
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
     * 状态（1：微信关注 2：取消关注）
     *
     * @return status 状态（1：微信关注 2：取消关注）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（1：微信关注 2：取消关注）
     *
     * @param status 状态（1：微信关注 2：取消关注）
     */
    public void setStatus(Integer status) {
        this.status = status;
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