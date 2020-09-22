package main.java;

public class APIUrl {

    public String employeesURL = "/api/v1/employees";
    public String employeeURL = "/api/v1/employee/";

    public APIUrl(String baseURL){
        this.employeesURL = baseURL + employeesURL;
        this.employeeURL = baseURL + employeeURL;
    }
}
