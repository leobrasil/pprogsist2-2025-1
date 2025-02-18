package reservas;

public class AssentoEconomica extends Assento{
    private int totalAssentos;
    private int assentosVendidos;

    public AssentoEconomica(int totalAssentos){
        this.precoBase = 50.0;
        this.totalAssentos = totalAssentos;
    }

    public void venderAssento(){
        this.assentosVendidos++;
    }

    @Override
    public double calcularPreco(){
        return this.calculaPrecoMedio(totalAssentos, assentosVendidos);
    }

}
