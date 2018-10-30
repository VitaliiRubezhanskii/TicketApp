package ua.rubezhanskii.ticketapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import ua.rubezhanskii.ticketapp.MongoDB.FruitsRepository;
import ua.rubezhanskii.ticketapp.MongoDB.domain.Fruits;

@SpringBootApplication
public class TicketappApplication implements CommandLineRunner {

    @Autowired
    FruitsRepository fruitsRepository;

    public static void main(String[] args) {
        SpringApplication.run(TicketappApplication.class, args);
    }

    @Override
    public void run(String... args){

        fruitsRepository.deleteAll();

        //save couple test fruits

        fruitsRepository.save(new Fruits("1","Test Fruit 1","RED",25.50));
        fruitsRepository.save(new Fruits("2","Test Fruit 2","GREEN",25.60));

        // fetch all fruits
        System.out.println("Fruits found with findAll():");
        System.out.println("-------------------------------");

        for (Fruits fruit : fruitsRepository.findAll()){
            System.out.println(fruit);
        }

        // fetch an individual customer
        System.out.println("Fruits found with findByName('Test Fruit 2')");
        System.out.println("--------------------------------");

        System.out.println(fruitsRepository.findByName("Test Fruit 2"));
    }
}
