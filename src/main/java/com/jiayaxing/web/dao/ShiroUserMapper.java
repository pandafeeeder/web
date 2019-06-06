package com.jiayaxing.web.dao;

import java.util.Map;

import com.jiayaxing.web.model.ShiroUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface ShiroUserMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_user
	 * @mbg.generated  Thu Jul 19 10:21:57 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_user
	 * @mbg.generated  Thu Jul 19 10:21:57 CST 2018
	 */
	int insert(ShiroUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_user
	 * @mbg.generated  Thu Jul 19 10:21:57 CST 2018
	 */
	int insertSelective(ShiroUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_user
	 * @mbg.generated  Thu Jul 19 10:21:57 CST 2018
	 */
	ShiroUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_user
	 * @mbg.generated  Thu Jul 19 10:21:57 CST 2018
	 */
	int updateByPrimaryKeySelective(ShiroUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_user
	 * @mbg.generated  Thu Jul 19 10:21:57 CST 2018
	 */
	int updateByPrimaryKey(ShiroUser record);

	Map<String,Object> getUserInfoByUsername(String name);
	
	Map<String,Object> getUserInfo(Integer id);
}