package com.Attendance.Domain;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{

    private String employeeNumber;
    private EmployeeContact employeeContact;
    private EmployeePosition employeePosition;
    private List<EmployeeAddress> employeeAddressList;
    private String status = null;

    private Employee(){

    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public EmployeeContact getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(EmployeeContact employeeContact) {
        this.employeeContact = employeeContact;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public List<EmployeeAddress> getEmployeeAddressList() {
        return employeeAddressList;
    }

    public void setEmployeeAddressList(List<EmployeeAddress> employeeAddressList) {
        this.employeeAddressList = employeeAddressList;
    }

    public Employee(Builder build){
        this.employeeNumber = build.empNr;
        this.employeeContact = build.employeeContact;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder{
        private String empNr;
        private EmployeeClockInOut employeeClockInOut;
        private EmployeeContact employeeContact;
        private List<EmployeeAddress> employeeAddressList;
        public String postalCode;
        public String postalAddress;
        public String physicalAddress;

        public Builder employeeNumber(String value)
        {
            this.empNr = value;
            return this;
        }

        public Builder employeeContact(EmployeeContact value)
        {
            this.employeeContact = value;
            return this;
        }

        public Builder employeeAddress(List<EmployeeAddress> value)
        {
            this.employeeAddressList = value;
            return this;
        }

        public Employee build(){
            return new Employee((this));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return employeeNumber == employee.employeeNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
