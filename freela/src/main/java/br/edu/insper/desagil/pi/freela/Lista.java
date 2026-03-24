package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;

    public Lista() {
        tarefas = new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adiciona(Tarefa tarefa) {
        for (Tarefa tarefalista : tarefas) {
            if (tarefa.getId() == tarefalista.getId()) {
                return;
            }
        }
        tarefas.add(tarefa);
    }
}
