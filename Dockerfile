FROM eclipse-temurin:17
COPY target/linuxdemo.jar linuxdemo.jar
CMD ["java","-jar", "linuxdemo.jar"]