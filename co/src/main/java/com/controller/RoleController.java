package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Role;
import com.service.RoleService;

@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/role/getrole")
		@ResponseBody
	public Role getRole(@RequestParam("id") long id){
		long start = System.currentTimeMillis();
		Role role = this.roleService.getRole(id);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		return role;
	}
}
