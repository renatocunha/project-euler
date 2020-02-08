FROM openjdk:8
COPY . /tmp
WORKDIR /tmp/src
RUN javac ./*
ENTRYPOINT ["java","ProjectEuler"]
