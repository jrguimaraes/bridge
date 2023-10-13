public class Streamer extends Jogador{
    public Streamer(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.jogo.percentualGanho() + 0.1f);
    }
}
