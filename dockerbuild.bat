mvn clean package^
&& docker build -t weekly-planner:$APP_VERSION .