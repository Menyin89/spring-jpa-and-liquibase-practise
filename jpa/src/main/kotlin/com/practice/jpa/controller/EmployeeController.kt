package com.practice.jpa.controller

import com.practice.jpa.EmployeeDto
import com.practice.jpa.model.Employee
import com.practice.jpa.service.EmployeeService
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder


@RestController
@RequestMapping("/api/employee")
class EmployeeController(
    private val employeesService: EmployeeService
) {

    @GetMapping
    fun listEmployees(@RequestHeader headers: HttpHeaders?): MutableList<Employee> {
        return employeesService.listEmployees()
    }

//    @GetMapping("/{id}")
//    fun findEmployeeById(@PathVariable("id") id: Long): EmployeeDto {
//        return employeesService.findEmployeeById(id)
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    fun createEmployee(
//        @Valid @RequestBody employeeToCreate: EmployeeDto?,
//        builder: UriComponentsBuilder
//    ): ResponseEntity<EmployeeDto?> {
//        val employee: Unit /* TODO: class org.jetbrains.kotlin.nj2k.types.JKJavaNullPrimitiveType */? =
//            employeesService.createEmployee(employeeToCreate)
//        return ResponseEntity.created(builder.path("/api/employees/{id}").buildAndExpand(employee.id()).toUri())
//            .body<EmployeeDto?>(employee)
//    }

}