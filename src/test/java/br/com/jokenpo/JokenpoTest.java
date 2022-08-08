package br.com.jokenpo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JokenpoTest {

    @Test
    @DisplayName("Testes de empate")
    public void testeEmpate() {
        assertEquals(Jokenpo.play(JokenpoEnum.PEDRA, JokenpoEnum.PEDRA), ResultadoJokenpoEnum.EMPATE, "Pedra com pedra, deverá ser empate.");
        assertEquals(Jokenpo.play(JokenpoEnum.TESOURA, JokenpoEnum.TESOURA), ResultadoJokenpoEnum.EMPATE, "Tesoura com tesoura, deverá ser empate.");
        assertEquals(Jokenpo.play(JokenpoEnum.PAPEL, JokenpoEnum.PAPEL), ResultadoJokenpoEnum.EMPATE, "Papel com papel, deverá ser empate.");
    }

    @Test
    @DisplayName("Testes de fraquezas")
    public void testesFraquezas() {
        assertEquals(Jokenpo.play(JokenpoEnum.PEDRA, JokenpoEnum.PAPEL), ResultadoJokenpoEnum.SEGUNDO_JOGADOR_GANHOU, "Pedra com papel, papel deverá ganhar.");
        assertEquals(Jokenpo.play(JokenpoEnum.TESOURA, JokenpoEnum.PEDRA), ResultadoJokenpoEnum.SEGUNDO_JOGADOR_GANHOU, "Tesoura com pedra, pedra deverá ganhar.");
        assertEquals(Jokenpo.play(JokenpoEnum.PAPEL, JokenpoEnum.TESOURA), ResultadoJokenpoEnum.SEGUNDO_JOGADOR_GANHOU, "Papel com tesoura, tesoura deverá ganhar.");
    }

}
