package com.jzfq.house.mybatis.mapper;

import com.jzfq.house.mybatis.domain.ResRecordFile;
import com.jzfq.house.mybatis.domain.ResRecordFileQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResRecordFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int countByExample(ResRecordFileQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByExample(ResRecordFileQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insert(ResRecordFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insertSelective(ResRecordFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    List<ResRecordFile> selectByExample(ResRecordFileQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    ResRecordFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") ResRecordFile record, @Param("example") ResRecordFileQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExample(@Param("record") ResRecordFile record, @Param("example") ResRecordFileQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKeySelective(ResRecordFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_record_file
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKey(ResRecordFile record);
}