package com.example.EmployeePayRollApp.repository;

import com.example.EmployeePayRollApp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}