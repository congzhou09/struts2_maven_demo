#### 项目创建过程tips
◇Tomcat+引入jar包方式有版本兼容问题，根据struts官网文章改用maven+jetty-maven-plugin方式；


#### 启动
●控制台项目目录下运行：mvn jetty:run


●浏览器访问 http://localhost:8080/base/index.jsp 直接请求jsp文件，得到jsp执行后的内容；

●浏览器访问 http://localhost:8080/base/index 这个action，得到与上一条相同的内容；

●浏览器访问 http://localhost:8080/base/hello 得到hello.jsp拼接了action所共享的内容；