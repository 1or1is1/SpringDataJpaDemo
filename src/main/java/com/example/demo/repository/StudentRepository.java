package com.example.demo.repository;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = :emailId")
    Optional<Student> findByEmail(@Param("emailId") String email);

    List<Student> findByAgeGreaterThanEqual(Integer age);

    @Query("SELECT b FROM Student s INNER JOIN Book b on s.id = b.student.id where s.id = :student_id")
    List<Book> getBooksIssued(@Param("student_id") Long id);

}
