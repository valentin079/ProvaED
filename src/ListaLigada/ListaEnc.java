package ListaLigada;

public class ListaEnc<T extends Comparable<T>> extends Lista<T> {

    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public ListaEnc() {
        this.tamanho = 0;
    }


    @Override
    public boolean limpar() {
        this.tamanho = 0;
        this.primeiro = null;
        this.ultimo = null;
        return false;
    }

    @Override
    public void incluir(T novoDado) throws Exception {
        No<T> novoNo = new No<T>(novoDado);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
            this.ultimo = novoNo;
        }
        this.tamanho++;
    }

    @Override
    public void incluirInicio(T novoDado) throws Exception {
        No<T> novoNo = new No<T>(novoDado);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.primeiro.setProx(novoNo);
            this.primeiro = novoNo;
        }
        this.tamanho++;
    }


    @Override
    public void incluir(T novoDado, int posicao) throws Exception {

    }


    @Override
    public T get(int posicao){
        No atual = this.primeiro;
        for(int i=0; i < posicao; i++){
            if(atual.getProx() != null){
                atual = atual.getProx();
            }
        }
        return (T) atual;
    }

    @Override
    public int get(T elemento) throws Exception {
        return 0;
    }

    @Override
    public void remover(int remover) throws Exception {
        No<T> anterior = null;
        No<T> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getDado().equals(remover)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;

                } else if (atual == primeiro) {
                    this.primeiro = atual.getProx();
                    atual.setProx(null);

                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProx(null);

                } else {
                    anterior.setProx(atual.getProx());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProx();
        }
    }


    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean contem(T pesquisa) throws Exception {
        No<T> anterior = null;
        No<T> atual = this.primeiro;

        for (int i = 0; i < getTamanho(); i++) {
            if (atual.equals(pesquisa)) {
                System.out.println("achou");
            }
        }
        return true;
    }





    public No<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No<T> primeiro) {
        this.primeiro = primeiro;
    }

    public No<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(No<T> ultimo) {
        this.ultimo = ultimo;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


}


