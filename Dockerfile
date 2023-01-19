FROM openjdk
MAINTAINER praveenAtRps
RUN mkdir java 
ADD restproject.jar /java
EXPOSE 8080
WORKDIR /java
ENTRYPOINT ["java","-jar","restproject.jar"]




