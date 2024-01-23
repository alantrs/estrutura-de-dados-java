package src.vetor;

public class Vetor {

    private String[] elementos;
    private Integer quantidade;

    public Vetor(Integer capacidade){
        this.elementos = new String[capacidade];
        this.quantidade = 0;
    }

    public Boolean adiciona(String elemento) {
        if(this.quantidade < this.elementos.length) {
            this.elementos[this.quantidade] = elemento;
            this.quantidade++;
            return true;
        }
        return false;
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

    public String busca(Integer posicao) {
        if (!(posicao >= 0 && posicao < this.elementos.length)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }
}
