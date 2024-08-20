package com.brandonw.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brandonw.restapi.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
