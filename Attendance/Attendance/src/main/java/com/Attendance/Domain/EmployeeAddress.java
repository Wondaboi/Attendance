package com.Attendance.Domain;

import java.io.Serializable;

public class EmployeeAddress implements Serializable {

    private EmployeeAddress(EmployeeContact.Builder builder) {}
    public EmployeeAddress(Employee.Builder build){
        this.physicalAddress = build.physicalAddress;
        this.postalAddress = build.postalAddress;
        this.postalCode = build.postalCode;
    }

    String physicalAddress, postalAddress, postalCode;

    public EmployeeAddress(Builder builder) {

    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeAddress)) return false;

        EmployeeAddress that = (EmployeeAddress) o;

        if (physicalAddress != null ? !physicalAddress.equals(that.physicalAddress) : that.physicalAddress != null)
            return false;
        if (postalAddress != null ? !postalAddress.equals(that.postalAddress) : that.postalAddress != null)
            return false;
        return postalCode != null ? postalCode.equals(that.postalCode) : that.postalCode == null;
    }

    @Override
    public int hashCode() {
        int result = physicalAddress != null ? physicalAddress.hashCode() : 0;
        result = 31 * result + (postalAddress != null ? postalAddress.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }

    public static class Builder {
            String physicalAddress, postalAddress, postalCode;

            public Builder physicalAddress(String value){
                this.physicalAddress = value;
                return this;
            }
            public Builder postalAddress(String value){
                this.postalAddress = value;
                return this;
            }
            public Builder postalCode(String value){
                this.postalCode = value;
                return this;
            }
            public EmployeeAddress build(){
                return new EmployeeAddress(this);
            }
        }
    }

