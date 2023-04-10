package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesas")
public class Mesa {

    @Id
    int ID;
    String mesa;
    int capacidade;
    int id_comanda = 0;

    public Mesa(int ID, String nome, int capacidade) {
        this.ID = ID;
        this.mesa = nome;
        this.capacidade = capacidade;
    }

}
