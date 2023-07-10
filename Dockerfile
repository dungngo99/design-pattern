FROM openjdk:22-jdk
MAINTAINER design.patter.com
COPY target/learnn-0.0.1-SNAPSHOT.jar learnn-server-0.0.1.jar
ENTRYPOINT ["java","-jar","/learnn-server-0.0.1.jar"]