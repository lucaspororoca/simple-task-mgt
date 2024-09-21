public class TarefaPrazoFlexivel extends Tarefa{

    private int diasFlexibilidade;

    public TarefaPrazoFlexivel(String titulo, String descricao, String prazo, int prioridade, int diasFlexibilidade){
        super(titulo, descricao, prazo, 5);
        this.diasFlexibilidade = diasFlexibilidade;
    }

    public int getPrazoFlexivel(){
        return this.diasFlexibilidade;
    }

    public void setPrazoFlexivel(){
        this.diasFlexibilidade = diasFlexibilidade;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Dias de Flexibilidade: " + this.diasFlexibilidade);
    }
}