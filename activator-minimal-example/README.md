# Dockerized Play Application

This is an example of a dockerized play application. It uses the [`shayanlinux/activator-minimal`](https://hub.docker.com/r/shayanlinux/activator-minimal/) docker file as base. 

## Usage

Start the container and navigate to [`http://localhost:9000`](http://localhost:9000)

## docker Commands

```
# build the image
docker build -t app .

# run the container interactively in test mode (also see Dockerfile)
docker run -p 9000:9000 -i -t app

# run the container detached in production mode (also see Dockerfile)
docker run -p 9000:9000 -d app

# running containers
docker ps

# stop the container
docker stop <container_id>
```

## docker-compose Commands

```
# start the container
docker-compose up -d

# rebuild the container
docker-compose build
# or
docker-compose up -d --build

# running containers
docker-compose ps

# stop the container
docker-compose stop
```