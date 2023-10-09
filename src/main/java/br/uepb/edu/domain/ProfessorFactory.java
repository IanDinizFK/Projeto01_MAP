// ProfessorFactory.java
package br.uepb.edu.domain;

public class ProfessorFactory implements LeitorFactory {
    @Override
    public Leitor criarLeitor(String nome, LeitorTipo tipo) {
        // Cria uma instância de Leitor com o nome e tipo fornecidos
        return new Leitor(nome, tipo);
    }
}
