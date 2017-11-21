package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Bill;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface BillMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:150
     */
    @Delete({
            "delete from bill",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:150
     */
    @Insert({
            "insert into bill (shop_id, shop_name, ",
            "bill_type, order_num, ",
            "bill_date, total_income, ",
            "create_by, create_time)",
            "values (#{shopId,jdbcType=INTEGER}, #{shopName,jdbcType=VARCHAR}, ",
            "#{billType,jdbcType=INTEGER}, #{orderNum,jdbcType=INTEGER}, ",
            "#{billDate,jdbcType=VARCHAR}, #{totalIncome,jdbcType=DECIMAL}, ",
            "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Bill record);

    /**
     * @mbg.generated 2017-11-13 51:21:150
     */
    @Select({
            "select",
            "id, shop_id, shop_name, bill_type, order_num, bill_date, total_income, create_by, ",
            "create_time",
            "from bill",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bill_type", property = "billType", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_num", property = "orderNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "bill_date", property = "billDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "total_income", property = "totalIncome", jdbcType = JdbcType.DECIMAL),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    Bill selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:150
     */
    @Select({
            "select",
            "id, shop_id, shop_name, bill_type, order_num, bill_date, total_income, create_by, ",
            "create_time",
            "from bill"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bill_type", property = "billType", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_num", property = "orderNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "bill_date", property = "billDate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "total_income", property = "totalIncome", jdbcType = JdbcType.DECIMAL),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<Bill> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:150
     */
    @Update({
            "update bill",
            "set shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "bill_type = #{billType,jdbcType=INTEGER},",
            "order_num = #{orderNum,jdbcType=INTEGER},",
            "bill_date = #{billDate,jdbcType=VARCHAR},",
            "total_income = #{totalIncome,jdbcType=DECIMAL},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Bill record);
}