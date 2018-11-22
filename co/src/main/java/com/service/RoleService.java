package com.service;

import com.pojo.Role;

public interface RoleService {
	public Role getRole(Long ids);
	public Role findRole(String roleName);
	public int deleteRole(Long id);
	public int insertRole(Role role);
}
