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


		Client client = new Client("Robert","robert123@gmail.com", 4256795234L,"robert123","robertpass");
		clientService.addClient(client);
		Client client1 = new Client("Archit","architkak@gmail.com", 9235678123L,"archit123","architpass");
		clientService.addClient(client1);
		Client client2 = new Client("Anantha","anathakm@gmail.com", 76589378456L,"anantha123","ananthapass");
		clientService.addClient(client2);
		Client client3 = new Client("Nayan","nayanm@gmail.com", 7854678567L,"nayan123","nayanpass");
		clientService.addClient(client3);
		Events events = new Events("Wedding","haldi","2022-01-12","high","Goa","panaji",403001,"pending",client);
		eventsService.addEvents(events);
		Events events1 = new Events("Birthday","buffet","2022-03-27","high","Mumbai","AV hotel",403045,"PENDING",client);
		eventsService.addEvents(events1);
		Events events2 = new Events("Wedding","Music","2022-02-10","medium","Kerala","Kochi",688564,"PENDING",client);
		eventsService.addEvents(events2);
		Staff staff = new Staff("Ramesh","Mumbai","manager",100000,"password",events);
		staffService.addStaff(staff);
		Staff staff1 = new Staff("Mahesh","Mumbai","manager",100000,"password",events);
		staffService.addStaff(staff1);
		Staff staff2 = new Staff("Suresh","Mumbai","manager",100000,"password",events);
		staffService.addStaff(staff2);
		Userrequest userrequest1 = new Userrequest("confirmed",client, events);
		userrequestService.addUserrequest(userrequest1);
		Feedback feedback = new Feedback("satisfied","good", "robert123@gmail.com",client);
		feedbackService.addFeedback(feedback);
		Feedback feedback1 = new Feedback("satisfied","nice", "architkak@gmail.com",client);
		feedbackService.addFeedback(feedback1);
		Manager manager = new Manager(client,events,staff);
		managerService.addManager(manager);
		Billing billing = new Billing(1234,50000,"paid",client,events);
		billingService.addBilling(billing);
		

		Admin admin = new Admin("admin","adminpassword");
		adminService.addAdmin(admin);


	}

}

