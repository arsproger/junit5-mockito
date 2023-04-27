package com.example.junit5itacademystarter.services;

import com.example.junit5itacademystarter.models.Student;
import com.example.junit5itacademystarter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Long deleteById(Long id) {
        studentRepository.deleteById(id);
        return id;
    }

    public Student updateById(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElse(null);
        if(student == null)
            return null;

        student.setName(updatedStudent.getName());
        student.setSurname(updatedStudent.getSurname());
        student.setAge(updatedStudent.getAge());
        student.setDepartment(updatedStudent.getDepartment());

        return studentRepository.save(student);
    }

}
