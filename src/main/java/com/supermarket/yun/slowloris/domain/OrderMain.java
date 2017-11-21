package com.supermarket.yun.slowloris.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderMain {
    /**
     * 订单号
     */
    private Integer id;

    /**
     * 客户编码
     */
    private Integer buyerId;

    /**
     * 商铺编码
     */
    private Integer shopId;

    /**
     * 商铺名称
     */
    private String shopName;

    /**
     * 支付方式（1:微信 2：支付宝）
     */
    private Integer payment;

    /**
     * 配送方式（1:自提 2：配送）
     */
    private Integer deliveryType;

    /**
     * 自提人/收货人名称
     */
    private String consigneeName;

    /**
     * 自提人/收货人手机号
     */
    private String consigneePhone;

    /**
     * 收货人地址详情
     */
    private String consigneeAddress;

    /**
     * 自提验证码
     */
    private String verificationCode;

    /**
     * 订单备注
     */
    private String orderComment;

    /**
     * 配送费
     */
    private BigDecimal shippingFee;

    /**
     * 订单应付金额
     */
    private BigDecimal totalPay;

    /**
     * 订单总成本
     */
    private BigDecimal totalCost;

    /**
     * 支付回调实际支付金额
     */
    private BigDecimal payPrice;

    /**
     * 支付状态（0：未支付 1：已支付）
     */
    private Integer payStatus;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付交易号
     */
    private String payTransaction;

    /**
     * 支付对账流水号
     */
    private String payCheck;

    /**
     * 订单状态（-1：取消订单 0：待收货 1：待提货 2：:已签收）
     */
    private Integer orderStatus;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 取消时间
     */
    private Date cancelTime;

    /**
     * 取消人
     */
    private String cancelBy;

    /**
     * 签收时间
     */
    private Date signTime;

    /**
     * 签收人
     */
    private String signBy;

    /**
     * 拆单转移(0：待拆单转移 1：拆单转移成功)
     */
    private Integer splitTransfer;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 订单号
     *
     * @return id 订单号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单号
     *
     * @param id 订单号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 客户编码
     *
     * @return buyer_id 客户编码
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 客户编码
     *
     * @param buyerId 客户编码
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
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
     * 支付方式（1:微信 2：支付宝）
     *
     * @return payment 支付方式（1:微信 2：支付宝）
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * 支付方式（1:微信 2：支付宝）
     *
     * @param payment 支付方式（1:微信 2：支付宝）
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
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
     * 自提人/收货人名称
     *
     * @return consignee_name 自提人/收货人名称
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * 自提人/收货人名称
     *
     * @param consigneeName 自提人/收货人名称
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    /**
     * 自提人/收货人手机号
     *
     * @return consignee_phone 自提人/收货人手机号
     */
    public String getConsigneePhone() {
        return consigneePhone;
    }

    /**
     * 自提人/收货人手机号
     *
     * @param consigneePhone 自提人/收货人手机号
     */
    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    /**
     * 收货人地址详情
     *
     * @return consignee_address 收货人地址详情
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * 收货人地址详情
     *
     * @param consigneeAddress 收货人地址详情
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    /**
     * 自提验证码
     *
     * @return verification_code 自提验证码
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * 自提验证码
     *
     * @param verificationCode 自提验证码
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    /**
     * 订单备注
     *
     * @return order_comment 订单备注
     */
    public String getOrderComment() {
        return orderComment;
    }

    /**
     * 订单备注
     *
     * @param orderComment 订单备注
     */
    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    /**
     * 配送费
     *
     * @return shipping_fee 配送费
     */
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    /**
     * 配送费
     *
     * @param shippingFee 配送费
     */
    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    /**
     * 订单应付金额
     *
     * @return total_pay 订单应付金额
     */
    public BigDecimal getTotalPay() {
        return totalPay;
    }

    /**
     * 订单应付金额
     *
     * @param totalPay 订单应付金额
     */
    public void setTotalPay(BigDecimal totalPay) {
        this.totalPay = totalPay;
    }

    /**
     * 订单总成本
     *
     * @return total_cost 订单总成本
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * 订单总成本
     *
     * @param totalCost 订单总成本
     */
    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 支付回调实际支付金额
     *
     * @return pay_price 支付回调实际支付金额
     */
    public BigDecimal getPayPrice() {
        return payPrice;
    }

    /**
     * 支付回调实际支付金额
     *
     * @param payPrice 支付回调实际支付金额
     */
    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    /**
     * 支付状态（0：未支付 1：已支付）
     *
     * @return pay_status 支付状态（0：未支付 1：已支付）
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 支付状态（0：未支付 1：已支付）
     *
     * @param payStatus 支付状态（0：未支付 1：已支付）
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 支付时间
     *
     * @return pay_time 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 支付交易号
     *
     * @return pay_transaction 支付交易号
     */
    public String getPayTransaction() {
        return payTransaction;
    }

    /**
     * 支付交易号
     *
     * @param payTransaction 支付交易号
     */
    public void setPayTransaction(String payTransaction) {
        this.payTransaction = payTransaction;
    }

    /**
     * 支付对账流水号
     *
     * @return pay_check 支付对账流水号
     */
    public String getPayCheck() {
        return payCheck;
    }

    /**
     * 支付对账流水号
     *
     * @param payCheck 支付对账流水号
     */
    public void setPayCheck(String payCheck) {
        this.payCheck = payCheck;
    }

    /**
     * 订单状态（-1：取消订单 0：待收货 1：待提货 2：:已签收）
     *
     * @return order_status 订单状态（-1：取消订单 0：待收货 1：待提货 2：:已签收）
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态（-1：取消订单 0：待收货 1：待提货 2：:已签收）
     *
     * @param orderStatus 订单状态（-1：取消订单 0：待收货 1：待提货 2：:已签收）
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
     * 取消时间
     *
     * @return cancel_time 取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 取消时间
     *
     * @param cancelTime 取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 取消人
     *
     * @return cancel_by 取消人
     */
    public String getCancelBy() {
        return cancelBy;
    }

    /**
     * 取消人
     *
     * @param cancelBy 取消人
     */
    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
    }

    /**
     * 签收时间
     *
     * @return sign_time 签收时间
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 签收时间
     *
     * @param signTime 签收时间
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * 签收人
     *
     * @return sign_by 签收人
     */
    public String getSignBy() {
        return signBy;
    }

    /**
     * 签收人
     *
     * @param signBy 签收人
     */
    public void setSignBy(String signBy) {
        this.signBy = signBy;
    }

    /**
     * 拆单转移(0：待拆单转移 1：拆单转移成功)
     *
     * @return split_transfer 拆单转移(0：待拆单转移 1：拆单转移成功)
     */
    public Integer getSplitTransfer() {
        return splitTransfer;
    }

    /**
     * 拆单转移(0：待拆单转移 1：拆单转移成功)
     *
     * @param splitTransfer 拆单转移(0：待拆单转移 1：拆单转移成功)
     */
    public void setSplitTransfer(Integer splitTransfer) {
        this.splitTransfer = splitTransfer;
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
     * 版本号
     *
     * @return version 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
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