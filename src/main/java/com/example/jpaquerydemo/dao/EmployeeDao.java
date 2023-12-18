package com.example.jpaquerydemo.dao;

import com.example.jpaquerydemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    Optional<Employee> findByFirstNameAndLastName(String firstName,String LastName);

    //Optional<Employee> findFirstOrderBySalaryDesc();

    Optional<Employee> findByEmail(String email);

}
