FROM openjdk:11
MAINTAINER pengjian@qq.com

ADD springboot-docker-0.0.1-SNAPSHOT.jar app.jar

VOLUME /home/pengjian/springboot-docker-demo

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
