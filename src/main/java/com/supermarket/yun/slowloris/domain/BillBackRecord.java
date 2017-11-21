package com.supermarket.yun.slowloris.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BillBackRecord {
    /**
     * 账单记录编码
     */
    private Integer id;

    /**
     * 订单号
     */
    private Integer orderId;

    /**
     * 订单类型（1：自营 2：代理）
     */
    private Integer orderType;

    /**
     * 账单金额
     */
    private BigDecimal billAmount;

    /**
     * 回款金额
     */
    private BigDecimal billBack;

    /**
     * 账单日期（2017-11-11）
     */
    private String billDate;

    /**
     * 签收时间
     */
    private Date signTime;

    /**
     * 商铺编码
     */
    private Integer shopId;

    /**
     * 商铺名称
     */
    private String shopName;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 账单记录编码
     *
     * @return id 账单记录编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 账单记录编码
     *
     * @param id 账单记录编码
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 订单类型（1：自营 2：代理）
     *
     * @return order_type 订单类型（1：自营 2：代理）
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 订单类型（1：自营 2：代理）
     *
     * @param orderType 订单类型（1：自营 2：代理）
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 账单金额
     *
     * @return bill_amount 账单金额
     */
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    /**
     * 账单金额
     *
     * @param billAmount 账单金额
     */
    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * 回款金额
     *
     * @return bill_back 回款金额
     */
    public BigDecimal getBillBack() {
        return billBack;
    }

    /**
     * 回款金额
     *
     * @param billBack 回款金额
     */
    public void setBillBack(BigDecimal billBack) {
        this.billBack = billBack;
    }

    /**
     * 账单日期（2017-11-11）
     *
     * @return bill_date 账单日期（2017-11-11）
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * 账单日期（2017-11-11）
     *
     * @param billDate 账单日期（2017-11-11）
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
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
}