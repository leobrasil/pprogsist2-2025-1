import reservas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Assento assento = new AssentoEconomica(50);

        assento.venderAssento();
        System.out.println("Valor assento "+assento.calcularPreco());
        assento.venderAssento();
        System.out.println("Valor assento "+assento.calcularPreco());

        Assento assentoEx = new AssentoExecutiva(10);

        assentoEx.venderAssento();
        System.out.println("Valor assento "+assentoEx.calcularPreco());
        assentoEx.venderAssento();
        System.out.println("Valor assento "+assentoEx.calcularPreco());

    }
}
