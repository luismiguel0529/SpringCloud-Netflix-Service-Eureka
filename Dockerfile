FROM openjdk:14
VOLUME /tmp
EXPOSE 8761
ADD ./target/springboot-server-eureka-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]