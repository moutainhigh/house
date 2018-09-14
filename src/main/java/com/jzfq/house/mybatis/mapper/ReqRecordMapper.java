package com.jzfq.house.mybatis.mapper;

import com.jzfq.house.mybatis.domain.ReqRecord;
import com.jzfq.house.mybatis.domain.ReqRecordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReqRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int countByExample(ReqRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByExample(ReqRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insert(ReqRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insertSelective(ReqRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    List<ReqRecord> selectByExample(ReqRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    ReqRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") ReqRecord record, @Param("example") ReqRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExample(@Param("record") ReqRecord record, @Param("example") ReqRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKeySelective(ReqRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table req_record
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKey(ReqRecord record);
}