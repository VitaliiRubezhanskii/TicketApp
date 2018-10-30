package ua.rubezhanskii.ticketapp.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ua.rubezhanskii.ticketapp.MongoDB.domain.Fruits;

@Repository
public interface FruitsRepository extends MongoRepository<Fruits,String> {

     Fruits findByName(String name);
}
