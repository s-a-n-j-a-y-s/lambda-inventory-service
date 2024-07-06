# `LAMBDA` - An Inventory Management Service

## Table of Contents
- [Overview](#overview)
- [Technologies](#technologies)
- [Setup](#setup)

## Overview

This Inventory Management Service is a robust Spring Boot application designed to efficiently track and manage inventory across multiple locations. It offers real-time updates, REST API endpoints, and integration with a PostgreSQL database for persistent storage.

## Technologies

- Java 21
- Spring Boot 3.1.1
- Spring Data JPA
- PostgreSQL 16
- Maven

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/s-a-n-j-a-y-s/lambda-inventory-service.git
2. Navigate to the project directory
3. Configure the database connection as per your need:
   1. Navigate to `src/main/resources/application.properties`:
   2. Change the datasource username and password:
      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/inventory
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```
4. Spin up the application using maven:
   ```bash
   mvn spring-boot:run
   ```      


