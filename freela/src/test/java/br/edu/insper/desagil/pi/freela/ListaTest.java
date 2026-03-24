package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaTest {
    private Lista lista;

    @BeforeEach
    void setUp() {
        lista = new Lista();
    }

    @Test
    void constroi() {
        assertTrue(lista.getTarefas().isEmpty());
    }

    @Test
    void adicionaIguais() {
         Tarefa tarefa1 = new Tarefa(1);
        Tarefa tarefa2 = new Tarefa(1);
        lista.adiciona(tarefa1);
        lista.adiciona(tarefa2);
        assertEquals(1,lista.getTarefas().size());
    }

    @Test
    void adicionaDiferentes() {
        Tarefa tarefa1 = new Tarefa(1);
        Tarefa tarefa2 = new Tarefa(2);
        lista.adiciona(tarefa1);
        lista.adiciona(tarefa2);
        assertEquals(2,lista.getTarefas().size());
    }

}
