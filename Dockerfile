
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/hoteliterface-0.0.1-SNAPSHOT.jar hoteliterface.jar
EXPOSE 8085
ENTRYPOINT exec java $JAVA_OPTS -jar hoteliterface.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar hoteliterface.jars