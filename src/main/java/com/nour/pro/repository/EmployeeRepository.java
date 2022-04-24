package com.nour.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nour.pro.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
