package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class CompanyDTO {

    private int id;

    private String name;
    /**
     * company 是 createTime
     */
    private Date createdTime;

    private String createFormatTime;

    /**
     *
     */
    private String employeeName;

    private int employeeAge;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getCreatedTime() {
//        return createdTime;
//    }
//
//    public void setCreatedTime(Date createdTime) {
//        this.createdTime = createdTime;
//    }
//
//    public String getCreateFormatTime() {
//        return createFormatTime;
//    }
//
//    public void setCreateFormatTime(String createFormatTime) {
//        this.createFormatTime = createFormatTime;
//    }
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public int getEmployeeAge() {
//        return employeeAge;
//    }
//
//    public void setEmployeeAge(int employeeAge) {
//        this.employeeAge = employeeAge;
//    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdTime=" + createdTime +
                ", createFormatTime='" + createFormatTime + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }
}
