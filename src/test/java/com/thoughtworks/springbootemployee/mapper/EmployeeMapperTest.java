package com.thoughtworks.springbootemployee.mapper;

import com.thoughtworks.springbootemployee.dto.EmployeeRequest;
import com.thoughtworks.springbootemployee.dto.EmployeeResponse;
import com.thoughtworks.springbootemployee.model.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeMapperTest {
    @Test
    void should_return_employee_when_mapper_to_employee_given_employeeRequest() {
        //given
        EmployeeMapper employeeMapper = new EmployeeMapper();
        EmployeeRequest employeeRequest = new EmployeeRequest(1,  28, "xiaoxia","female", 1111.0, 1);

        //when
        Employee employee = employeeMapper.toEmployee(employeeRequest);

        //then
        assertEquals(employeeRequest.getId(), employee.getId());
        assertEquals(employeeRequest.getName(), employee.getName());
        assertEquals(employeeRequest.getAge(), employee.getAge());
        assertEquals(employeeRequest.getGender(), employee.getGender());
        assertEquals(employeeRequest.getSalary(), employee.getSalary());
        assertEquals(employeeRequest.getCompanyId(), employee.getCompanyId());
    }

    @Test
    void should_return_employeeResponse_when_mapper_to_response_given_employee() {
        //given
        EmployeeMapper employeeMapper = new EmployeeMapper();
        Employee employee = new Employee(1,  28, "xiaoxia","female", 1111.0, 1);

        //when
        EmployeeResponse employeeResponse = employeeMapper.toResponse(employee);

        //then
        assertEquals(employee.getId(), employeeResponse.getId());
        assertEquals(employee.getName(), employeeResponse.getName());
        assertEquals(employee.getAge(), employeeResponse.getAge());
        assertEquals(employee.getGender(), employeeResponse.getGender());
        assertEquals(employee.getSalary(), employeeResponse.getSalary());
        assertEquals(employee.getCompanyId(), employeeResponse.getCompanyId());
    }
}
