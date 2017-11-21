package com.supermarket.yun.slowloris.domain;

import java.util.Date;

public class Community {
    /**
     * 社区编码
     */
    private Integer id;

    /**
     * 社区名称
     */
    private String name;

    /**
     * 社区详细地址
     */
    private String address;

    /**
     * 社区坐标
     */
    private String coordinate;

    /**
     * 社区区域（天桥区、历城区）
     */
    private String area;

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
     * 状态标记（1：正常；2：删除）
     */
    private Integer flag;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 社区编码
     *
     * @return id 社区编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 社区编码
     *
     * @param id 社区编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 社区名称
     *
     * @return name 社区名称
     */
    public String getName() {
        return name;
    }

    /**
     * 社区名称
     *
     * @param name 社区名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 社区详细地址
     *
     * @return address 社区详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 社区详细地址
     *
     * @param address 社区详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 社区坐标
     *
     * @return coordinate 社区坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 社区坐标
     *
     * @param coordinate 社区坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 社区区域（天桥区、历城区）
     *
     * @return area 社区区域（天桥区、历城区）
     */
    public String getArea() {
        return area;
    }

    /**
     * 社区区域（天桥区、历城区）
     *
     * @param area 社区区域（天桥区、历城区）
     */
    public void setArea(String area) {
        this.area = area;
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