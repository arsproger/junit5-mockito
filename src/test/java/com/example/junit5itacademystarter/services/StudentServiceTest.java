package com.example.junit5itacademystarter.services;

import com.example.junit5itacademystarter.models.Student;
import com.example.junit5itacademystarter.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
    @Mock
    private StudentRepository studentRepository;
    @InjectMocks
    private StudentService studentService;

    Student student = Student.builder()
            .id(1L)
            .name("Arsen")
            .surname("Bekboev")
            .age(17)
            .department("Java")
            .build();

    @Test
    public void testSave() {
        when(studentRepository.save(student)).thenReturn(student);
        Student maybeStudent = studentService.save(student);

        assertThat(student).isEqualTo(maybeStudent);
    }

    @Test
    public void testGetById() {
        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));

        Optional<Student> maybeStudent = studentService.getById(1L);

        assertThat(student).isEqualTo(maybeStudent.get());
    }

    @Test
    public void testGetAll() {
        when(studentRepository.findAll()).thenReturn(Collections.singletonList(student));

        List<Student> students = studentService.getAll();

        assertThat(students).isEqualTo(Collections.singletonList(student));
    }

    @Test
    public void testUpdate() {
        student.setName("Bob");

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
        when(studentRepository.save(student)).thenReturn(student);

        Student maybeStudent = studentService.updateById(1L, student);

        assertThat(student.getName()).isEqualTo(maybeStudent.getName());
    }


}
