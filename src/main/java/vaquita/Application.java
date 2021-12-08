package Vaquita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Vaquita.entity.Course;
import Vaquita.entity.Student;
import Vaquita.service.CourseService;
import Vaquita.service.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseService courseService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Student student = new Student("Ananthu");
		studentService.save(student);
		Course course = new Course("Hey");
		courseService.save(course);
		student.addCourse(course);
		studentService.save(student);
		course.addStudent(student);
		courseService.save(course);
	}

}

