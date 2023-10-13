public class Profissional extends Jogador{
    public Profissional(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.jogo.percentualGanho() + 0.2f);
    }
}
