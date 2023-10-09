// Bibliotecaria.java
package br.uepb.edu.domain;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecaria implements ItemDeBiblioteca {

    // Adicionei uma lista para armazenar os itens da biblioteca
    private List<ItemDeBiblioteca> itens = new ArrayList<>();

    // Adicionei um método para permitir que a bibliotecária adicione itens à biblioteca
    public void adicionarItem(ItemDeBiblioteca item) {
        itens.add(item);
    }

    @Override
    public String getDescricao() {
        // Sobrescrevi o método 'getDescricao' da interface 'ItemDeBiblioteca'.
        // Agora, a descrição da bibliotecária incluirá todos os itens que foram adicionados
        // à lista 'itens' por meio do método 'adicionarItem'.

        // Foi iniciado com uma descrição básica da biblioteca.
        StringBuilder descricao = new StringBuilder("Biblioteca:\n");

        // Em seguida, percorremos a lista de itens e adicionamos a descrição de cada item à
        // descrição da biblioteca.
        for (ItemDeBiblioteca item : itens) {
            descricao.append("- ").append(item.getDescricao()).append("\n");
        }

        // Retornamos a descrição completa da biblioteca, que agora inclui todos os itens.
        return descricao.toString();
    }
}
