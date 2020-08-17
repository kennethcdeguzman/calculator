FROM rainee/docker-alpine-oraclejdk8

COPY calculator/build/libs/calculator-0.0.1-SNAPSHOT.jar app.jar
RUN chmod 666 acceptance_test.sh
ENTRYPOINT ["java", "-jar", "app.jar"]
