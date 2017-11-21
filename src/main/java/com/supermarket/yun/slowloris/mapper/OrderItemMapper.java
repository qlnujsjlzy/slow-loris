package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.OrderItem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:350
     */
    @Delete({
            "delete from order_item",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:350
     */
    @Insert({
            "insert into order_item (order_id, product_id, ",
            "product_name, product_num, ",
            "product_price, thumbnail, ",
            "product_type, subtotal, ",
            "item_sort, shop_id, ",
            "shop_name, create_by, ",
            "create_time, update_by, ",
            "update_time, remarks)",
            "values (#{orderId,jdbcType=INTEGER}, #{productId,jdbcType=INTEGER}, ",
            "#{productName,jdbcType=VARCHAR}, #{productNum,jdbcType=INTEGER}, ",
            "#{productPrice,jdbcType=DECIMAL}, #{thumbnail,jdbcType=VARCHAR}, ",
            "#{productType,jdbcType=INTEGER}, #{subtotal,jdbcType=DECIMAL}, ",
            "#{itemSort,jdbcType=INTEGER}, #{shopId,jdbcType=INTEGER}, ",
            "#{shopName,jdbcType=VARCHAR}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(OrderItem record);

    /**
     * @mbg.generated 2017-11-13 51:21:350
     */
    @Select({
            "select",
            "id, order_id, product_id, product_name, product_num, product_price, thumbnail, ",
            "product_type, subtotal, item_sort, shop_id, shop_name, create_by, create_time, ",
            "update_by, update_time, remarks",
            "from order_item",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "order_id", property = "orderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_id", property = "productId", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_name", property = "productName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_num", property = "productNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_price", property = "productPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "thumbnail", property = "thumbnail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_type", property = "productType", jdbcType = JdbcType.INTEGER),
            @Result(column = "subtotal", property = "subtotal", jdbcType = JdbcType.DECIMAL),
            @Result(column = "item_sort", property = "itemSort", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:350
     */
    @Select({
            "select",
            "id, order_id, product_id, product_name, product_num, product_price, thumbnail, ",
            "product_type, subtotal, item_sort, shop_id, shop_name, create_by, create_time, ",
            "update_by, update_time, remarks",
            "from order_item"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "order_id", property = "orderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_id", property = "productId", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_name", property = "productName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_num", property = "productNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_price", property = "productPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "thumbnail", property = "thumbnail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "product_type", property = "productType", jdbcType = JdbcType.INTEGER),
            @Result(column = "subtotal", property = "subtotal", jdbcType = JdbcType.DECIMAL),
            @Result(column = "item_sort", property = "itemSort", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<OrderItem> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:350
     */
    @Update({
            "update order_item",
            "set order_id = #{orderId,jdbcType=INTEGER},",
            "product_id = #{productId,jdbcType=INTEGER},",
            "product_name = #{productName,jdbcType=VARCHAR},",
            "product_num = #{productNum,jdbcType=INTEGER},",
            "product_price = #{productPrice,jdbcType=DECIMAL},",
            "thumbnail = #{thumbnail,jdbcType=VARCHAR},",
            "product_type = #{productType,jdbcType=INTEGER},",
            "subtotal = #{subtotal,jdbcType=DECIMAL},",
            "item_sort = #{itemSort,jdbcType=INTEGER},",
            "shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OrderItem record);
}