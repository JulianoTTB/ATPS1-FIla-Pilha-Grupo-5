import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        // Pilha - Histórico de Solicitações:
        System.out.println("-=== PILHA ===-");
        Elemento[] historico = new Elemento[] {
                new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"),
                new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
                new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
                new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"),
                new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"),
                new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"),
                new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };

        Pilha p1 = new Pilha();
        for (Elemento e : historico) {
            p1.inserirTopo(e);
        }

        System.out.println("Histórico antes de remover:");
        p1.verificarHistorico();
        System.out.println("\nRemovendo...");
        p1.removerTopo();
        System.out.println("\nHistórico após remoção:");
        p1.verificarHistorico();

        System.out.println();
        System.out.println();
        System.out.println();



        // Fila - Ordem de Atendimento:
        System.out.println("-=== FILA ===-");
        Elemento[] filaAtendimento = new Elemento[] {
                new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"),
                new Elemento("CLI002", "João Souza", "Reclamação de serviço"),
                new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"),
                new Elemento("CLI004", "Pedro Alves", "Informações de entrega"),
                new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
                new Elemento("CLI006", "Lucas Martins", "Alteração de pedido"),
                new Elemento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
                new Elemento("CLI008", "Rafael Lima", "Renovação de assinatura"),
                new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
                new Elemento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };

        Fila f1 = new Fila();
        for (Elemento e : filaAtendimento) {
            f1.inserir(new ElementoFila(e.getId(), e.getDescricao(), e.getData_hora()));
        }

        System.out.println("Fila de atendimento completa:");
        NoFila atual = f1.espiar();
        while (atual != null) {
            ElementoFila elem = atual.getElemento();
            System.out.println("ID: " + elem.getNumeroIdentificacao());
            System.out.println("Nome: " + elem.getNome());
            System.out.println("Motivo: " + elem.getMotivo());
            System.out.println("------------------------");
            atual = atual.getProximo();
        }

        System.out.println("\nRemovendo...");
        f1.remover();

        System.out.println("\nFila atualizada:");
        atual = f1.espiar();
        while (atual != null) {
            ElementoFila elem = atual.getElemento();
            System.out.println("ID: " + elem.getNumeroIdentificacao());
            System.out.println("Nome: " + elem.getNome());
            System.out.println("Motivo: " + elem.getMotivo());
            System.out.println("------------------------");
            atual = atual.getProximo();
        }
    }
}
