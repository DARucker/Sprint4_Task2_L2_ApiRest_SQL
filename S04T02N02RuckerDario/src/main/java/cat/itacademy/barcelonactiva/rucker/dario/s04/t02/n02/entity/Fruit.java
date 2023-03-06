package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "fruits")
@Data @Builder
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 15)
    private String name;
    private String quantityKilos;


}
