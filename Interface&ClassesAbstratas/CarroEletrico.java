public class CarroEletrico extends Carro implements Eletrico{
    private int nivelBateria;

    public CarroEletrico(String modelo, int ano,int qtdPortas){
        super(modelo, ano,qtdPortas);
        this.nivelBateria=0;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void carregarbateria(int carga){
        if(getNivelBateria()< 100){
            if(getNivelBateria()+carga>=100){
                this.nivelBateria=100;
            }else{
                this.nivelBateria+=carga;
            }
        }else{
            System.out.println("Carga completa!");
            System.out.println("---------------------");
        }
    }

    @Override
    public void acelerar(int incremento){
        if (getNivelBateria()!=0){
            setVelocidadeAtual(getVelocidadeAtual()+incremento);
            this.nivelBateria-=10;
        }else{
            System.out.println("Impossível acelerar, sem carga!");
            System.out.println("---------------------");
        }
    }
    @Override
    public void abastecer(double litros) {
        System.out.println("Carros elétricos não tem tanque de combustível");
    }
    @Override
    public void info(){
        System.out.println("Modelo | "+getModelo());
        System.out.println("Ano    | "+getAno());
        System.out.println("Quantidade de portas | "+getQtdPortas());
        System.out.println("Nivel de bateria     | "+getNivelBateria() +"%");
        System.out.println("Velocidade atual     | "+ getVelocidadeAtual());
        System.out.println("-------------------------------");
    }

}

