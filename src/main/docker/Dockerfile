FROM java:8
VOLUME /tmp
ADD trainer.jar trainer.jar
RUN bash -c 'touch /trainer.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/trainer.jar"]