
//Idéia: utilizado em uma clínica veterinária para cedação em uma cirurgia
public abstract class Animal {
    private String raca;
    private float idade;
    private float peso;


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract float calcularQuantidadeAnestesia();

    public String getTipo() {
        return "Animal";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "raca='"+this.raca + "\'"+
                ", idade="+this.idade+
                ", peso="+this.peso+
                ", quantidadeAnestesia="+this.calcularQuantidadeAnestesia()+
                "}";
    }
}
