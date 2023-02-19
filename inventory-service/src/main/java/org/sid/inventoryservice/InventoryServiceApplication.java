package org.sid.inventoryservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){

		restConfiguration.exposeIdsFor(Product.class);
 		return args -> {
			productRepository.save(new Product(null,"Ordinateur",88,12));
			productRepository.save(new Product(null,"Imprimante",88,15));
			productRepository.save(new Product(null,"Smartphone",1288,55));
			productRepository.save(new Product(null, "Aspirateur", 758, 4));
			productRepository.save(new Product(null, "Chauffe-eau électrique", 1588, 16));
			productRepository.save(new Product(null, "Lisseur", 499, 3));

			productRepository.findAll().forEach(p->{
				System.out.println(p.getName());
			});
		};
	}
}



