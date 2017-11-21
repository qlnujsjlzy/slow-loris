package com.supermarket.yun.slowloris.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    /**
     * 订单商品号
     */
    private Integer id;

    /**
     * 订单号
     */
    private Integer orderId;

    /**
     * 商品编码
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 购买数量
     */
    private Integer productNum;

    /**
     * 销售价
     */
    private BigDecimal productPrice;

    /**
     * 商品缩略图
     */
    private String thumbnail;

    /**
     * 商品类型（1：自营 2：代理）
     */
    private Integer productType;

    /**
     * 小计（单价*数量）
     */
    private BigDecimal subtotal;

    /**
     * 订单商品排序号
     */
    private Integer itemSort;

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
     * 订单商品号
     *
     * @return id 订单商品号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单商品号
     *
     * @param id 订单商品号
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
     * 商品编码
     *
     * @return product_id 商品编码
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 商品编码
     *
     * @param productId 商品编码
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 商品名称
     *
     * @return product_name 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 购买数量
     *
     * @return product_num 购买数量
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * 购买数量
     *
     * @param productNum 购买数量
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * 销售价
     *
     * @return product_price 销售价
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 销售价
     *
     * @param productPrice 销售价
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 商品缩略图
     *
     * @return thumbnail 商品缩略图
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 商品缩略图
     *
     * @param thumbnail 商品缩略图
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 商品类型（1：自营 2：代理）
     *
     * @return product_type 商品类型（1：自营 2：代理）
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 商品类型（1：自营 2：代理）
     *
     * @param productType 商品类型（1：自营 2：代理）
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 小计（单价*数量）
     *
     * @return subtotal 小计（单价*数量）
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * 小计（单价*数量）
     *
     * @param subtotal 小计（单价*数量）
     */
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * 订单商品排序号
     *
     * @return item_sort 订单商品排序号
     */
    public Integer getItemSort() {
        return itemSort;
    }

    /**
     * 订单商品排序号
     *
     * @param itemSort 订单商品排序号
     */
    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
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