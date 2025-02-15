package com.xxx.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xxx.o2o.entity.PersonInfo;

public interface PersonInfoDao {
	/**
	 * 根据查询条件分页返回用户信息列表
	 * 
	 * @param personInfoCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<PersonInfo> queryPersonInfoList(@Param("personInfoCondition")PersonInfo personInfoCondition, @Param("rowIndex")int rowIndex, @Param("pageSize")int pageSize);

	/**
	 * 根据查询条件返回总数，配合queryPersonInfoList使用
	 * 
	 * @param personInfoCondition
	 * @return
	 */
	int queryPersonInfoCount(@Param("personInfoCondition")PersonInfo personInfoCondition);

	/**
	 * 通过用户Id查询用户
	 * 
	 * @param userId
	 * @return
	 */
	PersonInfo queryPersonInfoById(long userId);

	/**
	 * 添加用户信息
	 * 
	 * @param personInfo
	 * @return
	 */
	int insertPersonInfo(PersonInfo personInfo);

	/**
	 * 修改用户信息
	 * 
	 * @param personInfo
	 * @return
	 */
	int updatePersonInfo(PersonInfo personInfo);

}
