package reservas;

public class AssentoExecutiva extends Assento{
    private int totalAssentos;
    private int assentosVendidos;

    public AssentoExecutiva(int totalAssentos){
        this.precoBase = 150.0;
        this.totalAssentos = totalAssentos;
    }

    public void venderAssento(){
        this.assentosVendidos +=2;
    }

    @Override
    public double calcularPreco(){
        return this.calculaPrecoMedio(totalAssentos, assentosVendidos);
    }

}
