FROM shayanlinux/activator-minimal

ADD ./app /app

WORKDIR /app

RUN activator compile 

RUN activator stage

EXPOSE 9000

# to run interactively via "docker run -p 9000:9000 -i -t app"
#CMD ["activator", "run"]

# to run detached via "docker run -p 9000:9000 -d app"
CMD ["/app/target/universal/stage/bin/app", "-Dhttp.port=9000", "-Dplay.crypto.secret=\"Oi]F3MN<EaoE]Xbc8T;idSiOKOsG4BArHZgkQ=r9QbP?3axRQhxiqIlz]3Peg1V6\""]

