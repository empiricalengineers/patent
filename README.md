# patent
1. Download or checkout the code from https://github.com/empiricalengineers/patent
2. Import the project into eclipse or other tool as maven project.
3. Execute the PatentApplication.java as java application. This would build the application ,start the embedded    tomcat and deploy the application
4. Access H2 database using http://localhost:8080/h2 and run the scripts from this below file. This would create few patent related data records.
      data-h2.sql
5. PatentController.java is the REST API to access the patent records. And it has the below appi methods
	Http:/localhost:8080/patents   -- to get all the patent records as Jason 		objects.
	Http:/localhost:8080/patents/patent/{id} -- to get a particular patent record   
	Http:/localhost:8080/patents/patent   -- to update/create existing/new patent 	record
6. DeadLineReportController.java is the REST API for deadline reports.
   	Http:/localhost:8080/deadline-report   -- to get all the deadline report 	records.
7. PatentAPITests.java -- is the  patent api unit testing  program


Technology stack:  Springboot, web, core, JPA, Junit, Mockito, quartz,tomcat,maven,devtools
Complete project structure looks like the below
