package ru.maxzap.rvote.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.maxzap.rvote.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

}
