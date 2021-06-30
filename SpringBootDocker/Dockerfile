FROM openjdk: 8
VOLUME /temp
EXPOSE 9191
ADD /target/SpringBootDocker-1.0.war SpringBootDocker-1.0.war
ENTRYPOINT["java", "jar","SpringBootDocker-1.0.war"]