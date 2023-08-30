# Microservice integration with Eureka Server
1 Create normal springBoot application using start.spring.io
    https://start.spring.io/

2 Add Eureka discovery client dependency to pom file 

		<dependency>
			<groupId>io.pivotal.spring.cloud</groupId>
			<artifactId>spring-cloud-services-starter-service-registry</artifactId>
		</dependency>
    
3 Annotate the main class with `@EnableEurekaDiscoveryClient` 
    
4 Configure application.properties file as following
        
    #Giving port value 0 will make the eureka server to assign the port automatically
    server.port=0
    spring.application.name=user-ws
    #the following property will help communicate with eureka server
    eureka.client.serviceUrl.defaultZone = http://localhost:8010/eureka
    #the following will help the microservice to restart and deploy when we make changes
    spring.devtools.restart.enable=true
    
5 First start Eureka server application then start the microservice application

6 finally run the application and open browser call
    `http://localhost:8010` 

* If every thing go fine the microservice will be visible in Eureka dashboard under the instance list. 
