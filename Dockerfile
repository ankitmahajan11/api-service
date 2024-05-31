FROM amazoncorretto:17

ADD ./target/nagp-api-service-1.0.0.SNAPSHOT.jar /var/lib/service.jar

EXPOSE 9030

ENTRYPOINT java -jar /var/lib/service.jar