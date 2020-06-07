#GITHUB API REPOSITORY REST ENDPOINT 

Steps to run the application

>>Please download the file 

>> Import the application as Maven application using eclipse.

>>run the MicroServiceMain.java class are java application

>>once tomcat starts running please goto  localhost:8080

>>the below endpoint will give the desired outcome

      localhost:8080/lastestrepo
      localhost:8080/olduser

will produce the required output

Endpoints

/latestrepo

/olduser

**1. Find the hottest repositories created in the last week**

The following fields should be returned:

      name
      watchers_count
      language
      description
      html_url
      
  
**2. Find the oldest user accounts with zero followers **

The following fields should be returned:

      id
      login
      html_url
