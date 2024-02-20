package com.bancodedados.atividade.controllers;

import com.bancodedados.atividade.dtos.UserDTO;
import com.bancodedados.atividade.entities.UserEntity;
import com.bancodedados.atividade.services.implementation.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UsersController {
    @Autowired
    private UserServices userServices;

    @GetMapping("{id}")
    public UserEntity getUserById(@PathVariable Integer id ){
        return userServices
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "nao encontrado"));
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity save( @RequestBody UserEntity user){

        return userServices.save(user);
    }
}
