package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {
    private Tarefa tarefa;

    @BeforeEach
    void setUp() {
        tarefa = new Tarefa(1);
    }

    @Test
    void constroi() {
        assertEquals(1,tarefa.getId());
        assertEquals("",tarefa.getDescricao());
        assertNull(tarefa.getInicio());
        assertNull(tarefa.getFim());
    }

    @Test
    void mudaDescricao() {
        tarefa.setDescricao("cintra");
        assertEquals("cintra",tarefa.getDescricao());
    }
    @Test
    void momentosValidos() {
        Data inicio = new Data();
        inicio.atualiza(1970,1,1);
        Data fim = new Data();
        fim.atualiza(1970,1,2);
        tarefa.atualiza(inicio,fim);
        assertEquals(inicio,tarefa.getInicio());
        assertEquals(inicio,tarefa.getFim());
    }

    @Test
    void momentosInvalidos() {
        Data inicio = new Data();
        inicio.atualiza(1970,1,2);
        Data fim = new Data();
        fim.atualiza(1970,1,1);
        assertThrows(IllegalArgumentException.class, () -> {
            tarefa.atualiza(inicio, fim);
        });
    }
}
