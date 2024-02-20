package com.bancodedados.atividade.dtos;

import java.sql.Date;

public record UserDTO(int id, int cpf, String name, Date date) {
}
