import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;


public class Tarefa implements AcoesTarefa{
    Categoria categoria = new Categoria();
    Data data = new Data();
    Scanner scanner = new Scanner(System.in);

    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    //private String nome = categoria.nome;

    public Tarefa(String nome1, String titulo, String descricao, String prazo, int prioridade){
        //this.nome = nome1;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public Tarefa(String titulo, String descricao,String prazo, int prioridade){
        this.titulo = titulo;
        this.descricao = "descrição padrão";
        setPrazo(prazo);
        setPrioridade(prioridade);
    }

    public Tarefa(String titulo, String prazo, int prioridade){
        this.titulo = titulo;
        this.descricao = "descrição padrão";
    }

    public Tarefa(String titulo, String prazo){
        this.titulo = titulo;
        this.prazo = prazo;
    }

    public Tarefa(String titulo, int Prioridade1){
        this.titulo = titulo;
        setPrioridade(Prioridade1);
    }

    private boolean isPrazoValido(String prazo) {
        try {
            LocalDate.parse(prazo);
            return true;
        } catch (DateTimeParseException e){
            return false;
        }
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

    public void setPrazo(String prazo) {
        if (isPrazoValido(prazo)) {
            System.out.println("Prazo: " + getPrazo());
        } else {
            System.out.println("Prazo inválido");
        }
    }

    public void setPrioridade(int prioridade1){
        if(prioridade1 >= 1 || prioridade1 <= 5){
            this.prioridade = prioridade1;
            //System.out.println("prioridade: " + getPrioridade());
        }if(prioridade1 < 1 || prioridade1 > 5){
            System.out.println("Prioridade inválida.");
        }
    }

    public long calcularDiasRestantes() {
        LocalDate dataPrazo = LocalDate.parse(this.prazo);
        LocalDate hoje = LocalDate.now();

        return ChronoUnit.DAYS.between(hoje, dataPrazo);
    }

    public void exibirDetalhes() {
        setTitulo("TRABALHO POO");
        //System.out.println("Nome: " + this.nome);
        //System.out.println("Descrição: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        //System.out.println("Descrição: " + this.prazo);
        //System.out.println("Descrição: " + this.prioridade);
        //setPrazo(prazo);
        setPrioridade(0);
        //System.out.print("Prioridade: " + getPrioridade());
    }

    @Override
    public void executarTarefa(){
        System.out.println("Tarefa " + this.titulo + " foi executada");
    }

    public void cancelarTarefa(){
        System.out.println("Tarefa " + this.titulo + " foi cancelada");
    }
}
