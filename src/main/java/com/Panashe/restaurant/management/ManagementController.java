package com.Panashe.restaurant.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/nashe")
public class ManagementController {

    private final ManagementService managementService;

    @Autowired
    public ManagementController(ManagementService managementService) {
        this.managementService = managementService;
    }

    @GetMapping
    public List<Menu> getAll(){
        return managementService.everything();
    }

    @PostMapping(path = "/update")
    public void update(@RequestBody UpdateProduct update){
        managementService.edit(update);
    }

    @PostMapping(path = "/add")
    public void addProduct( @RequestBody Menu product){
        managementService.addProduct(product);
    }

    @DeleteMapping(path = "/delete")
    public void deleteProduct(@RequestBody int product_id){
        managementService.deleteProduct(product_id);
    }

}
