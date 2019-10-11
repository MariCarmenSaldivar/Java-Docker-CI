FROM maven:3.6.2-jdk-12 AS build
COPY src /tmp/src/
COPY pom.xml /tmp/
WORKDIR /tmp/
RUN mvn clean install
RUN mvn package

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
#ENV JAVA_OPTS=$JAVA_OPTS
COPY ${JAR_FILE} hoteliterface.jar
#ADD target/hoteliterface-0.0.1-SNAPSHOT.jar hoteliterface.jar
EXPOSE 8085
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/hoteliterface.jar"]
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar hoteliterface.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar hoteliterface.jar
