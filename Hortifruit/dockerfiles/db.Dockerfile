FROM postgres:11.5-alpine
COPY ./dockerfiles/init.sql /docker-entrypoint-initdb.d/
