package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.BillBackRecord;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface BillBackRecordMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:203
     */
    @Delete({
            "delete from bill_back_record",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:203
     */
    @Insert({
            "insert into bill_back_record (order_id, order_type, ",
            "bill_amount, bill_back, ",
            "bill_date, sign_time, ",
            "shop_id, shop_name, ",
            "create_by, create_time)",
            "values (#{orderId,jdbcType=INTEGER}, #{orderType,jdbcType=INTEGER}, ",
            "#{billAmount,jdbcType=DECIMAL}, #{billBack,jdbcType=DECIMAL}, ",
            "#{billDate,jdbcType=VARCHAR}, #{signTime,jdbcType=TIMESTAMP}, ",
            "#{shopId,jdbcType=INTEGER}, #{shopName,jdbcType=VARCHAR}, ",
            "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(BillBackRecord record);

    /**
     * @mbg.generated 2017-11-13 51:21:203
     */
    @Select({
            "select",
            "id, order_id, order_type, bill_amount, bill_back, bill_date, sign_time, shop_id, ",
            "shop_name, create_by, create_time",
            "from bill_back_record",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "order_id", property = "orderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.INTEGER),
            @Result(column = "bill_amount", property = "billAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "bill_back", property = "billBack", jdbcType = JdbcType.DECIMAL),
            @Result(column = "bill_date", property = "billDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sign_time", property = "signTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    BillBackRecord selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:203
     */
    @Select({
            "select",
            "id, order_id, order_type, bill_amount, bill_back, bill_date, sign_time, shop_id, ",
            "shop_name, create_by, create_time",
            "from bill_back_record"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "order_id", property = "orderId", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.INTEGER),
            @Result(column = "bill_amount", property = "billAmount", jdbcType = JdbcType.DECIMAL),
            @Result(column = "bill_back", property = "billBack", jdbcType = JdbcType.DECIMAL),
            @Result(column = "bill_date", property = "billDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sign_time", property = "signTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<BillBackRecord> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:203
     */
    @Update({
            "update bill_back_record",
            "set order_id = #{orderId,jdbcType=INTEGER},",
            "order_type = #{orderType,jdbcType=INTEGER},",
            "bill_amount = #{billAmount,jdbcType=DECIMAL},",
            "bill_back = #{billBack,jdbcType=DECIMAL},",
            "bill_date = #{billDate,jdbcType=VARCHAR},",
            "sign_time = #{signTime,jdbcType=TIMESTAMP},",
            "shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BillBackRecord record);
}