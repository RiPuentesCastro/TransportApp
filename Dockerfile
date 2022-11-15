


FROM openjdk:11.0.2-jdk-oraclelinux7
COPY . /project
RUN  cd /project


#ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "-Dfile.encoding=UTF-8", "/opt/spring-boot/TransportApp-1.0-SNAPSHOT.jar"]