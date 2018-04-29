package com.Attendance.Domain;

import java.io.Serializable;

public class EmployeeContact implements Serializable {

    private String cellNumber, homeNumber;

    public EmployeeContact(Builder builder) {

    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeContact)) return false;

        EmployeeContact that = (EmployeeContact) o;

        return cellNumber != null ? cellNumber.equals(that.cellNumber) : that.cellNumber == null;
    }

    @Override
    public int hashCode() {
        return cellNumber != null ? cellNumber.hashCode() : 0;
    }

    public static class Builder {
        String cellNumber, homeNumber;

        public Builder cellNumber(String value){
            this.cellNumber = value;
            return this;
        }
        public Builder homeNumber(String value){
            this.homeNumber = value;
            return this;
        }
        public EmployeeContact build(){
            return new EmployeeContact((this));
        }
    }
}
