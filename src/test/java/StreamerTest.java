import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StreamerTest {

    @Test
    void deveRetornarSalarioStreamerDeRainbowSix() {
        Jogo jogo = new RainbowSix();
        Jogador jogador = new Streamer(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1150f, 0.001f);
    }

    @Test
    void deveRetornarSalarioStreamerDeCS() {
        Jogo jogo = new CS();
        Jogador jogador = new Streamer(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1200f, 0.001f);
    }

    @Test
    void deveRetornarSalarioStreamerDeValorant() {
        Jogo jogo = new Valorant();
        Jogador jogador = new Streamer(1000f);
        jogador.setJogo(jogo);
        assertEquals(1300f, jogador.calcularSalario(), 0.001f);
    }
}
