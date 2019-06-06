package com.jiayaxing.web.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Mapper;

import com.jiayaxing.web.model.ShiroRolePermisson;
import com.jiayaxing.web.model.ShiroRolePermissonKey;
import org.springframework.stereotype.Repository;

@Mapper
public interface ShiroRolePermissonMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role_permisson
	 * @mbg.generated  Wed Jun 13 09:31:19 CST 2018
	 */
	int deleteByPrimaryKey(ShiroRolePermissonKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role_permisson
	 * @mbg.generated  Wed Jun 13 09:31:19 CST 2018
	 */
	int insert(ShiroRolePermisson record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role_permisson
	 * @mbg.generated  Wed Jun 13 09:31:19 CST 2018
	 */
	int insertSelective(ShiroRolePermisson record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role_permisson
	 * @mbg.generated  Wed Jun 13 09:31:19 CST 2018
	 */
	ShiroRolePermisson selectByPrimaryKey(ShiroRolePermissonKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role_permisson
	 * @mbg.generated  Wed Jun 13 09:31:19 CST 2018
	 */
	int updateByPrimaryKeySelective(ShiroRolePermisson record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role_permisson
	 * @mbg.generated  Wed Jun 13 09:31:19 CST 2018
	 */
	int updateByPrimaryKey(ShiroRolePermisson record);
	
	Set<String> getPermsByUsername(String name);
}