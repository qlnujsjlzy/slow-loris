package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.BillBack;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface BillBackMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:179
     */
    @Delete({
            "delete from bill_back",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:179
     */
    @Insert({
            "insert into bill_back (bill_date, shop_id, ",
            "shop_name, total_bill, ",
            "total_back, bill_type, ",
            "order_num, create_by, ",
            "create_time, update_by, ",
            "update_time)",
            "values (#{billDate,jdbcType=VARCHAR}, #{shopId,jdbcType=INTEGER}, ",
            "#{shopName,jdbcType=VARCHAR}, #{totalBill,jdbcType=DECIMAL}, ",
            "#{totalBack,jdbcType=DECIMAL}, #{billType,jdbcType=INTEGER}, ",
            "#{orderNum,jdbcType=INTEGER}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(BillBack record);

    /**
     * @mbg.generated 2017-11-13 51:21:179
     */
    @Select({
            "select",
            "id, bill_date, shop_id, shop_name, total_bill, total_back, bill_type, order_num, ",
            "create_by, create_time, update_by, update_time",
            "from bill_back",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "bill_date", property = "billDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "total_bill", property = "totalBill", jdbcType = JdbcType.DECIMAL),
            @Result(column = "total_back", property = "totalBack", jdbcType = JdbcType.DECIMAL),
            @Result(column = "bill_type", property = "billType", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_num", property = "orderNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    BillBack selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:179
     */
    @Select({
            "select",
            "id, bill_date, shop_id, shop_name, total_bill, total_back, bill_type, order_num, ",
            "create_by, create_time, update_by, update_time",
            "from bill_back"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "bill_date", property = "billDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "total_bill", property = "totalBill", jdbcType = JdbcType.DECIMAL),
            @Result(column = "total_back", property = "totalBack", jdbcType = JdbcType.DECIMAL),
            @Result(column = "bill_type", property = "billType", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_num", property = "orderNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<BillBack> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:179
     */
    @Update({
            "update bill_back",
            "set bill_date = #{billDate,jdbcType=VARCHAR},",
            "shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "total_bill = #{totalBill,jdbcType=DECIMAL},",
            "total_back = #{totalBack,jdbcType=DECIMAL},",
            "bill_type = #{billType,jdbcType=INTEGER},",
            "order_num = #{orderNum,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BillBack record);
}