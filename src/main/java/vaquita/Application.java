package vaquita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vaquita.entity.Client;
import vaquita.entity.Course;
import vaquita.entity.Student;
import vaquita.service.ClientService;
import vaquita.service.CourseService;
import vaquita.service.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseService courseService;

	@Autowired
	private ClientService clientService;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
//		Student student = new Student("Ananthu");
//		studentService.save(student);
		Course course = new Course("Hey");

		Client client = new Client("Client1","client1@gmail.com", 1123456789L,"place","city1",688561,"client1","password");
		clientService.addClient(client);
//		courseService.save(course);
//		student.addCourse(course);
//		studentService.save(student);
//		course.addStudent(student);
//		courseService.save(course);
	}

}

