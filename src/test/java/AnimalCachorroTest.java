import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalCachorroTest {

    @Test
    void deveRetornarQuantidadeAnestesia() {
        AnimalCachorro cachorro = new AnimalCachorro();
        cachorro.setIdade(7.0f);
        cachorro.setPeso(11.5f);
        assertEquals(3.4, cachorro.calcularQuantidadeAnestesia(), 1);
    }

    @Test
    void deveRetornarIdadeInvalida() {
        try {
            AnimalCachorro cachorro = new AnimalCachorro();
            cachorro.setIdade(0.5f);
            cachorro.setPeso(0.5f);
            cachorro.calcularQuantidadeAnestesia();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Abaixo da idade mínima", e.getMessage());
        }
    }

    @Test
    void deveRetornarInformacoes() {
        AnimalCachorro cachorro = new AnimalCachorro();
        cachorro.setRaca("Labrador");
        cachorro.setIdade(11.5f);
        cachorro.setPeso(30.2f);
        assertEquals("AnimalCachorro{raca='Labrador', idade=11.5, peso=30.2, quantidadeAnestesia=9.06}", cachorro.getInfo());
    }
}