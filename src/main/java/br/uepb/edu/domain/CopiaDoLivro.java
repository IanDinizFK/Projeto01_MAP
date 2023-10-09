// CopiaDoLivro.java
package br.uepb.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CopiaDoLivro extends Livro {

    // Adicionei atributos específicos para uma cópia de livro: sequencial, situação e liberacaoEmprestimo.

    private int sequencial;
    private CopiaDoLivroSituacao situacao;
    private LiberacaoEmprestimo liberacaoEmprestimo;

    @Override
    public String getDescricao() {
        // Sobrescrevi o método 'getDescricao' da classe base 'Livro'.
        // Agora, a descrição de uma cópia de livro incluirá informações adicionais, como o número sequencial.

        // Chamei o método 'getDescricao' da classe base 'Livro' usando 'super.getDescricao()'.
        // Isso obtém a descrição do livro, que inclui título e autor.

        // Em seguida, adicionei informações da cópia, como o número sequencial.
        return super.getDescricao() + " - Cópia Nº: " + sequencial;
    }
}
