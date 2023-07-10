package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "student")
public class Student {
    @Id
    private String _id;
    private String Studentname;
    private String Studentadd;
    private String mobile;

    public Student(String _id, String studentname, String studentadd, String mobile) {
        this._id = _id;
        Studentname = studentname;
        Studentadd = studentadd;
        this.mobile = mobile;
    }

    public Student() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public String getStudentadd() {
        return Studentadd;
    }

    public void setStudentadd(String studentadd) {
        Studentadd = studentadd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", Studentname='" + Studentname + '\'' +
                ", Studentadd='" + Studentadd + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

}

