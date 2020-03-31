package prototype;

public class IPhone extends CelPrototype {

    public IPhone() {
        valorCompra = 0;
    }

    protected IPhone(IPhone celIPhone) {
        this.valorCompra = celIPhone.getValorCompra();
    }

    @Override
    public String exibirInfo() {
        return "MODELO: IPhone XR\nFABRICANTE: Apple\n" + "Valor: R$" + getValorCompra()+"\n";
    }

    @Override
    public CelPrototype Clonar() {
        return new  IPhone(this);
    }

}
