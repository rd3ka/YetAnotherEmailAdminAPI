package xyz.YA.Database;

public class Query {
                                        /*
                                         * Here we write all the queries related to the Employee
                                         * and the Password Table
                                         */

                                        final static public String CREATE_YetAnotherDatabase = "CREATE DATABASE YetAnotherDatabase";

                                        final static public String CREATE_EMP_TABLE = "CREATE TABLE employee ( "
                                                                                                                        + "employee_id INT PRIMARY KEY,"
                                                                                                                        + "first_name VARCHAR(50) NOT NULL, "
                                                                                                                        + "last_name VARCHAR(50) NOT NULL, "
                                                                                                                        + "dob DATE, "
                                                                                                                        + "role VARCHAR(50), "
                                                                                                                        + "department VARCHAR(100), "
                                                                                                                        + "email VARCHAR(100) UNIQUE NOT NULL, "
                                                                                                                        + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                                                                                                                        + "updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP "
                                                                                                                        + ")";

                                        /* Create an entry to the employee table, C - Create */
                                        final static public String INSERT_EMP = "INSERT INTO employee "
                                                                                                                        + "(employee_id, first_name, last_name, dob, role, department, email) "
                                                                                                                        + "VALUES "
                                                                                                                        + "(?, ?, ?, ?, ?, ?, ? )";
                                        final static public String READ_EMP_first_name = "SELECT first_name FROM employee"
                                                                                                                        + "WHERE employee = ?";

                                        final static public String READ_EMP_last_name = "SELECT last_name FROM employee"
                                                                                                                        + "WHERE employee = ?";

                                        final static public String READ_EMP_dob = "SELECT dob FROM employee"
                                                                                                                        + "WHERE employee = ?";

                                        final static public String READ_EMP_department = "SELECT department FROM employee"
                                                                                                                        + "WHERE employee = ?";

                                        final static public String READ_EMP_email = "SELECT email FROM employee"
                                                                                                                        + "WHERE employee = ?";

                                        /* Select Queries for reading key attributes, R - Read */
                                        final static public String READ_EMP_ALL = "SELECT * FROM employee";

                                        /* Update queries to the employee table, U - Update */
                                        final static public String UPDATE_EMP_first_name = "UPDATE employee"
                                                                                                                        + "SET first_name = ?"
                                                                                                                        + "WHERE employee_id = ?";
                                        /* Update queries to the employee table, U - Update */
                                        final static public String UPDATE_EMP_last_name = "UPDATE employee"
                                                                                                                        + "SET last_name = ?"
                                                                                                                        + "WHERE employee_id = ?";
                                        /* Update queries to the employee table, U - Update */
                                        final static public String UPDATE_EMP_dob = "UPDATE employee "
                                                                                                                        + "SET dob = ?"
                                                                                                                        + "WHERE employee_id = ?";
                                        /* Update queries to the employee table, U - Update */
                                        final static public String UPDATE_EMP_role = "UPDATE employee "
                                                                                                                        + "SET role = ?"
                                                                                                                        + "WHERE employee_id = ?";
                                        /* Update queries to the employee table, U - Update */
                                        final static public String UPDATE_EMP_department = "UPDATE employee"
                                                                                                                        + "SET department = ?"
                                                                                                                        + "WHERE employee_id = ?";
                                        /* Update queries to the employee table, U - Update */
                                        final static public String UPDATE_EMP_email = "UPDATE employee"
                                                                                                                        + "SET email = ?"
                                                                                                                        + "WHERE employeeid = ?";

                                        final static public String CREATE_PASS_TABLE = "CREATE TABLE passowrd ( "
                                                                                                                        + "employee_id INT PRIMARY KEY REFERENCES employee(employee_id) ON DELETE CASCADE, "
                                                                                                                        + "encrypted_password VARCHAR(255) NOT NULL, "
                                                                                                                        + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                                                                                                                        + "updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP "
                                                                                                                        + ")";
}