package com.example.EmployeePayRollApp.services;

import com.example.EmployeePayRollApp.dto.EmployeePayrollDTO;
import com.example.EmployeePayRollApp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);
}