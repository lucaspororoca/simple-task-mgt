public class TarefaSemPrazo extends Tarefa{

    public TarefaSemPrazo(String titulo, String descricao, String prazo, int prioridade){
        super(titulo, descricao, prazo, 5);
    }
    
    public long calcularDiasRestantes() {
        return super.calcularDiasRestantes() - 1;
    }

    @Override
    public void exibirDetalhes(){
        TarefaUrgente tarefaurgente = new TarefaUrgente("Estudar para provas", "Tarefa para estudos", "2024-06-12",1, "Prioridade de estudos");
        TarefaPrazoFlexivel tarefaprazoflexivel = new TarefaPrazoFlexivel("Estudar para Prova prazo", "tarefa prazo flex.", "2024-06-12", 2, 3);
        
        Tarefa[] listaTarefas = new Tarefa[2];

        listaTarefas[0] = tarefaprazoflexivel;
        listaTarefas[1] = tarefaurgente;
    }
}