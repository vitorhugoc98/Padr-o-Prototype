package prototype;
public abstract class CelPrototype {
    protected double valorCompra;
    public abstract String exibirInfo();
    public abstract CelPrototype Clonar();

    
    
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
}
