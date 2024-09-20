//LUCAS MARCO POROROCA BRANDÃO
//JUNIO VALERIO T. RODRIGUES
public class Main{
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-09-18", 0);

        System.out.println("=============== Tarefa 1 ===============");
        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println();

        System.out.println("=============== Tarefa 2 ===============");
        
        tarefa1.exibirDetalhes();   
        
        System.out.println("");
        System.out.println("=============== Tarefa 3 ===============");

        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2024-09-28");
        
        tarefa2.exibirDetalhes();
        
        System.out.println("Dias restantes para a tarefa 1: " + tarefa2.calcularDiasRestantes());
        
        tarefa2.setPrazo("2024-07-28");
        
        System.out.print("Novo prazo da tarefa 1: " + tarefa2.getPrazo());
        System.out.println("");

        System.out.println("=============== Tarefa 4 ===============");

        TarefaUrgente tarefaurgente = new TarefaUrgente("Estudar para provas", "Tarefa para estudos", "2024-06-12",1, "Prioridade de estudos");
        TarefaPrazoFlexivel tarefaprazoflexivel = new TarefaPrazoFlexivel("Estudar para Prova prazo", "tarefa prazo flex.", "2024-06-12", 2, 3);

        Tarefa[] listaTarefas = new Tarefa[3];

        listaTarefas[0] = tarefa1;
        listaTarefas[1] = tarefa2;
        listaTarefas[2] = tarefaurgente;
        listaTarefas[3] = tarefaprazoflexivel;

        for (Tarefa tarefa : listaTarefas) {
            tarefa.exibirDetalhes();
        }
    }
}   