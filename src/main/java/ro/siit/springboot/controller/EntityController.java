package ro.siit.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.siit.springboot.model.Entity;

import java.util.UUID;

@RestController()
@RequestMapping("/entity")
public class EntityController {
    @GetMapping("/{id}")
    public Entity getEntity(@PathVariable UUID id){
        Entity e = new Entity();
        e.setName("First Entity" + id);

        return e;
    }
}
