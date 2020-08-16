FROM rainee/docker-alpine-oraclejdk8

WORKDIR /var/jenkins_home/workspace/Chap4/Checkout/calculator
COPY build/libs/calculator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
