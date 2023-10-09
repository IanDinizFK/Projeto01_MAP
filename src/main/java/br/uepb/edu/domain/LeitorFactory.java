// LeitorFactory.java
package br.uepb.edu.domain;

public interface LeitorFactory {
    // Modifiquei o método criarLeitor para aceitar um parâmetro adicional "tipo".
    Leitor criarLeitor(String nome, LeitorTipo tipo);
}
