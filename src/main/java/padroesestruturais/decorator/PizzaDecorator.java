package padroesestruturais.decorator;

public abstract class PizzaDecorator implements Pizza {

    private final Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    protected Pizza getPizza() {
        return this.pizza;
    }

    protected abstract float getPercentualAdicional();

    protected abstract String getNomeAdicional();

    public float getPreco() {
        return this.pizza.getPreco() * (1 + this.getPercentualAdicional() / 100);
    }

    public String getDescricao() {
        return this.pizza.getDescricao() + "/" + this.getNomeAdicional();
    }
}
