package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.entity.Course;
import com.example.demo.entity.Enrollment;
import com.example.demo.entity.EnrollmentId;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentIdCard;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

        };
    }

    private static void saveStudents(StudentRepository studentRepository) {
        System.out.println("=======================INSERTING STUDENTS=======================");
        Student student1 = new Student("John", "Doe", "john.doe@example.com", 20);
        Student student2 = new Student("Jane", "Smith", "jane.smith@example.com", 22);
        Student student3 = new Student("Michael", "Johnson", "michael.johnson@example.com", 21);
        Student student4 = new Student("Sarah", "Lee", "sarah.lee@example.com", 19);
        Student student5 = new Student("Emily", "Brown", "emily.brown@example.com", 23);
        Student student6 = new Student("William", "Davis", "william.davis@example.com", 20);
        Student student7 = new Student("Olivia", "Miller", "olivia.miller@example.com", 21);
        Student student8 = new Student("Ethan", "Wilson", "ethan.wilson@example.com", 22);
        Student student9 = new Student("Ava", "Anderson", "ava.anderson@example.com", 19);
        Student student10 = new Student("James", "Martinez", "james.martinez@example.com", 23);

        studentRepository.saveAll(List.of(student1,
                student2,
                student3,
                student4,
                student5,
                student6,
                student7,
                student8,
                student9,
                student10));
        System.out.println("=======================STUDENTS INSERTED=======================");
    }


}
