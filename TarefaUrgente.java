public class TarefaUrgente extends Tarefa{

    private String razaoUrgencia;

    public TarefaUrgente(String titulo, String descricao, String prazo, int prioridade, String razaoUrgencia){
        super(titulo, descricao, prazo, 5);
        this.razaoUrgencia = razaoUrgencia;
    }

    public String getRazaoUrgencia(){
        return this.razaoUrgencia;
    }

    public void setRazaoUrgencia(){
        this.razaoUrgencia = razaoUrgencia;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Razão da Urgencia: " + this.razaoUrgencia);
    }
}
