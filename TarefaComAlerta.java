public class  TarefaComAlerta extends Tarefa implements Notificacao{
    public TarefaComAlerta(String titulo, String descricao, String prazo, int prioridade){
        super(titulo, descricao, prazo, prioridade);
    }

    public void enviarNotificacao(){
        System.out.println("Tarefa foi enviada");
    }
}
