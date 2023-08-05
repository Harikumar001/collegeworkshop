package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static void main(String... args){

    }

    public void addStudent(){
          Student student=new Student();
          List<Student>studentList=new ArrayList<student>();
          student.setStudentId("033");
          student.setName("Name");
          student.startDate("01/08/2023");
          student.setEndDate("08/01/2025");
          studentList.add(student)


    }

    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}
