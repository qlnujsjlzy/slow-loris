package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Product;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:446
     */
    @Delete({
            "delete from product",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:446
     */
    @Insert({
            "insert into product (name, introduction, ",
            "description, address, ",
            "bar_code, unit, thumbnail, ",
            "images, type, price, ",
            "market_price, refer_price, ",
            "shop_id, shop_name, ",
            "category_id, category_name, ",
            "audit_status, audit_time, ",
            "audit_by, status, ",
            "up_time, down_time, ",
            "operator, stock_num, ",
            "sales_num, hot_sell, ",
            "sort, create_by, ",
            "create_time, update_by, ",
            "update_time, remarks)",
            "values (#{name,jdbcType=VARCHAR}, #{introduction,jdbcType=VARCHAR}, ",
            "#{description,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
            "#{barCode,jdbcType=VARCHAR}, #{unit,jdbcType=VARCHAR}, #{thumbnail,jdbcType=VARCHAR}, ",
            "#{images,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, #{price,jdbcType=DECIMAL}, ",
            "#{marketPrice,jdbcType=DECIMAL}, #{referPrice,jdbcType=DECIMAL}, ",
            "#{shopId,jdbcType=INTEGER}, #{shopName,jdbcType=VARCHAR}, ",
            "#{categoryId,jdbcType=INTEGER}, #{categoryName,jdbcType=VARCHAR}, ",
            "#{auditStatus,jdbcType=INTEGER}, #{auditTime,jdbcType=TIMESTAMP}, ",
            "#{auditBy,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
            "#{upTime,jdbcType=TIMESTAMP}, #{downTime,jdbcType=TIMESTAMP}, ",
            "#{operator,jdbcType=VARCHAR}, #{stockNum,jdbcType=INTEGER}, ",
            "#{salesNum,jdbcType=INTEGER}, #{hotSell,jdbcType=INTEGER}, ",
            "#{sort,jdbcType=INTEGER}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Product record);

    /**
     * @mbg.generated 2017-11-13 51:21:446
     */
    @Select({
            "select",
            "id, name, introduction, description, address, bar_code, unit, thumbnail, images, ",
            "type, price, market_price, refer_price, shop_id, shop_name, category_id, category_name, ",
            "audit_status, audit_time, audit_by, status, up_time, down_time, operator, stock_num, ",
            "sales_num, hot_sell, sort, create_by, create_time, update_by, update_time, remarks",
            "from product",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "introduction", property = "introduction", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bar_code", property = "barCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "unit", property = "unit", jdbcType = JdbcType.VARCHAR),
            @Result(column = "thumbnail", property = "thumbnail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "images", property = "images", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "price", property = "price", jdbcType = JdbcType.DECIMAL),
            @Result(column = "market_price", property = "marketPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "refer_price", property = "referPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "category_id", property = "categoryId", jdbcType = JdbcType.INTEGER),
            @Result(column = "category_name", property = "categoryName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "audit_status", property = "auditStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "audit_time", property = "auditTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "audit_by", property = "auditBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "up_time", property = "upTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "down_time", property = "downTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "operator", property = "operator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "stock_num", property = "stockNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "sales_num", property = "salesNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "hot_sell", property = "hotSell", jdbcType = JdbcType.INTEGER),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    Product selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:446
     */
    @Select({
            "select",
            "id, name, introduction, description, address, bar_code, unit, thumbnail, images, ",
            "type, price, market_price, refer_price, shop_id, shop_name, category_id, category_name, ",
            "audit_status, audit_time, audit_by, status, up_time, down_time, operator, stock_num, ",
            "sales_num, hot_sell, sort, create_by, create_time, update_by, update_time, remarks",
            "from product"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "introduction", property = "introduction", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bar_code", property = "barCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "unit", property = "unit", jdbcType = JdbcType.VARCHAR),
            @Result(column = "thumbnail", property = "thumbnail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "images", property = "images", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "price", property = "price", jdbcType = JdbcType.DECIMAL),
            @Result(column = "market_price", property = "marketPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "refer_price", property = "referPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "category_id", property = "categoryId", jdbcType = JdbcType.INTEGER),
            @Result(column = "category_name", property = "categoryName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "audit_status", property = "auditStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "audit_time", property = "auditTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "audit_by", property = "auditBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "up_time", property = "upTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "down_time", property = "downTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "operator", property = "operator", jdbcType = JdbcType.VARCHAR),
            @Result(column = "stock_num", property = "stockNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "sales_num", property = "salesNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "hot_sell", property = "hotSell", jdbcType = JdbcType.INTEGER),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<Product> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:446
     */
    @Update({
            "update product",
            "set name = #{name,jdbcType=VARCHAR},",
            "introduction = #{introduction,jdbcType=VARCHAR},",
            "description = #{description,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "bar_code = #{barCode,jdbcType=VARCHAR},",
            "unit = #{unit,jdbcType=VARCHAR},",
            "thumbnail = #{thumbnail,jdbcType=VARCHAR},",
            "images = #{images,jdbcType=VARCHAR},",
            "type = #{type,jdbcType=INTEGER},",
            "price = #{price,jdbcType=DECIMAL},",
            "market_price = #{marketPrice,jdbcType=DECIMAL},",
            "refer_price = #{referPrice,jdbcType=DECIMAL},",
            "shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "category_id = #{categoryId,jdbcType=INTEGER},",
            "category_name = #{categoryName,jdbcType=VARCHAR},",
            "audit_status = #{auditStatus,jdbcType=INTEGER},",
            "audit_time = #{auditTime,jdbcType=TIMESTAMP},",
            "audit_by = #{auditBy,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "up_time = #{upTime,jdbcType=TIMESTAMP},",
            "down_time = #{downTime,jdbcType=TIMESTAMP},",
            "operator = #{operator,jdbcType=VARCHAR},",
            "stock_num = #{stockNum,jdbcType=INTEGER},",
            "sales_num = #{salesNum,jdbcType=INTEGER},",
            "hot_sell = #{hotSell,jdbcType=INTEGER},",
            "sort = #{sort,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Product record);
}