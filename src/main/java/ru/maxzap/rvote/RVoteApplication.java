package ru.maxzap.rvote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import ru.maxzap.rvote.model.User;
import ru.maxzap.rvote.repository.UserRepository;

@SpringBootApplication
public class RVoteApplication {

    private static ApplicationContext context;

    public RVoteApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(RVoteApplication.class, args);
//        UserRepository userRepository = context.getBean(UserRepository.class);
//        System.out.println(userRepository.findAll());
    }
}
