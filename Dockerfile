FROM java:8-jdk
MAINTAINER Vinmayi Swamy <vinmayiswamy5@gmail.com>

RUN apt-get update \
    && apt-get install -y git

RUN git clone https://github.com/vinmayiswamy/BookMyMovie.git \
    && cd BookMyMovie \
    && chmod +x mvnw \
    && ./mvnw -DskipTests=true package

ADD ./target/reservations-0.0.1-SNAPSHOT.jar /root/
CMD ["java", "-jar", "/root/reservations-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
