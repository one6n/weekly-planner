FROM eclipse-temurin:21-jre
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT exec java \
	-Djava.security.egd=file:/dev/./urandom \
	-Dspring.profiles.active=$SPRING_PROFILES_ACTIVE \
	$JAVA_ARGS \
	-jar app.jar