public class Casual extends Jogador{
    public Casual(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.jogo.percentualGanho());
    }
}
