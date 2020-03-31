
package prototype;
public class GalaxyS10 extends CelPrototype 
{

    public GalaxyS10() {
    valorCompra=0 ;
    
    }
    protected GalaxyS10(GalaxyS10 celGalaxy){
        this.valorCompra = celGalaxy.getValorCompra();
    
    } 

    
    
    
    @Override
    public String exibirInfo() {
          return "MODELO: Galaxy S10\nFABRICANTE: Samsung\n" + "Valor: R$" + getValorCompra()+"\n";
    }

    @Override
    public CelPrototype Clonar() {
        return new GalaxyS10(this);
    }
    
}
