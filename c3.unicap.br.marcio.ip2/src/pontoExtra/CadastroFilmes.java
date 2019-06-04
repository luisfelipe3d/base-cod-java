package pontoExtra;
public class CadastroFilmes{
    private int qtdFilmes;
    private Filme[] totalFilmes;

    public CadastroFilmes(int qtd){
        this.totalFilmes = new Filme[qtd];
    }

    public int buscaMelhorada(Filme f[], double relevancia){
        for(int i = 0; i < this.qtdFilmes; i++){
            if(relevancia >= this.totalFilmes[i].getRelevancia()){
                return i; //retorna repetido ou ponto de inserção
            }
        }
        return -1;
    }

    public void inserirOrdenado(Filme f) {
        if(this.qtdFilmes == this.totalFilmes.length) {
            System.out.println("Vetor cheio!");
        }else{ //vetor não cheio
            /*if(this.qtdFilmes == 0){
                this.totalFilmes[this.qtdFilmes] = f;
                this.qtdFilmes++;
            } else {*/
                int aux = busca(this.totalFilmes, f.getRelevancia());//busca se filme já existe
                if(aux != -1) { //encontrou == ou ponto de inserção
                    //testar se filme já foi cadastrado: não permite repetidos
                    if(this.totalFilmes[aux].getRelevancia() == f.getRelevancia()) {
                        if(f.getDislikes() < this.totalFilmes[aux].getDislikes()) {
                            for (int i = this.qtdFilmes; i > aux; i--) {
                                this.totalFilmes[i] = this.totalFilmes[i - 1];
                            }
                            this.totalFilmes[aux] = f;
                            this.qtdFilmes++;
                        }else{
                            for(int i = this.qtdFilmes; i > aux + 1; i--) {
                                this.totalFilmes[i] = this.totalFilmes[i - 1];
                            }
                            this.totalFilmes[aux + 1] = f;
                            this.qtdFilmes++;
                        }
                    }else if(this.totalFilmes[aux].getRelevancia() > f.getRelevancia()) {
                        for (int i = this.qtdFilmes; i > aux; i--) {
                            this.totalFilmes[i] = this.totalFilmes[i - 1];
                        }
                        this.totalFilmes[aux] = f;
                        this.qtdFilmes++;
                    }else{
                        for (int i = this.qtdFilmes; i > aux + 1; i--) {
                            this.totalFilmes[i] = this.totalFilmes[i - 1];
                        }
                        this.totalFilmes[aux + 1] = f;
                        this.qtdFilmes++;
                    }
                }else{
                    this.totalFilmes[qtdFilmes] = f;
                    this.qtdFilmes++;
                }
            }
        }
    

    public Filme consulta(String titulo) {
        for (int i = 0; i < this.qtdFilmes; i++) {
            if (this.totalFilmes[i].getTitulo().equalsIgnoreCase(titulo)) {
                return this.totalFilmes[i];
            }
        }
        return null;
    }
    
    private int buscarFilme(String titulo){
        for(int i = 0; i < this.qtdFilmes; i++){
            if(this.totalFilmes[i].getTitulo().equalsIgnoreCase(titulo))
                return i;
        }
        return -1;
    }

    public void removerFilme(String titulo){
        int c = buscarFilme(titulo);
        if(c == -1)
            System.out.println("Filme não cadastrado!");
        else{
            for(int i = c; i < this.qtdFilmes - 1; i++) {
                this.totalFilmes[i] = this.totalFilmes[i + 1];
            }
            this.totalFilmes[this.qtdFilmes-1] = null;
            this.qtdFilmes--;
        }
    }
    
    public void listarFilmes(){
        for(int i = 0; i < this.qtdFilmes; i++){
            System.out.println(totalFilmes[i]);
        }
    }
    
    public boolean isEmpty(){
        return this.qtdFilmes == 0;
    }
}
