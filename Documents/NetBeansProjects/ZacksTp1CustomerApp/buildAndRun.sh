#!/bin/sh
mvn clean package && docker build -t fr.grin/ZacksTp1CustomerApp .
docker rm -f ZacksTp1CustomerApp || true && docker run -d -p 9080:9080 -p 9443:9443 --name ZacksTp1CustomerApp fr.grin/ZacksTp1CustomerApp