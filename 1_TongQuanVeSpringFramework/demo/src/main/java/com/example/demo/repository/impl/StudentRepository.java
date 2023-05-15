package com.example.demo.repository.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
private static List<Student> studentList;

        static {
            studentList = new ArrayList<>();
            studentList.add(new Student(1,"Nguyễn Thị Hào",8.5));
            studentList.add(new Student(2,"Phạm Xuân Diệu",7.2));
            studentList.add(new Student(3,"Trương Đình Nghệ",5.3));
            studentList.add(new Student(4,"Dương Văn Quan",9.6));
            studentList.add(new Student(5,"Hoàng Trần Nhi Nhi",5.7));
            studentList.add(new Student(6,"Tôn Nữ Mộc Châu",8.6));
            studentList.add(new Student(7,"Nguyễn Mỹ Kim",5.0));
            studentList.add(new Student(8,"Nguyễn Tâm Đắc",5.6));
        }
    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
