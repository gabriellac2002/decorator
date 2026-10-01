package padroesestruturais.decorator;

public class MolhoEspecial extends PizzaDecorator {

    public MolhoEspecial(Pizza pizza) {
        super(pizza);
    }

    protected float getPercentualAdicional() {
        return 5.0f;
    }

    protected String getNomeAdicional() {
        return "Molho especial";
    }
}
