# SpringBoot_Mybatis
Spring Boot 框架 + Mybatis的通用Mapper+ 实现单表的增删改查+批量操作

bug1：
只有用html5写的页面view才能找到，后台会按照html5模板类型去查找。但貌似还是有点坑

开发工具生成的html页面元素有的没有终止符/,thymeleaf模板引擎默认是Template modes:HTML5解析的，解析比较严格。

需要手动添加/或指定引入的thymeleaf版本号
html和html5不同：
<meta charset="utf-8" >
<meta charset="utf-8" />

