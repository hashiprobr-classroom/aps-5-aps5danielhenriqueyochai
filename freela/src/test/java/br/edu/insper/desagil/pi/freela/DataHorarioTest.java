package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {
    private  DataHorario data;

    @BeforeEach
    void setUp() {
        data = new DataHorario();
    }

    @Test
    void constroi() {
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
        assertEquals(0,data.minutos());

}
