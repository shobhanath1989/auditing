package li.barlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import li.barlog.domain.Foo;
import li.barlog.domain.User;
import li.barlog.repository.FooRepository;
import li.barlog.repository.UserRepository;
import li.barlog.service.CurrentUserService;
//shobhanath
//bcd
@SpringBootApplication
public class App implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args).registerShutdownHook();
	}
//sharma
	@Autowired
	private FooRepository fooRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CurrentUserService currentUserService;

	@Override
	public void run(String... args) {
		Foo o = new Foo();
		o.setData("test data");
		fooRepository.save(o);

		User u = new User();
		u.setName("shobhanath");
		userRepository.save(u);
		
		fooRepository.findAll().forEach(System.out::println);
		userRepository.findAll().forEach(System.out::println);

		currentUserService.setCurrentUserToDoe();

		o.setData("New test data");
		fooRepository.save(o);
		u.setName("mahantesh");
		userRepository.save(u);
		fooRepository.findAll().forEach(System.out::println);
		userRepository.findAll().forEach(System.out::println);
		
		
		
		
		
		
	}
}
