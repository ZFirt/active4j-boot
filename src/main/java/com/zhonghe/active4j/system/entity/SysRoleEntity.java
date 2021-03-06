package com.zhonghe.active4j.system.entity;

import javax.validation.constraints.NotEmpty;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zhonghe.active4j.common.entity.BaseEntity;
import com.zhonghe.active4j.core.annotation.QueryField;
import com.zhonghe.active4j.core.model.QueryCondition;

import lombok.Getter;
import lombok.Setter;


/**
 * 系统管理   角色管理
 * @author teli_
 *
 */
@TableName("sys_role")
@Getter
@Setter
public class SysRoleEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2752900934504224315L;

	/**
	 * 角色名称
	 */
	@TableField("NAME")
	@QueryField(queryColumn="NAME", condition=QueryCondition.like)
	@NotEmpty(message="角色名称不能为空")
	private String name;
	
	/**
	 * 父角色ID
	 */
	@TableField("PARENT_ID")
	private String parentId;
	
	/**
	 * 角色编号
	 */
	@TableField("ROLE_NO")
	@QueryField(queryColumn="ROLE_NO", condition=QueryCondition.eq)
	@NotEmpty(message="角色编号不能为空")
	private String roleNo;
	
	/**
	 * 角色排序
	 */
	@TableField("ORDER_NO")
	private int orderNo;
	
	/**
	 * 备注
	 */
	@TableField("MEMO")
	private String memo;
	
	
	
	
}
