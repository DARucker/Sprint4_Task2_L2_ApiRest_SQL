package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.controller;

import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.entity.Fruit;
import cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n02.service.FruitServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private static Logger LOG = LoggerFactory.getLogger(FruitController.class);
    @Autowired
    private FruitServiceImpl fruitService;

    @PostMapping
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit ){
        LOG.info("Using method createFruit");
        return  ResponseEntity.status(HttpStatus.CREATED).body(fruitService.createFruit(fruit));
    }
    @GetMapping(value = "getOne/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable int id){
        LOG.info("Using method getFruit");
        Fruit fruit = fruitService.getFruit(id);
        if(null == fruit){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(fruit);
    }

}
