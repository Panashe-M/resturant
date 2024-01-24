package com.Panashe.restaurant.user;

import com.Panashe.restaurant.management.ManagementService;
import com.Panashe.restaurant.management.Menu;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final ManagementService managementService;
    private final Cart cart;

    public UserController(ManagementService managementService, Cart cart) {
        this.managementService = managementService;
        this.cart = cart;
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody Item item){
        cart.addToCart(item);
    }

    @GetMapping (path = "/get")
    public List<Item> getCart(){
        return cart.getCart();

    }

    @GetMapping(path = "/menu")
    public List<Menu> getMenu(){
        return managementService.everything();
    }

    @DeleteMapping(path = "/removeItem")
    public void removeItem(@RequestBody Item i){
        cart.removeItem(i);
    }

    @GetMapping(path = "/price")
    public double price(){
        return cart.totalAmount;
    }
}
