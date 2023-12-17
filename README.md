# Todo List Management Service
**Project Description**

This project is a Todo List Management Service, a CRUD (Create, Read, Update, Delete) application built on Spring MVC. It allows users to view a list of tasks, add new tasks, edit, and delete existing ones. The project leverages modern web development technologies and frameworks, supports database interaction with MySQL, and is containerized for Docker environments.

**Key Technologies**

* **Spring and Spring MVC:** Used for creating the web interface and handling requests.
* **Hibernate:** Provides interaction with the MySQL database.
* **Thymeleaf:** A server-side template engine for rendering HTML pages.
* **MySQL:** Database management system for storing task information.
* **Maven:** A build and dependency management tool.
* **Docker and Docker Compose:** Used for containerizing the application and its database.

**Project Structure**

* **Entity Layer (domain package):** Contains the Task class representing the task entity.
* **Config Package:** Configuration of the Spring MVC application and Hibernate database access.
* **DAO Layer:** TaskDAO class for database operations with support for CRUD and pagination.
* **Service Layer:** Logic for creating and editing tasks.
* **Controller Layer:** Handles service requests: task listing, adding, editing, and deleting.
* **Templates:** HTML templates using Thymeleaf, with separate files for styles and scripts.

**Running the Project**

The project is packaged into Docker containers. To run:

Clone the repository.
Use **docker-compose up** to start both the application and the database.
