public abstract class Jogador {
    protected Jogo jogo;
    protected float salarioBase;

    public Jogador(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
