FROM openjdk
RUN mkdir /project
ADD target/dockerdemoproject-0.0.1-SNAPSHOT.jar /project
EXPOSE 8080
CMD ["java","-jar","/project/dockerdemoproject-0.0.1-SNAPSHOT.jar"]