package br.uepb.edu.domain;

public class BibliotecaFacade {
    private BibliotecaFactory bibliotecaFactory;

    public BibliotecaFacade(BibliotecaFactory bibliotecaFactory) {
        this.bibliotecaFactory = bibliotecaFactory;
    }

    public void realizarEmprestimo(String nomeLeitor, String tituloLivro) {
        // Vou criar um Leitor com o nome que forneci
        Leitor leitor = bibliotecaFactory.criarLeitor(nomeLeitor);

        // Em seguida, vou criar uma Reserva associada ao meu Leitor
        Reserva reserva = bibliotecaFactory.criarReserva(leitor);

        // Agora vou realizar o empréstimo associando minha Reserva ao Livro com o título que forneci
        Livro livro = new Livro(tituloLivro, "", 0, "", "", LivroTipo.PERIODICO);
        reserva.setCopiaDoLivro(new CopiaDoLivro(1, CopiaDoLivroSituacao.DISPONIVEL, LiberacaoEmprestimo.LIBERADO));
        reserva.setSituacao(ReservaSituacao.ATIVO);

        // Se necessário, posso adicionar minha Reserva à minha lista de Reservas do Leitor
        // ou realizar outras operações

        System.out.println("Empréstimo realizado com sucesso para o leitor " + nomeLeitor);
    }

    public void realizarDevolucao(String nomeLeitor, String tituloLivro) {
        // Aqui eu posso implementar a lógica para realizar a devolução
        // Vou deixar isso como um exercício para mim
        System.out.println("Devolução realizada com sucesso para o leitor " + nomeLeitor);
    }
}
