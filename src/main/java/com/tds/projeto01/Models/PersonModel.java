package com.tds.projeto01.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonModel {
    int id;
    String nome;
    byte idade;

    public PersonModel() {}

    PersonModel(String nome, byte idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }
}
