public class Moto extends Transporte{
    private int cilindradas;

    public Moto(String modelo, int ano, int cilindradas){
        super(modelo, ano);
        this.cilindradas=cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Cilindradas | " +getCilindradas());
        System.out.println("-------------------------------");
    }
}
