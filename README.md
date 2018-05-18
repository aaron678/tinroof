#####To run teh Tin Roof code challenge solution

1. Have java, maven and curl installed on your computer.
2. From my github, download the challenge repository to your local computer.
3. Open a terminal program.
4. Change directories into the challenge directory.
5. At the command prompt run
   mvn spring-boot:run
6. Run some of the curl commands below in another terminal window. 

#####Manual tests commands from command line

GET all Calendars

curl localhost:8080/calendar/calendars/

GET Calendar by id

curl localhost:8080/calendar/calendar/1

DELETE Calendar by id

curl -X DELETE http://localhost:8080/people/1

Create new Calendar

curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"testCal3\",  \"user\" : \"testUserc\" }" http://localhost:8086/calendar/calendar