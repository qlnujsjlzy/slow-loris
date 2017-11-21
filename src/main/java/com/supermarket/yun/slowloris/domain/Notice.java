package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Notice {
    /**
     * 通知编码
     */
    private Integer id;

    /**
     * 商铺编码
     */
    private Integer shopId;

    /**
     * 商铺名称
     */
    private String shopName;

    /**
     * 订单号
     */
    private Integer orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 配送方式（1:自提 2：配送）
     */
    private Integer deliveryType;

    /**
     * 查看方式（0: 未读 1：已读）
     */
    private Integer readStatus;

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
     * 备注信息
     */
    private String remarks;

    /**
     * 通知编码
     *
     * @return id 通知编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 通知编码
     *
     * @param id 通知编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商铺编码
     *
     * @return shop_id 商铺编码
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 商铺编码
     *
     * @param shopId 商铺编码
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 商铺名称
     *
     * @return shop_name 商铺名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 商铺名称
     *
     * @param shopName 商铺名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 订单号
     *
     * @return order_id 订单号
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 下单时间
     *
     * @return order_time 下单时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 下单时间
     *
     * @param orderTime 下单时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 配送方式（1:自提 2：配送）
     *
     * @return delivery_type 配送方式（1:自提 2：配送）
     */
    public Integer getDeliveryType() {
        return deliveryType;
    }

    /**
     * 配送方式（1:自提 2：配送）
     *
     * @param deliveryType 配送方式（1:自提 2：配送）
     */
    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * 查看方式（0: 未读 1：已读）
     *
     * @return read_status 查看方式（0: 未读 1：已读）
     */
    public Integer getReadStatus() {
        return readStatus;
    }

    /**
     * 查看方式（0: 未读 1：已读）
     *
     * @param readStatus 查看方式（0: 未读 1：已读）
     */
    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
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