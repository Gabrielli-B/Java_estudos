public class Main {
    public static void main(String[] args){
        String nome = Manipulacao.nomeAluno();
        Manipulacao manipulacao = new Manipulacao(nome);
        manipulacao.perguntasEhRespostas();
        int nota = manipulacao.resul();
        System.out.println(nome + ", sua nota foi: "+nota);
    };

}
