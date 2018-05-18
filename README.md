##### Description

Used Spring Initializr to create a Spring Boot application with JPA/Hibernate for persistence and H2 for an in-memory database. Used Spring Data JPA and Spring Boot Test to create integration tests.

##### To run the Tin Roof code challenge solution

1. Have java, maven and curl installed on your computer.
2. From my github, download the tinroof-master repository to your local computer.
3. Open a terminal program.
4. Change directories into the tinroof-master directory.
5. At the command prompt run
   >mvn spring-boot:run
6. Run some of the curl commands below in another terminal window. 

###### To run all tests
1. Make sure you have opened a terminal program and are in the tinroof-master directory.
2. From the command line run
   >mvn test
   
##### Manual curl tests commands from command line

GET all Calendars

curl localhost:8080/calendar/calendars/

GET Calendar by id

curl localhost:8080/calendar/calendar/1

DELETE Calendar by id

curl -X DELETE http://localhost:8080/people/1

Create new Calendar

curl -i -X POST -H "Content-Type:application/json" -d "{  &#92;"name&#92;": &#92;"testCal3&#92;",  &#92;"user&#92;" : &#92;"testUserc&#92;" }" http://localhost:8086/calendar/calendar
