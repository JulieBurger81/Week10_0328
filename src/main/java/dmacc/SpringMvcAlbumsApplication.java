package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Albums;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.AlbumsRepository;


@SpringBootApplication
public class SpringMvcAlbumsApplication  {  //implements CommandLineRunner

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
	AlbumsRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Albums a = appContext.getBean("albums", Albums.class);
		a.setName("Abbey Road");
		a.setLength(47.03);
		repo.save(a);
		
		List<Albums> allMyAlbums = repo.findAll();
		System.out.println("retrieved it");
		for(Albums album: allMyAlbums) {
			System.out.println(album.toString());
		}

		((AbstractApplicationContext) appContext).close();
		
	}
	*/
}
