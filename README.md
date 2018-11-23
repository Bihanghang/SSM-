Spring+SpringMVC+Mybatis的整合

数据库:Mysql

IDE:Eclipse

将项目下载解压导入Eclipse如果报错是因为版本问题，作如下修改

在目录工程下找到.settings文件夹，里面有个org.eclipse.wst.common.project.facet.core文件
作如下修改:
```
<installed facet="jst.web" version="3.0"/>
```
这里应该与web.xml下的version一致
```
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	version="3.0">
```
右击项目找到Maven->Update Project,点击更新。

确保jdbc.properties里面的用户名，密码改成自己的,然后建表插入数据。

```
DROP TABLE t_role;
create table t_role (
  role_name varchar(255) NOT NULL,
  note varchar(255) NOT NULL,
  id bigint auto_increment NOT NULL,
  PRIMARY KEY (id)
);
insert into t_role(role_name,note) values('lisi','Hello World!');
```

开启tomcat访问http://localhost:8888/co/role/getrole?id=1就能看到返回刚刚插入的信息，当然端口号要改成自己的。