FROM tomcat:10.1
COPY /target/root.war /usr/local/tomcat/webapps/
