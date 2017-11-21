package com.supermarket.yun.slowloris.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    /**
     * 账单编码
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
     * 账单类型（1：自营 2：代理 3：全部）
     */
    private Integer billType;

    /**
     * 订单总数
     */
    private Integer orderNum;

    /**
     * 账单日期（2017-11-11）
     */
    private String billDate;

    /**
     * 总收入
     */
    private BigDecimal totalIncome;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 账单编码
     *
     * @return id 账单编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 账单编码
     *
     * @param id 账单编码
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
     * 账单类型（1：自营 2：代理 3：全部）
     *
     * @return bill_type 账单类型（1：自营 2：代理 3：全部）
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 账单类型（1：自营 2：代理 3：全部）
     *
     * @param billType 账单类型（1：自营 2：代理 3：全部）
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
     * 总收入
     *
     * @return total_income 总收入
     */
    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    /**
     * 总收入
     *
     * @param totalIncome 总收入
     */
    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
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