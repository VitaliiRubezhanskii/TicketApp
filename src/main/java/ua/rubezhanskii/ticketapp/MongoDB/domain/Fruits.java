package ua.rubezhanskii.ticketapp.MongoDB.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "fruits")
public class Fruits {

    @Id
    private String id;
    private String name;
    private String color;
    private Double price;

}
