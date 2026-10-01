package padroesestruturais.decorator;

public class QueijoExtra extends PizzaDecorator {

    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    protected float getPercentualAdicional() {
        return 10.0f;
    }

    protected String getNomeAdicional() {
        return "Queijo extra";
    }
}
