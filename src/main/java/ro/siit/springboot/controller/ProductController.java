package ro.siit.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.siit.springboot.model.Product;
import ro.siit.springboot.service.ProductRepository;

import java.util.UUID;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String listProducts(Model model){
        model.addAttribute("productList", productRepository.findAll());
        return "listProducts";
    }

    @GetMapping("/add")
    public String renderForm(){
        return "productForm";
    }

    @PostMapping("/add")
    public String addProduct(@RequestParam("productName") String name){
        Product product = new Product();
        product.setName(name);

        productRepository.save(product);

        return "listProducts";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable UUID id, Model model){
        model.addAttribute("productList", productRepository.findAll());
        return "listProducts";
    }
}
