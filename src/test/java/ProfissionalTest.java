import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProfissionalTest {

    @Test
    void deveRetornarSalarioProfissionalDeRainbowSix() {
        Jogo jogo = new RainbowSix();
        Jogador jogador = new Profissional(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1250f, 0.001f);
    }

    @Test
    void deveRetornarSalarioProfissionalDeCS() {
        Jogo jogo = new CS();
        Jogador jogador = new Profissional(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1300f, 0.001f);
    }

    @Test
    void deveRetornarSalarioProfissionalDeValorant() {
        Jogo jogo = new Valorant();
        Jogador jogador = new Profissional(1000f);
        jogador.setJogo(jogo);
        assertEquals(1400f, jogador.calcularSalario(), 0.001f);
    }
}
