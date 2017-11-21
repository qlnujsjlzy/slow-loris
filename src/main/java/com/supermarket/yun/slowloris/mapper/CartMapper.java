package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Cart;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface CartMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:253
     */
    @Delete({
            "delete from cart",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:253
     */
    @Insert({
            "insert into cart (buyer_id, product_id, ",
            "num, address_id, ",
            "shop_id, shop_name, ",
            "create_by, create_time, ",
            "update_by, update_time, ",
            "flag)",
            "values (#{buyerId,jdbcType=INTEGER}, #{productId,jdbcType=INTEGER}, ",
            "#{num,jdbcType=INTEGER}, #{addressId,jdbcType=INTEGER}, ",
            "#{shopId,jdbcType=INTEGER}, #{shopName,jdbcType=VARCHAR}, ",
            "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
            "#{flag,jdbcType=INTEGER})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Cart record);

    /**
     * @mbg.generated 2017-11-13 51:21:253
     */
    @Select({
            "select",
            "id, buyer_id, product_id, num, address_id, shop_id, shop_name, create_by, create_time, ",
            "update_by, update_time, flag",
            "from cart",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "buyer_id", property = "buyerId", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_id", property = "productId", jdbcType = JdbcType.INTEGER),
            @Result(column = "num", property = "num", jdbcType = JdbcType.INTEGER),
            @Result(column = "address_id", property = "addressId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER)
    })
    Cart selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:253
     */
    @Select({
            "select",
            "id, buyer_id, product_id, num, address_id, shop_id, shop_name, create_by, create_time, ",
            "update_by, update_time, flag",
            "from cart"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "buyer_id", property = "buyerId", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_id", property = "productId", jdbcType = JdbcType.INTEGER),
            @Result(column = "num", property = "num", jdbcType = JdbcType.INTEGER),
            @Result(column = "address_id", property = "addressId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER)
    })
    List<Cart> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:253
     */
    @Update({
            "update cart",
            "set buyer_id = #{buyerId,jdbcType=INTEGER},",
            "product_id = #{productId,jdbcType=INTEGER},",
            "num = #{num,jdbcType=INTEGER},",
            "address_id = #{addressId,jdbcType=INTEGER},",
            "shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "flag = #{flag,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Cart record);
}