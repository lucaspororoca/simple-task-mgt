import java.util.Scanner;

public class Tarefa {
    Categoria categoria = new Categoria();
    Data data = new Data();
    Scanner scanner = new Scanner(System.in);

    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    private String nome = categoria.nome;

    public Tarefa(String nome1, String titulo, String descricao, String prazo, int prioridade){
        this.nome = nome1;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public Tarefa(String titulo, String prazo){
        this.titulo = titulo;
        this.prazo = prazo;
    }

    public Tarefa(String titulo, int Prioridade1){
        this.titulo = titulo;
        setPrioridade(prioridade);
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

    public void setPrioridade(int prioridade1){
        if(prioridade1 < 0){
            prioridade = 0;
        }
        
        if(prioridade1 > 5){
            prioridade = 5;
        }
    }

    public void exibirDetalhes(){

        setTitulo("TRABALHO POO");
        
        System.out.println("Nome: " + this.nome);
        scanner.nextLine();

        System.out.println("Titulo: " + getTitulo());
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        scanner.nextInt();
        System.out.println("Prioridade: " + this.prioridade);

        //data.ExibirData();
    }
}
