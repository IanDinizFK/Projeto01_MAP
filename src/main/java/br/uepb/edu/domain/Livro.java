// Livro.java
package br.uepb.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro implements ItemDeBiblioteca {
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private String editora;
    private LivroTipo tipo;

    // Implementação do método getDescricao da interface ItemDeBiblioteca
    @Override
    public String getDescricao() {
        // Retorna uma descrição formatada do livro com título e autor
        return "Livro: " + titulo + " de " + autor;
    }
}
