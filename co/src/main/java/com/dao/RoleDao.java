package com.dao;

import org.springframework.stereotype.Repository;

import com.pojo.Role;
@Repository
public interface RoleDao {
	public Role getRole(Long ids);
	public Role findRole(String roleName);
	public int deleteRole(Long id);
	public int insertRole(Role role);
}
