FROM openjdk:8-jdk-alpine
COPY ./target/test-hello.jar /usr/springest/
WORKDIR /usr/springest
EXPOSE 3111
ENTRYPOINT ["java","-jar","/usr/springest/test-hello.jar"]