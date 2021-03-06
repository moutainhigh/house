package com.jzfq.house.mybatis.mapper;

import com.jzfq.house.mybatis.domain.TOrg;
import com.jzfq.house.mybatis.domain.TOrgQuery;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface TOrgMapper <T,Q,PK extends Serializable> extends CommonMapper<T, Q, PK> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int countByExample(TOrgQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int deleteByExample(TOrgQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int insert(TOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int insertSelective(TOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    List<TOrg> selectByExample(TOrgQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    TOrg selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") TOrg record, @Param("example") TOrgQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int updateByExample(@Param("record") TOrg record, @Param("example") TOrgQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int updateByPrimaryKeySelective(TOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    int updateByPrimaryKey(TOrg record);
}