package br.uepb.edu.domain;

public interface BibliotecaFactory {
    Leitor criarLeitor(String nome);
    Reserva criarReserva(Leitor leitor);
}
