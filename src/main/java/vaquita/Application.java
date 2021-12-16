package vaquita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vaquita.entity.*;
import vaquita.service.*;


@SpringBootApplication
public class Application implements CommandLineRunner
{

	@Autowired
	private ClientService clientService;

	@Autowired
	private EventsService eventsService;

	@Autowired
	private StaffService staffService;

	@Autowired
	private UserrequestService userrequestService;

	@Autowired
	private FeedbackService feedbackService;

	@Autowired
	private ManagerService managerService;

	@Autowired
	private BillingService billingService;

	@Autowired
	private AdminService adminService;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
//		Student student = new Student("Ananthu");
//		studentService.save(student);
//		Course course = new Course("Hey");

		Client client = new Client("Client1","client1@gmail.com", 1123456789,"place","city1",688561,"client1","password");
		clientService.addClient(client);
		Events events = new Events("Wedding","haldi","10-12-2021","high","place","city",688561,"done","staff1",client);
		eventsService.addEvents(events);
		Staff staff = new Staff("staff1","place","manager",1000,"completed","password",events);
		staffService.addStaff(staff);
		Userrequest userrequest = new Userrequest("confirmed",client, events);
		userrequestService.addUserrequest(userrequest);
		Feedback feedback = new Feedback("satisfied","good", "chumma@gmail.com",client);
		feedbackService.addFeedback(feedback);
		Manager manager = new Manager(client,events,staff);
		managerService.addManager(manager);
		Billing billing = new Billing(1234,13000,"paid",client,events);
		billingService.addBilling(billing);

		Admin admin = new Admin("admin","adminpassword");
		adminService.addAdmin(admin);

//		courseService.save(course);
//		student.addCourse(course);
//		studentService.save(student);
//		course.addStudent(student);
//		courseService.save(course);
	}

}

