package com.Attendance.Repositories;

import com.Attendance.Domain.Employee;

public interface EmployeeRepository {
    Employee create(Employee employee);
    Employee read(int id);
    Employee update(Employee employee);
    void delete(int id);
}
