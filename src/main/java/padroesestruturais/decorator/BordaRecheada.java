package padroesestruturais.decorator;

public class BordaRecheada extends PizzaDecorator {

    public BordaRecheada(Pizza pizza) {
        super(pizza);
    }

    protected float getPercentualAdicional() {
        return 20.0f;
    }

    protected String getNomeAdicional() {
        return "Borda recheada";
    }
}
