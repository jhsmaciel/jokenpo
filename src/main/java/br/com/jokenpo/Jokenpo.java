package br.com.jokenpo;

import java.util.HashMap;

public class Jokenpo {

    private static final HashMap<JokenpoEnum, JokenpoEnum> FRAQUEZAS_JOKENPO = new HashMap<>(){
        {
            put(JokenpoEnum.PAPEL, JokenpoEnum.TESOURA);
            put(JokenpoEnum.TESOURA, JokenpoEnum.PEDRA);
            put(JokenpoEnum.PEDRA, JokenpoEnum.PAPEL);
        }
    };

    public static ResultadoJokenpoEnum play(JokenpoEnum escolhaPrimeiroJogador, JokenpoEnum escolhaSegundoJogador) {
        if (escolhaPrimeiroJogador.equals(escolhaSegundoJogador)) {
            return ResultadoJokenpoEnum.EMPATE;
        }
        JokenpoEnum fraquezaPrimeiroJogador = FRAQUEZAS_JOKENPO.get(escolhaPrimeiroJogador);
        if (fraquezaPrimeiroJogador.equals(escolhaSegundoJogador)) {
            return ResultadoJokenpoEnum.SEGUNDO_JOGADOR_GANHOU;
        }
        return ResultadoJokenpoEnum.PRIMEIRO_JOGADOR_GANHOU;
    }

}
