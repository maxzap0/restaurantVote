package ru.maxzap.rvote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.maxzap.rvote.model.Restaurant;

@Transactional(readOnly = true)
public interface RestarauntRepository extends JpaRepository<Restaurant, Integer> {
}
