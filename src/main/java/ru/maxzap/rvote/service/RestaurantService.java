package ru.maxzap.rvote.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.maxzap.rvote.exception.NotFoundException;
import ru.maxzap.rvote.model.Restaurant;
import ru.maxzap.rvote.repository.RestarauntRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService {

    private RestarauntRepository repository;

    public List<Restaurant> getAll() {
       return repository.findAll();
    }

    public Restaurant get(Integer id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Restaurant createOrUpdate(Restaurant restaurant) {
        return repository.save(restaurant);
    }
}
