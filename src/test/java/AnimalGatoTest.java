import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalGatoTest {

    @Test
    void deveRetornarQuantidadeAnestesia() {
        AnimalGato gato = new AnimalGato();
        gato.setIdade(4.0f);
        gato.setPeso(4.5f);
        assertEquals(1.8, gato.calcularQuantidadeAnestesia(), 1);
    }

    @Test
    void deveRetornarIdadeInvalida() {
        try {
            AnimalGato gato = new AnimalGato();
            gato.setIdade(0.3f);
            gato.setPeso(0.6f);
            gato.calcularQuantidadeAnestesia();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Abaixo da idade mínima", e.getMessage());
        }
    }

    @Test
    void deveRetornarInformacoes() {
        AnimalGato gato = new AnimalGato();
        gato.setRaca("Siamês");
        gato.setIdade(6.0f);
        gato.setPeso(4.2f);
        assertEquals("Animal{raca='Siamês', idade=6.0, peso=4.2, quantidadeAnestesia=1.68}", gato.getInfo());
    }

}