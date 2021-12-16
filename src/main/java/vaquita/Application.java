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
		Events events = new Events("Wedding","haldi","2022-01-12","high","Goa","panaji",403001,"pending",client);
		eventsService.addEvents(events);
		Staff staff = new Staff("Ramesh","Mumbai","manager",100000,"password",events);
		staffService.addStaff(staff);
		Userrequest userrequest = new Userrequest("confirmed",client, events);
		userrequestService.addUserrequest(userrequest);
		Feedback feedback = new Feedback("satisfied","good", "robert123@gmail.com",client);
		feedbackService.addFeedback(feedback);
		Manager manager = new Manager(client,events,staff);
		managerService.addManager(manager);
		Billing billing = new Billing(1234,50000,"paid",client,events);
		billingService.addBilling(billing);

		Admin admin = new Admin("admin","adminpassword");
		adminService.addAdmin(admin);


	}

}

