import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpressoraDeque impressora = new ImpressoraDeque();

        while (true) {
            exibirMenu();
            try {
                System.out.print(">> Escolha uma opção: ");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        impressora.adicionarDocumentoNormal();
                        System.out.println("Documento normal adicionado com sucesso!");
                        break;
                    case 2:
                        impressora.adicionarDocumentoUrgente();
                        System.out.println("Documento urgente adicionado com sucesso!");
                        break;
                    case 3:
                        try {
                            impressora.processarProximo();
                        } catch (NoSuchElementException e) {
                            System.err.println("ERRO: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            impressora.processarUltimo();
                        } catch (NoSuchElementException e) {
                            System.err.println("ERRO: " + e.getMessage());
                        }
                        break;
                    case 5:
                        impressora.visualizarFila();
                        break;
                    case 6:
                        System.out.println("Total de documentos na fila: " + impressora.totalDocumentos());
                        break;
                    case 7:
                        System.out.println("Total de páginas a imprimir: " + impressora.totalPaginas());
                        break;
                    case 8:
                        if (impressora.filaVazia()) {
                            System.out.println("Sim, a fila de impressão está vazia.");
                        } else {
                            System.out.println("Não, a fila de impressão contém documentos.");
                        }
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema de impressão. Até logo!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                }
            } catch (InputMismatchException _) {
                System.err.println("ERRO: Por favor, digite um número inteiro válido.");
                scanner.next();
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE FILA DE IMPRESSÃO =====");
        System.out.println("1. Adicionar documento Normal");
        System.out.println("2. Adicionar documento Urgente");
        System.out.println("3. Processar Próximo documento (do início)");
        System.out.println("4. Processar Último documento (do final)");
        System.out.println("5. Visualizar Fila de Impressão");
        System.out.println("6. Ver Total de Documentos na Fila");
        System.out.println("7. Ver Total de Páginas na Fila");
        System.out.println("8. Verificar se a Fila está Vazia");
        System.out.println("0. Sair do Sistema");
        System.out.println("========================================");
    }
}