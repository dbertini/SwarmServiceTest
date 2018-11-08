FROM java:8
WORKDIR /
ADD target/SwarmServiceTest-1.0.0.jar SwarmServiceTest-1.0.0.jar
ADD target/SwarmServiceTest-1.0.0-swarm.jar SwarmServiceTest-1.0.0-swarm.jar
EXPOSE 8080
CMD java -jar SwarmServiceTest-1.0.0-swarm.jar -Djava.net.preferIPv4Stack=true
