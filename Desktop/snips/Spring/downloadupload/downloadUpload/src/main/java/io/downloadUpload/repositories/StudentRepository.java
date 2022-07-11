package io.downloadUpload.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.downloadUpload.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
