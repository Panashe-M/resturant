package com.Panashe.restaurant.management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {

    @Override
    Optional<Menu> findById(Integer productId);
    Optional<Menu> findByName(String name);


}
