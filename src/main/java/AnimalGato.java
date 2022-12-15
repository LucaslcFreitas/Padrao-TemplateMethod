public class AnimalGato extends Animal{
    @Override
    public float calcularQuantidadeAnestesia() {
        if (this.getIdade() >= 0.48f) { //4 meses
            return 0.4f * this.getPeso();
        } else {
            throw new IllegalArgumentException("Abaixo da idade mínima");
        }
    }
}
