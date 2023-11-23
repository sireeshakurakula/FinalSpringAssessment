package com.angular2.newAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.angular2.newAngular.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
    
}
