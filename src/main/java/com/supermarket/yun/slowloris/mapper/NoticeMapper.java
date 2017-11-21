package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Notice;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface NoticeMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:319
     */
    @Delete({
            "delete from notice",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:319
     */
    @Insert({
            "insert into notice (shop_id, shop_name, ",
            "order_id, order_time, ",
            "delivery_type, read_status, ",
            "create_by, create_time, ",
            "update_by, update_time, ",
            "remarks)",
            "values (#{shopId,jdbcType=INTEGER}, #{shopName,jdbcType=VARCHAR}, ",
            "#{orderId,jdbcType=INTEGER}, #{orderTime,jdbcType=TIMESTAMP}, ",
            "#{deliveryType,jdbcType=INTEGER}, #{readStatus,jdbcType=INTEGER}, ",
            "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
            "#{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Notice record);

    /**
     * @mbg.generated 2017-11-13 51:21:319
     */
    @Select({
            "select",
            "id, shop_id, shop_name, order_id, order_time, delivery_type, read_status, create_by, ",
            "create_time, update_by, update_time, remarks",
            "from notice",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_id", property = "orderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_time", property = "orderTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "delivery_type", property = "deliveryType", jdbcType = JdbcType.INTEGER),
            @Result(column = "read_status", property = "readStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    Notice selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:319
     */
    @Select({
            "select",
            "id, shop_id, shop_name, order_id, order_time, delivery_type, read_status, create_by, ",
            "create_time, update_by, update_time, remarks",
            "from notice"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_id", property = "orderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_time", property = "orderTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "delivery_type", property = "deliveryType", jdbcType = JdbcType.INTEGER),
            @Result(column = "read_status", property = "readStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<Notice> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:319
     */
    @Update({
            "update notice",
            "set shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "order_id = #{orderId,jdbcType=INTEGER},",
            "order_time = #{orderTime,jdbcType=TIMESTAMP},",
            "delivery_type = #{deliveryType,jdbcType=INTEGER},",
            "read_status = #{readStatus,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Notice record);
}