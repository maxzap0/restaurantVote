package ru.maxzap.rvote.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.maxzap.rvote.controller.RestaurantRestController;
import ru.maxzap.rvote.model.Restaurant;
import ru.maxzap.rvote.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping("/admin/restaurant")
@Slf4j
public class RestaurantAdminRestController extends RestaurantRestController {

    public RestaurantAdminRestController(RestaurantService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<Restaurant> getAll() {
        return super.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public Restaurant get(@PathVariable Integer id) {
        return super.get(id);
    }

    @Override
    @DeleteMapping("/{id}")
    protected void delete(@PathVariable Integer id) {
        super.delete(id);
    }

    @Override
    @PostMapping
    protected Restaurant create(@RequestBody Restaurant restaurant){
        return super.create(restaurant);
    }

    @PutMapping
    protected Restaurant update(@RequestBody Restaurant restaurant){
        return super.create(restaurant);
    }
}