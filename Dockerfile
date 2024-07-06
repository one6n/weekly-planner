FROM eclipse-temurin:21
EXPOSE 8080
RUN mkdir /opt/app
COPY ./target/weekly-planner-${APP_VERSION}.jar /opt/app
CMD ["java", "-jar", "/opt/app/report-integrator-0.0.1.jar"]