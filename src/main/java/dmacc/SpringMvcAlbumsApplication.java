package dmacc;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//
//import dmacc.beans.Albums;
//import dmacc.beans.Awards;
//import dmacc.beans.Producers;
//import dmacc.controller.BeanConfiguration;
//import dmacc.repository.AlbumsRepository;


@SpringBootApplication
public class SpringMvcAlbumsApplication {  //implements CommandLineRunner

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcAlbumsApplication.class, args);
		
		/*
		 * Need to use Command Line Runner to create the database, but not needed for Web portion
		 * 1. change the spring.jpa.hibernate.ddl-auto = create-drop to just create. 
		 * 2. add the driver-class-name line after the password line.  
		 * 3. comment out all of the command line runner code. 
		 * 4. change the scope of the following dependency's scope to provided: spring-boot-starter-data-JPA 
		 * 5. run the program and check your MySQL database to see if the tables were created. 
		 * 6. uncomment the command line runner code and run with that, and everything should hopefully work.
		 * 7. Remove the drop for the spring.jpa.hibernate.ddl-auto to prevent deleting data for next time.
		 */
			
	}
	/*
	@Autowired
	AlbumsRepository albumRepo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//I'm getting an error when running this, but the table is set up correctly for my web purposes.
		//Using an existing album bean
		Albums a = appContext.getBean("albums", Albums.class);
		System.out.println("Past Albums");
		Producers p = appContext.getBean("producer", Producers.class);
		System.out.println("Past Producer");
		Awards ribbons = appContext.getBean("award", Awards.class);
		System.out.println("Past ribbons");
		a.setName("Abbey Road");
		a.setLength(47.03);
		p.setCompany("Capitol Records");
		p.setHeadquarters("Los Angeles, CA");
		p.setYearFounded(1942);
		ribbons.setTitle("Grammy Award for Best Pop Vocol Album");
		ribbons.setYearAwarded(1968);
		a.setProducer(p);
		a.setAward(ribbons);
		System.out.println(a.toString());
		albumRepo.save(a);
		
		List<Albums> allMyAlbums = albumRepo.findAll();
		for(Albums album: allMyAlbums) {
			System.out.println(album.toString());
		}

		((AbstractApplicationContext) appContext).close();
		
	}
	*/
}
