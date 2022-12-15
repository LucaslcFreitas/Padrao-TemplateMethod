public class AnimalCachorro extends Animal {

    @Override
    public float calcularQuantidadeAnestesia() {
        if (this.getIdade() >= 0.72f) { //6 meses
            return 0.3f * this.getPeso();
        } else {
            throw new IllegalArgumentException("Abaixo da idade mínima");
        }
    }
    @Override
    public String getTipo() {
        return "AnimalCachorro";
    }
}
