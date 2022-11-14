package com.example.BaseSimit;

import com.example.BaseSimit.Repositories.ClienteRepository;
import com.example.BaseSimit.Repositories.ComparendoRepository;
import com.example.BaseSimit.models.Cliente;
import com.example.BaseSimit.models.Comparendo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BaseSimitApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BaseSimitApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClienteRepository clienteRepository, ComparendoRepository comparendoRepository){
	return(args) ->{
		Cliente sebas = new Cliente(1140863942,"Sebastian","Becerra");
		clienteRepository.save(sebas);
		Cliente pipe = new Cliente(1045707723,"Felipe","Becerra");
		clienteRepository.save(pipe);

		Comparendo comparendo1 = new Comparendo(1,"C02","12102022","PONAL","ATLANTICO","BARRANQUILLA",250000,sebas);
		comparendoRepository.save(comparendo1);



	};
	}

}
