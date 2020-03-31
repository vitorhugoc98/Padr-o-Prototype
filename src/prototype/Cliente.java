package prototype;

public class Cliente {

    public static void main(String[] args) {

        IPhone PrototipoApple1 = new IPhone();
        GalaxyS10 PrototipoSamsung1 = new GalaxyS10();
        Mi9 PrototipoXioami1 = new Mi9();
        
        
        
        CelPrototype IPhoneXrNovo = PrototipoApple1.Clonar();
        IPhoneXrNovo.setValorCompra(3500);
        CelPrototype IPhoneXrUsado = PrototipoApple1.Clonar();
        IPhoneXrUsado.setValorCompra(2500);
        
        CelPrototype GalaxyS10Novo = PrototipoSamsung1.Clonar();
        GalaxyS10Novo.setValorCompra(2800);
        CelPrototype GalaxyUsado = PrototipoSamsung1.Clonar();
        GalaxyUsado.setValorCompra(1800);
        
        CelPrototype Mi9Novo = PrototipoXioami1.Clonar();
        Mi9Novo.setValorCompra(1900);
        CelPrototype Mi9Usado = PrototipoXioami1.Clonar();
        Mi9Usado.setValorCompra(1300);
        
        System.out.println(IPhoneXrNovo.exibirInfo());
        System.out.println(IPhoneXrUsado.exibirInfo());
        
        System.out.println(GalaxyS10Novo.exibirInfo());
        System.out.println(GalaxyUsado.exibirInfo());
        
        System.out.println(Mi9Novo.exibirInfo());
        System.out.println(Mi9Usado.exibirInfo());
        
    }

}
