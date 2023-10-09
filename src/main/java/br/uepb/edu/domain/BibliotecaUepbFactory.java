package br.uepb.edu.domain;

public class BibliotecaUepbFactory implements BibliotecaFactory {
    @Override
    public Leitor criarLeitor(String nome) {
        // Aqui, eu implementei a classe 'BibliotecaUepbFactory' que é uma fábrica concreta
        // para criar instâncias de 'Leitor' com o tipo 'Aluno' associado à biblioteca da UEPB.

        // Estou sobrescrevendo o método 'criarLeitor' da interface 'BibliotecaFactory'.
        // Ele recebe o nome do leitor como parâmetro.

        // Em seguida, eu simplesmente crio uma nova instância de 'Leitor' com o nome
        // fornecido e o tipo definido como 'ALUNO', que é específico da UEPB.

        // Finalmente, retorno a instância de 'Leitor' criada.

        return new Leitor(nome, LeitorTipo.ALUNO);
    }

    @Override
    public Reserva criarReserva(Leitor leitor) {
        // Aqui, eu estou sobrescrevendo o método 'criarReserva' para criar instâncias
        // de 'Reserva' associadas à biblioteca da UEPB. A reserva é associada ao leitor
        // que é passado como argumento.

        // Você pode personalizar essa lógica para criar reservas de acordo com as regras
        // da biblioteca da UEPB, como definir a situação e o período.

        // Neste exemplo, eu simplesmente criei uma reserva com valores padrão.

        return new Reserva(7, ReservaSituacao.ATIVO, null, leitor);
    }
}