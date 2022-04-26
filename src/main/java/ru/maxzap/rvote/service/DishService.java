package ru.maxzap.rvote.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.maxzap.rvote.exception.NotFoundException;
import ru.maxzap.rvote.model.Dish;
import ru.maxzap.rvote.repository.DishRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DishService {
    private DishRepository repository;

    public List<Dish> getAll(){
        return repository.findAll();
    }

    public Dish get(int id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public Dish createOrUpdate(Dish dish) {
        return repository.save(dish);
    }
}
