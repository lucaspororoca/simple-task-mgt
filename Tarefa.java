public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    Categoria categoria = new Categoria();
    private String nome = categoria.nome;

    public Tarefa(String nome1, String titulo, String descricao, String prazo, int prioridade){
        this.nome = nome1;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String getPrazo(){
        return this.prazo;
    }

    public int getPrioridade(){
        return this.prioridade;
    }

    public void setTitulo(String titulo2){
        titulo = titulo2;
    }

    public void setDescricao(String descricao2){
        descricao = descricao2;
    }

    public void setPrazo(String prazo2){
        prazo = prazo2;
    }

    public void setPrioridade(int prioridade2){
        prioridade = prioridade2;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }
}
