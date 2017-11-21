package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Cart {
    /**
     * 购物车编码
     */
    private Integer id;

    /**
     * 客户编码
     */
    private Integer buyerId;

    /**
     * 商品编码
     */
    private Integer productId;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 地址编码
     */
    private Integer addressId;

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
     * 状态标记（1：正常；2：删除）
     */
    private Integer flag;

    /**
     * 购物车编码
     *
     * @return id 购物车编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 购物车编码
     *
     * @param id 购物车编码
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
     * 购买数量
     *
     * @return num 购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 购买数量
     *
     * @param num 购买数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 地址编码
     *
     * @return address_id 地址编码
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 地址编码
     *
     * @param addressId 地址编码
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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