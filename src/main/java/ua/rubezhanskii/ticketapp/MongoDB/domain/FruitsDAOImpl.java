package ua.rubezhanskii.ticketapp.MongoDB.domain;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FruitsDAOImpl {

    private final MongoTemplate mongoTemplate;

    public FruitsDAOImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}

