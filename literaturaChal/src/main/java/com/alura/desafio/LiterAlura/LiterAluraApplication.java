package main.java.com.alura.desafio.LiterAlura;

import com.alura.desafio.LiterAlura.principal.Principal;
import com.alura.desafio.LiterAlura.repository.AutorRepository;
import com.alura.desafio.LiterAlura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner{
	@Autowired
	private LibroRepository libroRepository;

	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {

		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public  void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository, autorRepository);
		principal.mostrarElMenu();
	}

}
