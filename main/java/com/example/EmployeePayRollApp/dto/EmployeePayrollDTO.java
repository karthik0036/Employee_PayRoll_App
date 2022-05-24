package com.example.EmployeePayRollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    //@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name is invalid")
    @NotEmpty(message = "Employee Name can't be null")
    public String name;

    @Min(value = 500, message = "Min Wage should be more than 500")
    public long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Name=" + name + " Salary=" + salary;
    }
}
