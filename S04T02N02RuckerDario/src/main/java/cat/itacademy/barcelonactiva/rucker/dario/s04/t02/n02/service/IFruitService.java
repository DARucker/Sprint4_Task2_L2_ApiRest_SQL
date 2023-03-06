package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.service;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.entity.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFruitService {

    Fruit createFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void deleteFruit(int id);
    Fruit getFruit(int id);
    List<Fruit> allFruit();
    Fruit findByName(String name);


}
