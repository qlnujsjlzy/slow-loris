package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.OrderMainSpilt;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface OrderMainSpiltMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:420
     */
    @Delete({
            "delete from order_main_spilt",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:420
     */
    @Insert({
            "insert into order_main_spilt (parent_order, buyer_id, ",
            "shop_id, shop_name, ",
            "payment, delivery_type, ",
            "consignee_name, consignee_phone, ",
            "consignee_address, verification_code, ",
            "order_comment, shipping_fee, ",
            "total_pay, total_cost, ",
            "pay_price, pay_status, ",
            "pay_time, pay_transaction, ",
            "pay_check, order_status, ",
            "order_time, cancel_time, ",
            "cancel_by, sign_time, ",
            "sign_by, split_transfer, ",
            "order_type, update_by, ",
            "update_time, version, ",
            "remarks)",
            "values (#{parentOrder,jdbcType=INTEGER}, #{buyerId,jdbcType=INTEGER}, ",
            "#{shopId,jdbcType=INTEGER}, #{shopName,jdbcType=VARCHAR}, ",
            "#{payment,jdbcType=INTEGER}, #{deliveryType,jdbcType=INTEGER}, ",
            "#{consigneeName,jdbcType=VARCHAR}, #{consigneePhone,jdbcType=VARCHAR}, ",
            "#{consigneeAddress,jdbcType=VARCHAR}, #{verificationCode,jdbcType=VARCHAR}, ",
            "#{orderComment,jdbcType=VARCHAR}, #{shippingFee,jdbcType=DECIMAL}, ",
            "#{totalPay,jdbcType=DECIMAL}, #{totalCost,jdbcType=DECIMAL}, ",
            "#{payPrice,jdbcType=DECIMAL}, #{payStatus,jdbcType=INTEGER}, ",
            "#{payTime,jdbcType=TIMESTAMP}, #{payTransaction,jdbcType=VARCHAR}, ",
            "#{payCheck,jdbcType=VARCHAR}, #{orderStatus,jdbcType=INTEGER}, ",
            "#{orderTime,jdbcType=TIMESTAMP}, #{cancelTime,jdbcType=TIMESTAMP}, ",
            "#{cancelBy,jdbcType=VARCHAR}, #{signTime,jdbcType=TIMESTAMP}, ",
            "#{signBy,jdbcType=VARCHAR}, #{splitTransfer,jdbcType=INTEGER}, ",
            "#{orderType,jdbcType=INTEGER}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{version,jdbcType=INTEGER}, ",
            "#{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(OrderMainSpilt record);

    /**
     * @mbg.generated 2017-11-13 51:21:420
     */
    @Select({
            "select",
            "id, parent_order, buyer_id, shop_id, shop_name, payment, delivery_type, consignee_name, ",
            "consignee_phone, consignee_address, verification_code, order_comment, shipping_fee, ",
            "total_pay, total_cost, pay_price, pay_status, pay_time, pay_transaction, pay_check, ",
            "order_status, order_time, cancel_time, cancel_by, sign_time, sign_by, split_transfer, ",
            "order_type, update_by, update_time, version, remarks",
            "from order_main_spilt",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "parent_order", property = "parentOrder", jdbcType = JdbcType.INTEGER),
            @Result(column = "buyer_id", property = "buyerId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "payment", property = "payment", jdbcType = JdbcType.INTEGER),
            @Result(column = "delivery_type", property = "deliveryType", jdbcType = JdbcType.INTEGER),
            @Result(column = "consignee_name", property = "consigneeName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "consignee_phone", property = "consigneePhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "consignee_address", property = "consigneeAddress", jdbcType = JdbcType.VARCHAR),
            @Result(column = "verification_code", property = "verificationCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_comment", property = "orderComment", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shipping_fee", property = "shippingFee", jdbcType = JdbcType.DECIMAL),
            @Result(column = "total_pay", property = "totalPay", jdbcType = JdbcType.DECIMAL),
            @Result(column = "total_cost", property = "totalCost", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_price", property = "payPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_status", property = "payStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "pay_time", property = "payTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "pay_transaction", property = "payTransaction", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pay_check", property = "payCheck", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_status", property = "orderStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_time", property = "orderTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "cancel_time", property = "cancelTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "cancel_by", property = "cancelBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sign_time", property = "signTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "sign_by", property = "signBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "split_transfer", property = "splitTransfer", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.INTEGER),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    OrderMainSpilt selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:420
     */
    @Select({
            "select",
            "id, parent_order, buyer_id, shop_id, shop_name, payment, delivery_type, consignee_name, ",
            "consignee_phone, consignee_address, verification_code, order_comment, shipping_fee, ",
            "total_pay, total_cost, pay_price, pay_status, pay_time, pay_transaction, pay_check, ",
            "order_status, order_time, cancel_time, cancel_by, sign_time, sign_by, split_transfer, ",
            "order_type, update_by, update_time, version, remarks",
            "from order_main_spilt"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "parent_order", property = "parentOrder", jdbcType = JdbcType.INTEGER),
            @Result(column = "buyer_id", property = "buyerId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_id", property = "shopId", jdbcType = JdbcType.INTEGER),
            @Result(column = "shop_name", property = "shopName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "payment", property = "payment", jdbcType = JdbcType.INTEGER),
            @Result(column = "delivery_type", property = "deliveryType", jdbcType = JdbcType.INTEGER),
            @Result(column = "consignee_name", property = "consigneeName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "consignee_phone", property = "consigneePhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "consignee_address", property = "consigneeAddress", jdbcType = JdbcType.VARCHAR),
            @Result(column = "verification_code", property = "verificationCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_comment", property = "orderComment", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shipping_fee", property = "shippingFee", jdbcType = JdbcType.DECIMAL),
            @Result(column = "total_pay", property = "totalPay", jdbcType = JdbcType.DECIMAL),
            @Result(column = "total_cost", property = "totalCost", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_price", property = "payPrice", jdbcType = JdbcType.DECIMAL),
            @Result(column = "pay_status", property = "payStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "pay_time", property = "payTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "pay_transaction", property = "payTransaction", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pay_check", property = "payCheck", jdbcType = JdbcType.VARCHAR),
            @Result(column = "order_status", property = "orderStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_time", property = "orderTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "cancel_time", property = "cancelTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "cancel_by", property = "cancelBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sign_time", property = "signTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "sign_by", property = "signBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "split_transfer", property = "splitTransfer", jdbcType = JdbcType.INTEGER),
            @Result(column = "order_type", property = "orderType", jdbcType = JdbcType.INTEGER),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<OrderMainSpilt> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:420
     */
    @Update({
            "update order_main_spilt",
            "set parent_order = #{parentOrder,jdbcType=INTEGER},",
            "buyer_id = #{buyerId,jdbcType=INTEGER},",
            "shop_id = #{shopId,jdbcType=INTEGER},",
            "shop_name = #{shopName,jdbcType=VARCHAR},",
            "payment = #{payment,jdbcType=INTEGER},",
            "delivery_type = #{deliveryType,jdbcType=INTEGER},",
            "consignee_name = #{consigneeName,jdbcType=VARCHAR},",
            "consignee_phone = #{consigneePhone,jdbcType=VARCHAR},",
            "consignee_address = #{consigneeAddress,jdbcType=VARCHAR},",
            "verification_code = #{verificationCode,jdbcType=VARCHAR},",
            "order_comment = #{orderComment,jdbcType=VARCHAR},",
            "shipping_fee = #{shippingFee,jdbcType=DECIMAL},",
            "total_pay = #{totalPay,jdbcType=DECIMAL},",
            "total_cost = #{totalCost,jdbcType=DECIMAL},",
            "pay_price = #{payPrice,jdbcType=DECIMAL},",
            "pay_status = #{payStatus,jdbcType=INTEGER},",
            "pay_time = #{payTime,jdbcType=TIMESTAMP},",
            "pay_transaction = #{payTransaction,jdbcType=VARCHAR},",
            "pay_check = #{payCheck,jdbcType=VARCHAR},",
            "order_status = #{orderStatus,jdbcType=INTEGER},",
            "order_time = #{orderTime,jdbcType=TIMESTAMP},",
            "cancel_time = #{cancelTime,jdbcType=TIMESTAMP},",
            "cancel_by = #{cancelBy,jdbcType=VARCHAR},",
            "sign_time = #{signTime,jdbcType=TIMESTAMP},",
            "sign_by = #{signBy,jdbcType=VARCHAR},",
            "split_transfer = #{splitTransfer,jdbcType=INTEGER},",
            "order_type = #{orderType,jdbcType=INTEGER},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "version = #{version,jdbcType=INTEGER},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OrderMainSpilt record);
}