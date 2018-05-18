Manual tests commands from command line

GET all Calendars
curl localhost:8080/calendar/calendar/

GET Calendar by id
curl localhost:8080/calendar/calendar/1

DELETE Calendar by id
curl -X DELETE http://localhost:8080/people/1

Create new Calendar
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"testCal3\",  \"user\" : \"testUserc\" }" http://localhost:8086/calendar/calendar