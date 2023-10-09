package br.uepb.edu.domain;

// Implementação do Princípio da Substituição de Liskov (LSP)
public class DecoratorDescricaoExtra implements ItemDeBiblioteca {
    private ItemDeBiblioteca item;
    private String descricaoExtra;

    public DecoratorDescricaoExtra(ItemDeBiblioteca item, String descricaoExtra) {
        this.item = item;
        this.descricaoExtra = descricaoExtra;
    }

    // Implementação do método getDescricao para seguir o LSP
    @Override
    public String getDescricao() {
        // Implementação do Princípio Aberto/Fechado (OCP)
        // Permite estender o comportamento sem modificar a classe original
        return item.getDescricao() + " (" + descricaoExtra + ")";
    }
}
