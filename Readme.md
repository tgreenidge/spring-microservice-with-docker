### Problem statement from the client 
We are a credit union, and would like our members, as well as admin to access and submit data on claims, loans, accounts, member information, etc. Currently, the claims information is managed using ledgers and information may be stored on drives. The Credit Union would like to integrate the claims information into their online service.

### What business problem are you trying to solve with technology?
Integrate a new service to an existing technology. 

### Technical requirements of solving the business problem
* A eureka server
* A zuul api gateway
* Docker
* Spring Boot
* Java
* Postgres Database
* Reactjs Frontend

### A solution for a monolithic existing service service
Simply add necessary pages and databases to the existing app

### Explain how to breakdown the monolithic service
To break down the monolithic service, may be best to create microservices for each related feature for the app. For example, Claims can be one app, and loans another, while managing members could be another feature for the credit union. All related tables will be housed separately.

### How to make the monolithic service scalable
To make the monolithic app more scalable, it may be rete

### The pros/cons of implementing a monolithic problem
	* A monolithic implementation may speed up calls to the back end, and data transfers since everything would be contained in one app. This could reduce the chances of Api calls being lost along the way. Additionally, the monothic app can make it very complex for new developers to learn the app and how different levels relate to each other.


### How the microservice will solve the companies problems
A microservice can help improve scalability, end to end testing since the apps will be smaller

### Include an external case study that demonstrates a similar problem/solution
Uber: https://eng.uber.com/building-tincup/


