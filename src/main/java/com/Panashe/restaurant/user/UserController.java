package com.Panashe.restaurant.user;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final Cart cart;

    public UserController(Cart cart) {
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
}
