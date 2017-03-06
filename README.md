#invoke-flask-springboot
invoke flask based processing engine using using springboot api using rest template,with inversion of control (Dependency Injection) using Docker images in docker container

#Maven Commands
mvn clean install

mvn spring-boot:run

mvn clean package docker:build


# To enable two container api talk to each other, net=host would run below container in host's network namespace

http://stackoverflow.com/questions/24319662/from-inside-of-a-docker-container-how-do-i-connect-to-the-localhost-of-the-mach

This would enable springboot api container to talk to flask api container. -it would be interative terminal with input/output mapped

docker run -it --net="host" -p 9090:9090 akshay3030/invoke-flask-sprinboot


#Docker Compose : This will start both cotainer with right config to talk to each other with network_mode: "host"

docker-compose up

docker-compose down

# Invocation data and endpoints

http://localhost:9090/invoke/sbootflask?modelname=valuation

json input: {"input1":2,"input2":3,"input3":4,"input4":5}


############################################################
# Additional Notes with More docker commands
#mvn package build image

mvn clean package docker:build


#Docker Commands

docker login {docker hub url}

docker push { Full Repository Name }

docker pull { Full Repository Name }

docker run {image name or image id}

docker images

docker tag b5365604e06b {repository name or image id}

docker ps

docker stop {psid}


#Run with was tokens from docker image:
docker run -e AWS_CREDENTIAL_PROFILES_FILE=<path>/.aws/credentials -v <path>/.aws:<path>/.aws -p 9095:9090 -e spring.profiles.active="local" {image name or image id}

http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html


#To login to docker image, if it has bash already :

docker run -i -t {image name or image id}

docker run -it {image name or image id} /bin/bash

docker run -d {image name or image id} /bin/bash

docker tag {image-id or old-tag} {new tag-name}



#Docker Logs:
docker logs --details { psid }

#Docker Name: Give a custom name to image
docker run --name akshay { image name }

#Build Image from local, run below at root of Dockerfile:
docker build -t {image name} .

# Remove commands
docker rm :remove container,use -f to use force

docker rmi :remove images,use -f to use force

docker -rm -f $(docker ps -qa)  : Remove all cotainers at once




