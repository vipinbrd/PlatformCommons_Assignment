# StudentManagementSystem

<!-- ============================================  TITLE ======================================================  -->

# RestFul Webservice created for Student Management System.
* It is an individual project created to manage a student database and exposing API for various CRUD operation.

  
<!-- ============================================  TECH STACK ======================================================  -->

## Tech Stack

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* swagger ui

<!-- ============================================  FEATURES ======================================================  -->

  
## Features

* Admin and Student authorization and authenticaiton into the applicaiton has been done using Spring Security. Validation has been considered over the input recieved from the client.<br>



* Admin Controls:
    * Login to the application is done by  username and password.

    * Admins can access various details of all the students and also can change their courses.
    * Admin can log out from the application.
* Student Controls:
    * Only an admin can add a student to the database.
    * A student can login using his  username and password.
    * A student can leave a course of his/her choice assgined to him/her by the admin.
    * Get all the courses and topics assigned to the him/her. Can search for a course/topics using course-name/topic-name.
   


<!-- ============================================  MODULES ======================================================  -->

## Modules

* Admin Module
* Student Module
* Address Module
* Course Module


<!-- ============================================  INSTALLATION AND RUN ======================================================  -->

## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties] file.


```
    #changing the server port
    server.port=8888

    #db specific properties
    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/studentManagement
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=Root
    
    #ORM s/w specific properties
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

```
* Swagger dependency has been added to the applicaiton, Hence API's can be accessed using PostMan or Swagger UI.
* URL for accessing Swagger UI : http://localhost:8888/swagger-ui/



