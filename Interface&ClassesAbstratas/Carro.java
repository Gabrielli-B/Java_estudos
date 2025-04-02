public class Carro extends Transporte{
    private int qtdPortas;

    public Carro(String modelo, int ano, int qtdPortas){
        super(modelo,ano);
        this.qtdPortas=qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }


    @Override
    public void info(){
        super.info();
        System.out.println("Quantidade de portas | " +getQtdPortas());
        System.out.println("-------------------------------");
    }
}
