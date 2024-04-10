FROM quay.io/quarkus/ubi-quarkus-native-image:22.0.1-java17 AS builder

WORKDIR /usr/src/app
COPY . .

RUN mvn clean package -Pnative -Dnative-image.docker-build=true

FROM registry.access.redhat.com/ubi8/ubi-minimal:latest

WORKDIR /deployments

COPY --from=builder /usr/src/app/target/*-runner /deployments/

EXPOSE 8080

CMD ["./my-application-runner", "-Dquarkus.http.host=0.0.0.0", "-Djava.util.logging.manager=org.jboss.logmanager.LogManager"]
