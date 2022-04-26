package ru.maxzap.rvote.controller.admin;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.maxzap.rvote.model.Dish;
import ru.maxzap.rvote.service.DishService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin/dish")
@Slf4j
public class DishRestController {
    private DishService service;

    @GetMapping
    public List<Dish> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Dish get(@PathVariable Integer id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PostMapping
    public Dish create(@RequestBody Dish dish){
       return service.createOrUpdate(dish);
    }

    @PutMapping
    public Dish update(@RequestBody Dish dish){
        return service.createOrUpdate(dish);
    }
}
