import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CasualTest {

    @Test
    void deveRetornarSalarioCasualDeRainbowSix() {
        Jogo jogo = new RainbowSix();
        Jogador jogador = new Casual(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1050f);
    }

    @Test
    void deveRetornarSalarioCasualDeCS() {
        Jogo jogo = new CS();
        Jogador jogador = new Casual(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1100f);
    }

    @Test
    void deveRetornarSalarioCasualDeValorant() {
        Jogo jogo = new Valorant();
        Jogador jogador = new Casual(1000f);
        jogador.setJogo(jogo);
        assertEquals(jogador.calcularSalario(), 1200f);
    }
}
