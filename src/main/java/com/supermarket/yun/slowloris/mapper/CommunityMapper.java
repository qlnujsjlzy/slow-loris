package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Community;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface CommunityMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:295
     */
    @Delete({
            "delete from community",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:295
     */
    @Insert({
            "insert into community (name, address, ",
            "coordinate, area, ",
            "sort, create_by, ",
            "create_time, update_by, ",
            "update_time, flag, ",
            "remarks)",
            "values (#{name,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
            "#{coordinate,jdbcType=VARCHAR}, #{area,jdbcType=VARCHAR}, ",
            "#{sort,jdbcType=INTEGER}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{flag,jdbcType=INTEGER}, ",
            "#{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Community record);

    /**
     * @mbg.generated 2017-11-13 51:21:295
     */
    @Select({
            "select",
            "id, name, address, coordinate, area, sort, create_by, create_time, update_by, ",
            "update_time, flag, remarks",
            "from community",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "coordinate", property = "coordinate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "area", property = "area", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    Community selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:295
     */
    @Select({
            "select",
            "id, name, address, coordinate, area, sort, create_by, create_time, update_by, ",
            "update_time, flag, remarks",
            "from community"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "coordinate", property = "coordinate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "area", property = "area", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<Community> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:295
     */
    @Update({
            "update community",
            "set name = #{name,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "coordinate = #{coordinate,jdbcType=VARCHAR},",
            "area = #{area,jdbcType=VARCHAR},",
            "sort = #{sort,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "flag = #{flag,jdbcType=INTEGER},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Community record);
}