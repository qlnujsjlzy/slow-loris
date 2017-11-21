package com.supermarket.yun.slowloris.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     * 商品编码
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品简介
     */
    private String introduction;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品产地
     */
    private String address;

    /**
     * 条形码
     */
    private String barCode;

    /**
     * 单位
     */
    private String unit;

    /**
     * 商品缩略图
     */
    private String thumbnail;

    /**
     * 图片地址（轮播图地址-逗号分隔）
     */
    private String images;

    /**
     * 商品类型（1：自营 2：代理）
     */
    private Integer type;

    /**
     * 销售价
     */
    private BigDecimal price;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 参考价
     */
    private BigDecimal referPrice;

    /**
     * 商铺编码
     */
    private Integer shopId;

    /**
     * 商铺名称
     */
    private String shopName;

    /**
     * 商品分类编码
     */
    private Integer categoryId;

    /**
     * 商品分类名称
     */
    private String categoryName;

    /**
     * 审核状态（0：待审核 1：审核通过 2：审核驳回）
     */
    private Integer auditStatus;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核人
     */
    private String auditBy;

    /**
     * 状态（0：待上架 1：上架/生效 2：下架/失效）
     */
    private Integer status;

    /**
     * 上架时间
     */
    private Date upTime;

    /**
     * 下架时间
     */
    private Date downTime;

    /**
     * 上下架操作人
     */
    private String operator;

    /**
     * 库存数
     */
    private Integer stockNum;

    /**
     * 销售量
     */
    private Integer salesNum;

    /**
     * 热销度
     */
    private Integer hotSell;

    /**
     * 排序
     */
    private Integer sort;

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
     * 商品编码
     *
     * @return id 商品编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商品编码
     *
     * @param id 商品编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品名称
     *
     * @return name 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 商品简介
     *
     * @return introduction 商品简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 商品简介
     *
     * @param introduction 商品简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 商品描述
     *
     * @return description 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 商品描述
     *
     * @param description 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 商品产地
     *
     * @return address 商品产地
     */
    public String getAddress() {
        return address;
    }

    /**
     * 商品产地
     *
     * @param address 商品产地
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 条形码
     *
     * @return bar_code 条形码
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 条形码
     *
     * @param barCode 条形码
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * 单位
     *
     * @return unit 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
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
     * 图片地址（轮播图地址-逗号分隔）
     *
     * @return images 图片地址（轮播图地址-逗号分隔）
     */
    public String getImages() {
        return images;
    }

    /**
     * 图片地址（轮播图地址-逗号分隔）
     *
     * @param images 图片地址（轮播图地址-逗号分隔）
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * 商品类型（1：自营 2：代理）
     *
     * @return type 商品类型（1：自营 2：代理）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 商品类型（1：自营 2：代理）
     *
     * @param type 商品类型（1：自营 2：代理）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 销售价
     *
     * @return price 销售价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 销售价
     *
     * @param price 销售价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 市场价
     *
     * @return market_price 市场价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 市场价
     *
     * @param marketPrice 市场价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 参考价
     *
     * @return refer_price 参考价
     */
    public BigDecimal getReferPrice() {
        return referPrice;
    }

    /**
     * 参考价
     *
     * @param referPrice 参考价
     */
    public void setReferPrice(BigDecimal referPrice) {
        this.referPrice = referPrice;
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
     * 商品分类编码
     *
     * @return category_id 商品分类编码
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 商品分类编码
     *
     * @param categoryId 商品分类编码
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 商品分类名称
     *
     * @return category_name 商品分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 商品分类名称
     *
     * @param categoryName 商品分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 审核状态（0：待审核 1：审核通过 2：审核驳回）
     *
     * @return audit_status 审核状态（0：待审核 1：审核通过 2：审核驳回）
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态（0：待审核 1：审核通过 2：审核驳回）
     *
     * @param auditStatus 审核状态（0：待审核 1：审核通过 2：审核驳回）
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 审核时间
     *
     * @return audit_time 审核时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 审核时间
     *
     * @param auditTime 审核时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 审核人
     *
     * @return audit_by 审核人
     */
    public String getAuditBy() {
        return auditBy;
    }

    /**
     * 审核人
     *
     * @param auditBy 审核人
     */
    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy;
    }

    /**
     * 状态（0：待上架 1：上架/生效 2：下架/失效）
     *
     * @return status 状态（0：待上架 1：上架/生效 2：下架/失效）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0：待上架 1：上架/生效 2：下架/失效）
     *
     * @param status 状态（0：待上架 1：上架/生效 2：下架/失效）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 上架时间
     *
     * @return up_time 上架时间
     */
    public Date getUpTime() {
        return upTime;
    }

    /**
     * 上架时间
     *
     * @param upTime 上架时间
     */
    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    /**
     * 下架时间
     *
     * @return down_time 下架时间
     */
    public Date getDownTime() {
        return downTime;
    }

    /**
     * 下架时间
     *
     * @param downTime 下架时间
     */
    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    /**
     * 上下架操作人
     *
     * @return operator 上下架操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 上下架操作人
     *
     * @param operator 上下架操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 库存数
     *
     * @return stock_num 库存数
     */
    public Integer getStockNum() {
        return stockNum;
    }

    /**
     * 库存数
     *
     * @param stockNum 库存数
     */
    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    /**
     * 销售量
     *
     * @return sales_num 销售量
     */
    public Integer getSalesNum() {
        return salesNum;
    }

    /**
     * 销售量
     *
     * @param salesNum 销售量
     */
    public void setSalesNum(Integer salesNum) {
        this.salesNum = salesNum;
    }

    /**
     * 热销度
     *
     * @return hot_sell 热销度
     */
    public Integer getHotSell() {
        return hotSell;
    }

    /**
     * 热销度
     *
     * @param hotSell 热销度
     */
    public void setHotSell(Integer hotSell) {
        this.hotSell = hotSell;
    }

    /**
     * 排序
     *
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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