FROM tomcat:8.5.82-jre8-temurin-jammy
EXPOSE 8080
WORKDIR /usr/local/tomcat/webapps/
COPY /target/my-web-app.war .