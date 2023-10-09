// Leitor.java
package br.uepb.edu.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leitor {
    private String nome;
    private LeitorTipo tipo;
    private List<Reserva> reservas;

    // Adicionei um construtor que aceita o nome e o tipo do leitor.
    public Leitor(String nome, LeitorTipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
