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
    @Column(name="fruit_name", length = 15, nullable = false, unique = true)
    private String name;
    @Column(name="q_kilos")
    private String quantityKilos;


}
