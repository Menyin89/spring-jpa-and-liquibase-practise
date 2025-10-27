package com.practice.jpa.repository

import com.practice.jpa.EmployeeDto
import com.practice.jpa.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface EmployeeRepository : JpaRepository<Employee, Long> {

//    @Query("select new com.practice.jpa.EmployeeDto(e.id, e.name) from Employee e")
//    fun findAllResources(): MutableList<EmployeeDto?>?
}