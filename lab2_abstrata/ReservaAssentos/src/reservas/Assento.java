package reservas;

public abstract class Assento {
    protected double precoBase;

    public abstract double calcularPreco();
    public abstract void venderAssento();

    protected double calculaPrecoMedio(int totalAssentos, int totalAssentosVendidos){
        double val = totalAssentosVendidos * this.precoBase;
        return val/totalAssentos;
    }

}
