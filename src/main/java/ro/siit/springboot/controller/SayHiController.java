package ro.siit.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.siit.springboot.model.Hi;

import javax.ws.rs.Path;

@RestController()
@RequestMapping("/sayHi")
public class SayHiController {
    @GetMapping("/api/{name}")
    public Hi getEntity(@PathVariable String name){
        Hi salut = new Hi(name);

        return salut;
    }
}
