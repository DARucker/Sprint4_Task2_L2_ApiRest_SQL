package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.controller;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.entity.Fruit;
import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.service.FruitServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

  /*
http://localhost:8080/fruta/add ** DONE
http://localhost:8080/fruta/update/{id} **
http://localhost:8080/fruta/delete/{id}
http://localhost:8080/fruta/getOne/{id} ** DONE
http://localhost:8080/fruta/getAll ** DONE
     */

@RestController
@RequestMapping("/fruit")
public class    FruitController {
    private static Logger LOG = LoggerFactory.getLogger(FruitController.class);
    @Autowired
    private FruitServiceImpl fruitService;

    @PostMapping(value = "/add")
    public ResponseEntity<Fruit> create(@RequestBody Fruit fruit ){
        LOG.info("Using method createFruit");
        return  ResponseEntity.status(HttpStatus.CREATED).body(fruitService.createFruit(fruit));
    }
    @GetMapping(value = "/getOne/{id}")
    public ResponseEntity<Fruit> get(@PathVariable int id){
        LOG.info("Using method getFruit");
        Fruit fruit = fruitService.getFruit(id);
        if(null == fruit){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(fruit);
    }
    @GetMapping(value = "/getAll")
    public  ResponseEntity<List<Fruit>> getAll(){
        LOG.info("Using method getAll to list every item on DB");
        List<Fruit> allFruit = fruitService.allFruit();
        if(allFruit.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(allFruit);
    }
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Fruit> update(@RequestBody Fruit fruit, @PathVariable int id){
        LOG.info("Using method update");
        fruit.setId(id);
        Fruit fruitDB = fruitService.updateFruit(fruit);
        if(fruitDB == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(fruitDB);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Fruit> delete (@PathVariable int id){
        LOG.info("Using method delete");
        Fruit fruitDelete = fruitService.getFruit(id);
        if(fruitDelete == null){
            return ResponseEntity.notFound().build();
        }
        fruitService.deleteFruit(fruitDelete.getId());
        return ResponseEntity.ok(fruitDelete);
    }

}
