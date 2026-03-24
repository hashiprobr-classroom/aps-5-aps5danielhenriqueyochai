package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer,Integer> limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia) {
        ano = ajusta(novoAno,1970,2070);
        mes = ajusta(novoAno,1,12);
        dia = ajusta(novoAno,1,limite.get(mes));
    }

    @Override
    public int minutos() {
        int minutos = 0;
        int anos = ano - 1970;
        for (int i = 1; i < mes;i++) {
            int dias = limite.get(i);
            minutos += dias * 24 * 60;
        }
        minutos += 365 * anos * 24 * 60 + (dia - 1) * 24 * 60;
        return minutos;
    }

}
