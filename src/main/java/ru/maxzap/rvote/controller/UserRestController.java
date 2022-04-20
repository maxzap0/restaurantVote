package ru.maxzap.rvote.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maxzap.rvote.exception.NotFoundException;
import ru.maxzap.rvote.model.User;
import ru.maxzap.rvote.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return userRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @GetMapping()
    public List<User> get(){
        return userRepository.findAll();
    }
}
