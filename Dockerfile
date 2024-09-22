FROM openjdk:21
RUN mkdir -p /home/app
COPY . /home/app
VOLUME /tmp
ADD target/APIDemo-1.jar myapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","myapp.jar"]