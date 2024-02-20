package com.bancodedados.atividade.entities;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="CPF",nullable = false)
    private int cpf;
    @Column(name="NOME",nullable = false)
    private String name;
    @Column(name="DATANASCIMENTO",nullable = false)
    private Date date;

    public UserEntity() {
    }

    public UserEntity(int cpf, String name, Date date) {
        this.cpf = cpf;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
