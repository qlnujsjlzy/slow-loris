package com.supermarket.yun.slowloris.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BillBack {
    /**
     * 回账单编码
     */
    private Integer id;

    /**
     * 账单日期（2017-11-11）
     */
    private String billDate;

    /**
     * 商铺编码
     */
    private Integer shopId;

    /**
     * 商铺名称
     */
    private String shopName;

    /**
     * 账单总金额
     */
    private BigDecimal totalBill;

    /**
     * 总返款金额
     */
    private BigDecimal totalBack;

    /**
     * 账单类型（1：自营 2：代理 ）
     */
    private Integer billType;

    /**
     * 订单总数
     */
    private Integer orderNum;

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
     * 回账单编码
     *
     * @return id 回账单编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 回账单编码
     *
     * @param id 回账单编码
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 账单总金额
     *
     * @return total_bill 账单总金额
     */
    public BigDecimal getTotalBill() {
        return totalBill;
    }

    /**
     * 账单总金额
     *
     * @param totalBill 账单总金额
     */
    public void setTotalBill(BigDecimal totalBill) {
        this.totalBill = totalBill;
    }

    /**
     * 总返款金额
     *
     * @return total_back 总返款金额
     */
    public BigDecimal getTotalBack() {
        return totalBack;
    }

    /**
     * 总返款金额
     *
     * @param totalBack 总返款金额
     */
    public void setTotalBack(BigDecimal totalBack) {
        this.totalBack = totalBack;
    }

    /**
     * 账单类型（1：自营 2：代理 ）
     *
     * @return bill_type 账单类型（1：自营 2：代理 ）
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 账单类型（1：自营 2：代理 ）
     *
     * @param billType 账单类型（1：自营 2：代理 ）
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 订单总数
     *
     * @return order_num 订单总数
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 订单总数
     *
     * @param orderNum 订单总数
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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
}