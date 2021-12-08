package Vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Vaquita.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
