call mvn org.apache.maven.plugins:maven-help-plugin:3.1.0:evaluate -Dexpression=project.version -q -DforceStdout > app-version.txt
set /p APP_VERSION=<app-version.txt
call mvn clean package
docker build -t weekly-planner:%APP_VERSION% -t weekly-planner:latest --build-arg JAR_FILE=target/weekly-planner-%APP_VERSION%.jar .
del app-version.txt