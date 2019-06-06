package com.jiayaxing.web.dao;

import com.jiayaxing.web.model.ShiroRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface ShiroRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role
	 * @mbg.generated  Wed Jun 13 09:29:13 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role
	 * @mbg.generated  Wed Jun 13 09:29:13 CST 2018
	 */
	int insert(ShiroRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role
	 * @mbg.generated  Wed Jun 13 09:29:13 CST 2018
	 */
	int insertSelective(ShiroRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role
	 * @mbg.generated  Wed Jun 13 09:29:13 CST 2018
	 */
	ShiroRole selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role
	 * @mbg.generated  Wed Jun 13 09:29:13 CST 2018
	 */
	int updateByPrimaryKeySelective(ShiroRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shiro_role
	 * @mbg.generated  Wed Jun 13 09:29:13 CST 2018
	 */
	int updateByPrimaryKey(ShiroRole record);
}