 abstract public class Transporte implements Veiculo {
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    private double combustivel;

    public Transporte(String modelo, int ano){
        this.modelo=modelo;
        this.ano=ano;
        this.velocidadeAtual=0;
        this.combustivel=0;
    }
     public String getModelo() {
         return modelo;
     }
     public int getAno() {
         return ano;
     }

     public int getVelocidadeAtual() {
         return velocidadeAtual;
     }

     public void setVelocidadeAtual(int velocidadeAtual) {
         this.velocidadeAtual = velocidadeAtual;
     }
     public double getCombustivel() {
         return combustivel;
     }
     public void acelerar(int incremento){
         if (getCombustivel()!=0){
             this.velocidadeAtual+=incremento;
             this.combustivel-=5;
         }else{
             System.out.println("Impossível acelerar, sem combustível");
             System.out.println("--------------------------------");
         }
     }
     public void frear(int decremento){
        if(decremento>getVelocidadeAtual()){
            this.velocidadeAtual=0;
        }else{
            this.velocidadeAtual-=decremento;
        }
     }
     public void abastecer(double litros) {
        if(getCombustivel()<100.0){
            if(getCombustivel()+litros >= 100.0){
                this.combustivel=100.0;
            }else{
                this.combustivel+=litros;
            }
        }else{
            System.out.println("Tanque cheio!");
            System.out.println("-------------------");
        }
     }
     public void info(){
        System.out.println("Modelo | "+getModelo());
        System.out.println("Ano    | "+getAno());
        System.out.println("Velocidade Atual | "+getVelocidadeAtual());
         System.out.println("Combustivel     | "+getCombustivel());
     }
 }
