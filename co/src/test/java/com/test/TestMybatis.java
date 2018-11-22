package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Role;
import com.serviceImpl.RoleServiceImpl;

public class TestMybatis {
	@Autowired
	private RoleServiceImpl roleServiceImpl;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		roleServiceImpl = (RoleServiceImpl) ac.getBean("roleService");
	}
	
	@Test
	public void test1() {
		Role role = roleServiceImpl.getRole(1l);
		System.out.println(role);
	}
}
