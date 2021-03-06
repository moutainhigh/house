package com.jzfq.house.mybatis.mapper;

import com.jzfq.house.mybatis.domain.HouseMessage;
import com.jzfq.house.mybatis.domain.HouseMessageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int countByExample(HouseMessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int deleteByExample(HouseMessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int insert(HouseMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int insertSelective(HouseMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    List<HouseMessage> selectByExample(HouseMessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    HouseMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") HouseMessage record, @Param("example") HouseMessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int updateByExample(@Param("record") HouseMessage record, @Param("example") HouseMessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int updateByPrimaryKeySelective(HouseMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 10 10:04:36 CST 2018
     */
    int updateByPrimaryKey(HouseMessage record);
}