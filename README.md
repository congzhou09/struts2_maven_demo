#### 项目创建过程tips
◇struts项目与servlet项目的基础部分一样，请求入口配置均位于"webapp/WEB-INF/web.xml"，区别在于servlet项目的路由控制都在web.xml，而struts项目通过servlet的filter机制将路由配置转移到了"resources/struts.xml"中；

◇Tomcat+jar引入包方式有版本兼容问题，根据struts官网文章改用maven+jetty-maven-plugin方式；


#### 启动
●控制台项目目录下运行：mvn jetty:run


●浏览器访问 http://localhost:8080/base/index.jsp 直接请求jsp文件，得到jsp执行后的内容；

●浏览器访问 http://localhost:8080/base/index 这个action，得到与上一条相同的内容；

●浏览器访问 http://localhost:8080/base/hello 得到hello.jsp拼接了action所共享的内容；