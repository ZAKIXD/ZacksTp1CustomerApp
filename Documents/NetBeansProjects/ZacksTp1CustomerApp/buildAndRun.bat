@echo off
call mvn clean package
call docker build -t fr.grin/ZacksTp1CustomerApp .
call docker rm -f ZacksTp1CustomerApp
call docker run -d -p 9080:9080 -p 9443:9443 --name ZacksTp1CustomerApp fr.grin/ZacksTp1CustomerApp