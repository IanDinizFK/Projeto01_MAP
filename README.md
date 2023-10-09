# Projeto01_MAP
Este é o projeto da disciplina que visa implementar em uma estrutura básica de biblioteca, padrões GRAPS.

# Padrões GRAPS: Principios OCP e LSP
Principio Aberto/Fechado
Liskov Substitution Principle
- Arquivo Livro e Decorator Descricao
- Padrão decorator foi adicionado em conjunto aqui.

# Padrões Factory Method e Abstract Factory
✔Factory Method: 
- Adição de AlunoFactory, ProfessorFactory e alteração em Leitor que adiciona um construtor
✔Abstract Method:
- Adição de BibliotecaUepbFactory
- Adição de BibliotecaFactory 
- Alteração em reserva que cria o construtor que cria as reservas.
- Remoção do @AllArgsConstructor ja que temos um constructor

# Padrões Composite usando Builder e Prototype
Cria arquivo ItemDeBiblioteca, altera Leitor e Bibliotecaria 
# Padrão Facade
Criação de BibliotecaFacade
```
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
```
# Autores
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/51161747?v=4" width=115><br><sub>Ian Diniz</sub>](https://github.com/IanDinizFK) |
| :---: |
