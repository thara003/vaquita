package Vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Vaquita.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{
	
}
