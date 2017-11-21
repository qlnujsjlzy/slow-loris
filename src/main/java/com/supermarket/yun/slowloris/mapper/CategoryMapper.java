package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Category;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface CategoryMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:275
     */
    @Delete({
            "delete from category",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:275
     */
    @Insert({
            "insert into category (name, image, ",
            "sort, create_by, ",
            "create_time, update_by, ",
            "update_time, status, ",
            "remarks)",
            "values (#{name,jdbcType=VARCHAR}, #{image,jdbcType=VARCHAR}, ",
            "#{sort,jdbcType=INTEGER}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
            "#{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Category record);

    /**
     * @mbg.generated 2017-11-13 51:21:275
     */
    @Select({
            "select",
            "id, name, image, sort, create_by, create_time, update_by, update_time, status, ",
            "remarks",
            "from category",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "image", property = "image", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    Category selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:275
     */
    @Select({
            "select",
            "id, name, image, sort, create_by, create_time, update_by, update_time, status, ",
            "remarks",
            "from category"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "image", property = "image", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<Category> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:275
     */
    @Update({
            "update category",
            "set name = #{name,jdbcType=VARCHAR},",
            "image = #{image,jdbcType=VARCHAR},",
            "sort = #{sort,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Category record);
}