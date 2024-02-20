package com.bancodedados.atividade.services.implementation;

import com.bancodedados.atividade.daos.UserDAO;
import com.bancodedados.atividade.entities.UserEntity;
import com.bancodedados.atividade.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserEntity> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Transactional
    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }
}
