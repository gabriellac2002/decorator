package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Test
    void deveRetornarPrecoPizzaBasica() {
        Pizza pizza = new PizzaBasica(40.0f);
        assertEquals(40.0f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComBordaRecheada() {
        Pizza pizza = new BordaRecheada(new PizzaBasica(40.0f));
        assertEquals(48.0f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaBasica(40.0f));
        assertEquals(44.0f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComMolhoEspecial() {
        Pizza pizza = new MolhoEspecial(new PizzaBasica(40.0f));
        assertEquals(42.0f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComBordaRecheadaEQueijoExtra() {
        Pizza pizza = new BordaRecheada(new QueijoExtra(new PizzaBasica(40.0f)));
        assertEquals(52.8f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComBordaRecheadaEMolhoEspecial() {
        Pizza pizza = new BordaRecheada(new MolhoEspecial(new PizzaBasica(40.0f)));
        assertEquals(50.4f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComQueijoExtraEMolhoEspecial() {
        Pizza pizza = new QueijoExtra(new MolhoEspecial(new PizzaBasica(40.0f)));
        assertEquals(46.2f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPizzaComTodosOsAdicionais() {
        Pizza pizza = new BordaRecheada(new QueijoExtra(new MolhoEspecial(new PizzaBasica(40.0f))));
        assertEquals(55.44f, pizza.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPizzaBasica() {
        Pizza pizza = new PizzaBasica();
        assertEquals("Pizza basica", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComBordaRecheada() {
        Pizza pizza = new BordaRecheada(new PizzaBasica());
        assertEquals("Pizza basica/Borda recheada", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaBasica());
        assertEquals("Pizza basica/Queijo extra", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComMolhoEspecial() {
        Pizza pizza = new MolhoEspecial(new PizzaBasica());
        assertEquals("Pizza basica/Molho especial", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComBordaRecheadaEQueijoExtra() {
        Pizza pizza = new BordaRecheada(new QueijoExtra(new PizzaBasica()));
        assertEquals("Pizza basica/Queijo extra/Borda recheada", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComBordaRecheadaEMolhoEspecial() {
        Pizza pizza = new BordaRecheada(new MolhoEspecial(new PizzaBasica()));
        assertEquals("Pizza basica/Molho especial/Borda recheada", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoExtraEMolhoEspecial() {
        Pizza pizza = new QueijoExtra(new MolhoEspecial(new PizzaBasica()));
        assertEquals("Pizza basica/Molho especial/Queijo extra", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComTodosOsAdicionais() {
        Pizza pizza = new BordaRecheada(new QueijoExtra(new MolhoEspecial(new PizzaBasica())));
        assertEquals("Pizza basica/Molho especial/Queijo extra/Borda recheada", pizza.getDescricao());
    }
}
