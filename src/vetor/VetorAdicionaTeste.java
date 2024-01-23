package src.vetor;

public class VetorAdicionaTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try{
            vetor.adiciona("elemento1");
            vetor.adiciona("elemento2");
            System.out.println(vetor.getTamanho());
        }catch(Exception e){
            System.out.println("Vetor cheio" +  e);
        }

        System.out.println(vetor.toString());

    }
}
