package src.vetor;

public class Vetor {

    private String[] elementos;
    private Integer quantidade;

    public Vetor(Integer capacidade){
        this.elementos = new String[capacidade];
        this.quantidade = 0;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i = 0; i <this.quantidade -1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.quantidade >0){
            s.append(this.elementos[quantidade -1]);
        }

        s.append("]");
        return s.toString();
    }

    public void adiciona(String elemento) {
        if(this.quantidade > this.elementos.length) {
            System.out.println("Array cheio");
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }

    public void adiciona(Integer posicao, String elemento){

        for (int i = this.quantidade - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.quantidade++;
    }

    public String busca(Integer posicao) {
        if (!(posicao >= 0 && posicao < this.elementos.length)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public Integer verificarExiste(String elemento){
        for (int i = 0; i < quantidade; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
}
