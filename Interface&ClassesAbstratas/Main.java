//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Carro carro1 = new Carro("Honda",2018,4);
       Moto  moto1 = new Moto("Honda Biz",2015, 110);
       CarroEletrico carroEletrico1 = new CarroEletrico("Tesla",2024,4);

       System.out.println("Teste Carro:");
       //testando carro
       carro1.info();
       carro1.acelerar(20);
       carro1.abastecer(50.0);
       carro1.acelerar(20);
       carro1.acelerar(50);
       carro1.acelerar(10);
       carro1.frear(50);
       carro1.abastecer(120.0);
       carro1.abastecer(120.0);
       carro1.info();

       System.out.println("Teste Carro elétrico:");
       //testando carro elétrico
       carroEletrico1.info();
       carroEletrico1.acelerar(100);
       carroEletrico1.carregarbateria(50);
       carroEletrico1.carregarbateria(50);
       carroEletrico1.carregarbateria(50);
       carroEletrico1.acelerar(100);
       carroEletrico1.frear(50);
       carroEletrico1.info();

       System.out.println("Teste Moto:");
       //testando moto
       moto1.info();
       moto1.abastecer(40.0);
       moto1.acelerar(20);
       moto1.acelerar(10);
       moto1.frear(40);
       moto1.info();
    }
}