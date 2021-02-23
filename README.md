# feignspringapi-suite
Spring Boot + Feign + TestNG

An API test suite utilising Spring Boot, Feign and TestNG.

## How to run it?

1. Install Maven on your machine (make sure you have Java JDK set on your machine and that the Maven installation is orderly :) https://www.baeldung.com/install-maven-on-windows-linux-mac )
2. Use one of the commands on your terminal: `mvn install -DskipTests=true` to install dependencies only or `mvn install` to install dependencies with running the tests at the same time
3. Later on, after the dependencies have been installed, you need to navigate to the project and run `mvn clean test -DsuiteXmlFile=testng.xml` 
