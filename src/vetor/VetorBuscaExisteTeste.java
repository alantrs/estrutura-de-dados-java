package src.vetor;

public class VetorBuscaExisteTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");

        Integer e = vetor.verificarExiste("elemento3");

        if (e == -1){
            System.out.println("Não existe");
        }else{
            System.out.println("Existe e esta na posicao: " + e);
        }
    }
}
