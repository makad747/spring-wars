FROM amd64/tomcat:9.0.53-jdk8
ENV CATALINA_HOME /usr/local/tomcat
ENV JAVA_OPTS ="-Xms512m -Xmx4G -XX:MaxPermSize=1024m -XX:-UseParallelGC -DcoreJMX=true "
COPY spring.war $CATALINA_HOME/webapps/spring.war
RUN apt-get update && apt-get install -y unzip
unzip spring.war -d /usr/local/tomcat/webapps/spring
RUN["rm","usr/local/tomcat/webapps/spring.war"]
WORKDIR "/usr/local/tomcat/bin"
EXPOSE 8082
CMD ["./catalina.sh","run"]
