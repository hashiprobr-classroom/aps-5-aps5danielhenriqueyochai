package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {

    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data) {
        hora = 0;
        minuto = 0;
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void atualiza(int novaHora,int novoMinuto) {
        hora = ajusta(novaHora,0,23);
        minuto = ajusta(novoMinuto,0,59);
    }
    @Override
    public int minutos() {
        return data.minutos() + hora * 60 + minuto;
    }
}
