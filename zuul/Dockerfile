#基础镜像
FROM java:8

# 创建/tmp目录并持久化到Docker数据文件夹，因为Spring Boot使用的内嵌Tomcat容器默认使用/tmp作为工作目录。
VOLUME /tmp


#将当前目录下的target目录下的jar包 拷贝进dokcer并改名
ADD ./target/zuul-0.0.1-SNAPSHOT.jar app.jar




#执行命令 启动
ENTRYPOINT ["java","-jar","/app.jar"]
