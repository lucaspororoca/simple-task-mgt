public class  TarefaComAlerta extends Tarefa implements Notificacao{
    public TarefaComAlerta(String titulo, String descricao, String prazo, int prioridade){
        super(titulo, descricao, prazo, prioridade);
        this.enviarNotificacao();
    }

    public void enviarNotificacao(){
        System.out.println("A Tarefa " + super.getTitulo() + " foi enviada");
    }
}
