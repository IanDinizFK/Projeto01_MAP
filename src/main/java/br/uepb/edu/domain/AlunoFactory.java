// AlunoFactory.java
package br.uepb.edu.domain;

public class AlunoFactory implements LeitorFactory {
    @Override
    public Leitor criarLeitor(String nome, LeitorTipo tipo) {
        // Aqui, eu implementei a classe 'AlunoFactory' que é uma fábrica concreta
        // para criar instâncias de 'Leitor' do tipo 'Aluno'.

        // Estou sobrescrevendo o método 'criarLeitor' da interface 'LeitorFactory'.
        // Ele recebe o nome do aluno e o tipo de leitor como parâmetros.

        // Em seguida, eu simplesmente crio uma nova instância de 'Leitor' com o nome
        // fornecido e o tipo que foi passado como argumento.

        return new Leitor(nome, tipo);
    }
}
