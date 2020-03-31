package prototype;
public class Mi9 extends  CelPrototype{

    public Mi9() {
    valorCompra =0;
            
    }
    protected Mi9(Mi9 celMi9){
        this.valorCompra = celMi9.getValorCompra();
    
    } 
    
    
    
    
    
    @Override
    public String exibirInfo() {
        return "MODELO: Mi9 Lite\nFABRICANTE: Xiaomi\n" + "Valor: R$" + getValorCompra()+"\n";
    }

    @Override
    public CelPrototype Clonar() {
        return new Mi9(this);
    }


    
}
