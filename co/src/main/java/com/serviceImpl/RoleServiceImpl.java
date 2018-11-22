package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RoleDao;
import com.pojo.Role;
import com.service.RoleService;
@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao;
	@Transactional(propagation = Propagation.REQUIRED)
	public Role getRole(Long ids) {
		return roleDao.getRole(ids);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public Role findRole(String roleName) {
		return roleDao.findRole(roleName);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteRole(Long id) {
		return roleDao.deleteRole(id);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int insertRole(Role role) {
		return this.roleDao.insertRole(role);
	}

}
