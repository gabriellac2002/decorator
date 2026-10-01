package padroesestruturais.decorator;

public class PizzaBasica implements Pizza {

    private final float preco;

    public PizzaBasica() {
        this(40.0f);
    }

    public PizzaBasica(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return "Pizza basica";
    }
}
