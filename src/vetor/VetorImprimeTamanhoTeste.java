package src.vetor;

public class VetorImprimeTamanhoTeste {

    public static void main(String[] args){

        Vetor vetor = new Vetor(10);
        try{
            vetor.adiciona("elemento1");
            vetor.adiciona("elemento2");
            vetor.adiciona("elemento3");
            vetor.adiciona("elemento4");
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(vetor);
    }
}
