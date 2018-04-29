package com.Attendance.Domain;
import java.util.Date;
import java.sql.Time;

public class EmployeeClockInOut {
    private Time employeeClockIn;
    private Time employeeClockOut;
    private Date Date;

    public EmployeeClockInOut(Builder builder) {

    }

    public Time getEmployeeClockIn() {
        return employeeClockIn;
    }

    public void setEmployeeClockIn(Time employeeClockIn) {
        this.employeeClockIn = employeeClockIn;
    }

    public Time getEmployeeClockOut() {
        return employeeClockOut;
    }

    public void setEmployeeClockOut(Time employeeClockOut) {
        this.employeeClockOut = employeeClockOut;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeClockInOut)) return false;

        EmployeeClockInOut that = (EmployeeClockInOut) o;

        if (employeeClockIn != null ? !employeeClockIn.equals(that.employeeClockIn) : that.employeeClockIn != null)
            return false;
        if (employeeClockOut != null ? !employeeClockOut.equals(that.employeeClockOut) : that.employeeClockOut != null)
            return false;
        return Date != null ? Date.equals(that.Date) : that.Date == null;
    }

    @Override
    public int hashCode() {
        int result = employeeClockIn != null ? employeeClockIn.hashCode() : 0;
        result = 31 * result + (employeeClockOut != null ? employeeClockOut.hashCode() : 0);
        result = 31 * result + (Date != null ? Date.hashCode() : 0);
        return result;
    }

    public static class Builder {
        Time employeeClockIn,employeeClockOut;
        Date Date;

        public Builder employeeClockIn(Time value){
            this.employeeClockIn = value;
            return this;
        }
        public Builder employeeClockOut(Time value){
            this.employeeClockOut = value;
            return this;
        }

        public Builder Date(Time date) {
            this.Date = date;
            return this;
        }
        public EmployeeClockInOut build(){
            return new EmployeeClockInOut((this));
        }


    }
}
