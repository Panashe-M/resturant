package com.Panashe.restaurant.management;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ManagementService {

    private final MenuRepository menuRepository;


    @Autowired
    public ManagementService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> everything(){
        return menuRepository.findAll();
    }

    public void deleteProduct(int product_id){
        menuRepository.deleteById(product_id);
    }

    public void addProduct(Menu product){
        menuRepository.save(product);
    }

    @Transactional
    public void edit(UpdateProduct updateProduct){

        Menu product= menuRepository.findById(updateProduct.getProduct_id()).get();
        String newName= updateProduct.getName();
        String newCategory= updateProduct.getCategory();
        int newPrice= updateProduct.getPrice();

        if(newName != null&& !newName.equals(product.getName())){
            product.setName(newName);
        }
        else if(newCategory != null && !newCategory.equals(product.getCategory())){
            product.setCategory(newCategory);
        }
        else if (newPrice >0.0 && newPrice != product.getPrice()){
            product.setPrice(newPrice);
        }
        else
            throw new IllegalStateException("failed to update product");
    }
}
