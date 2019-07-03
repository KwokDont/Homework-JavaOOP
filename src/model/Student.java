package model;

import java.io.Serializable;

public class Student implements Serializable {

    public Student(String studentName,int age,int sex,String studentNo){
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.studentNo = studentNo;
    }

    private String studentName;
    private int age;
    private int sex;
    private String studentNo;

    public String toString(){
        return "studentName:"+this.studentName+" age:"+this.age+" sex:"+this.sex+" studentNo:"+this.studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
}
