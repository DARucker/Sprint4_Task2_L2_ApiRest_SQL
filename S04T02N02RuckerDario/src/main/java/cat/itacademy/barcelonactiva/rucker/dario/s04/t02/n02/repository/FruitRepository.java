package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.repository;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

    Fruit findByName(String name);
}
