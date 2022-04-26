package ru.maxzap.rvote.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.maxzap.rvote.exception.NotFoundException;
import ru.maxzap.rvote.model.Restaurant;
import ru.maxzap.rvote.repository.RestarauntRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class RestaurantService {

    private RestarauntRepository repository;

    public List<Restaurant> getAll() {
        log.info("Get all restaurant:", repository.findAll());
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
