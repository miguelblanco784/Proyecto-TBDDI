# Dealership Database Management System

A desktop Java application developed as an academic database project to model and manage the core operations of a vehicle dealership network.

The system combines a graphical interface with a relational data-access layer to work with dealerships, manufacturers, vehicle models, plants, inventory, customers, employees, and sales documentation.

## Main features

- Manage dealerships, manufacturers, models, plants, and vehicles
- Track dealership inventory by vehicle identification number
- Register customers, employees, and related business entities
- Create customer invoices and invoice-detail records
- Calculate totals, taxes, and subtotals
- Organize database operations through DAO and business-object layers
- Support operational logging and audit-related records
- Provide a Java Swing interface for data entry and administration

## Core entities

- Dealerships
- Manufacturers and brands
- Vehicle models and production plants
- Vehicles and inventory
- Customers and employees
- Customer invoices and invoice details
- Company and business-type records
- Users and activity logs

## Technologies

- Java
- Java Swing
- JDBC
- SQL and relational database design
- DAO and business-object architecture
- NetBeans

## Architecture

The project separates responsibilities into multiple layers:

```text
Model entities     Business objects and domain records
DAO layer          Database operations and persistence
Business layer     Application logic and coordination
Swing interface    User interaction and administration
```

## Running the project

1. Clone the repository.
2. Open the project in NetBeans.
3. Create or restore the required relational database.
4. Review the database connection configuration for your local environment.
5. Build and run the application.

## Academic context

This repository is preserved as a university project focused on relational modeling, database connectivity, layered Java architecture, and desktop application development.

> This is an academic learning project and may require environment-specific database configuration before it can run.
