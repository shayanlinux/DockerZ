# Typesafe Activator Minimal

This Dockerfile generates an image with the 
[Lightbend or Typesafe Activator](https://www.lightbend.com/activator/download) for [Play Framework](https://www.playframework.com/download).

Based on image [`java:8`](https://hub.docker.com/_/java/)

## Usage

Use the following command to build the image locally:
```
docker build -t <image-name> .
```

For an example about how to use this image for your play application see [`activator-minimal-example`](../activator-minimal-example/)