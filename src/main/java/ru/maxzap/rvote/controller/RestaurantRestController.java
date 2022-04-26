package ru.maxzap.rvote.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import ru.maxzap.rvote.model.Restaurant;
import ru.maxzap.rvote.service.RestaurantService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class RestaurantRestController {
    RestaurantService service;

    protected List<Restaurant> getAll(){
        return service.getAll();
    }

    protected Restaurant get(Integer id){
        return service.get(id);
    }

    //ToDo realiz method
    protected Restaurant getWithMenu(Integer id){
        return service.get(id);
    }

    protected void delete(Integer id){
        service.delete(id);
    }

    protected Restaurant create(Restaurant restaurant){
        return service.createOrUpdate(restaurant);
    }

}
