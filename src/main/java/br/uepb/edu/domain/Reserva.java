// Reserva.java
package br.uepb.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    private int periodo;
    private ReservaSituacao situacao;
    private CopiaDoLivro copiaDoLivro;
    private Leitor leitor; // Adicione um campo Leitor

    // Construtor que aceita um Leitor como argumento
    public Reserva(int periodo, ReservaSituacao situacao, CopiaDoLivro copiaDoLivro, Leitor leitor) {
        this.periodo = periodo;
        this.situacao = situacao;
        this.copiaDoLivro = copiaDoLivro;
        this.leitor = leitor;
    }

}
