package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Category {
    /**
     * 商品分类编码
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类图片
     */
    private String image;

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
     * 启用状态（1：启用 2：禁用）
     */
    private Integer status;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 商品分类编码
     *
     * @return id 商品分类编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商品分类编码
     *
     * @param id 商品分类编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 分类名称
     *
     * @return name 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 分类图片
     *
     * @return image 分类图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 分类图片
     *
     * @param image 分类图片
     */
    public void setImage(String image) {
        this.image = image;
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
     * 启用状态（1：启用 2：禁用）
     *
     * @return status 启用状态（1：启用 2：禁用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 启用状态（1：启用 2：禁用）
     *
     * @param status 启用状态（1：启用 2：禁用）
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