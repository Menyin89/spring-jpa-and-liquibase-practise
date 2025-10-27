package com.practice.jpa.service

import com.practice.jpa.EmployeeDto
import com.practice.jpa.model.Employee
import com.practice.jpa.repository.EmployeeRepository
import org.springframework.stereotype.Service


@Service
class EmployeeService(
    private val employeeRepository: EmployeeRepository
) {

    fun listEmployees(): MutableList<Employee> {
        return employeeRepository.findAll()
    }

//    fun findEmployeeById(id: Long): EmployeeDto {
//        return toDto(employeeRepository.findById(id).orElseThrow(notFountException(id)))
//    }
//
//    fun createEmployee(command: EmployeeDto): EmployeeDto {
//        val employee = Employee(command.name().toUpperCase())
//        employeeRepository.save(employee)
//        return toDto(employee)
//    }
}