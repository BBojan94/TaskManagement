# Task Management System

## Overview

The Task Management System is a backend application built with Spring Boot and MySQL to help users efficiently manage tasks. It provides RESTful APIs for creating, updating, retrieving, and deleting tasks, along with authentication and authorization using Spring Security.

## Features

- CRUD operations: Cread, Read, Update and Delete tasks
- Spring Security: Secure endpoints with authentication
- Spring Data JPA: Simplified database interactions
- MySQL Database: Persistent data storage

## Tech Stack

- Backend: Spring Boot, Spring Security, Spring Data JPA
- Database: MySQL
- Authentication: JWT-based authentication
- Build Tool: Maven

## API Endpoints

| Method         | Endpoint               | Description               |
|----------------|------------------------|---------------------------|
| GET            | /tasks                 | Get all tasks             |
| GET            | /tasks/{id}            | Get task by ID            |
| POST           | /tasks                 | Add a new task            |
| PUT            | /tasks/{id}            | Update a task             |
| DELETE         | /tasks/{id}            | Delete a task             |

## Author
Bojan Bozovic\
GitHub: [BBojan94](https://github.com/BBojan94/)
