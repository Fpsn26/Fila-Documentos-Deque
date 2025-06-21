import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

public class ImpressoraDeque {

    private final Deque<Documento> filaDeImpressao;
    private final Set<String> idsUtilizados;
    private final Random random = new Random();
    private final List<String> tiposDeDocumento = Arrays.asList("PDF", "TXT", "JPG", "PNG", "DOCX", "XLSX");

    public ImpressoraDeque() {
        this.filaDeImpressao = new ArrayDeque<>();
        this.idsUtilizados = new HashSet<>();
    }

    public void adicionarDocumentoNormal() {
        filaDeImpressao.addLast(this.gerarDocumento());
    }

    public void adicionarDocumentoUrgente() {
        filaDeImpressao.addFirst(this.gerarDocumento());
    }

    public Documento processarProximo() {
        if (filaDeImpressao.isEmpty()) {
            throw new NoSuchElementException("Não é possível processar: a fila de impressão está vazia.");
        }
        Documento documentoProcessado = filaDeImpressao.removeFirst();
        idsUtilizados.remove(documentoProcessado.getId());
        System.out.println("Processando documento do INÍCIO: " + documentoProcessado);
        return documentoProcessado;
    }

    public Documento processarUltimo() {
        if (filaDeImpressao.isEmpty()) {
            throw new NoSuchElementException("Não é possível processar: a fila de impressão está vazia.");
        }
        Documento documentoProcessado = filaDeImpressao.removeLast();
        idsUtilizados.remove(documentoProcessado.getId());
        System.out.println("Processando documento do FINAL: " + documentoProcessado);
        return documentoProcessado;
    }

    public void visualizarFila() {
        System.out.println("\n--- Fila de Impressão Atual ---");
        if (filaDeImpressao.isEmpty()) {
            System.out.println(">> A fila está vazia.");
        } else {
            int posicao = 1;
            for (Documento documento : filaDeImpressao) {
                System.out.println(posicao + ". " + documento);
                posicao++;
            }
        }
        System.out.println("---------------------------------\n");
    }

    public boolean filaVazia() {
        return filaDeImpressao.isEmpty();
    }

    public int totalDocumentos() {
        return filaDeImpressao.size();
    }

    public int totalPaginas() {
        int somaDePaginas = 0;
        for (Documento documento : filaDeImpressao) {
            somaDePaginas = somaDePaginas + documento.getQtdPaginas();
        }
        return somaDePaginas;
    }

    private Documento gerarDocumento() {
        int idGerado;
        while (true) {
            int idCandidato = random.nextInt(1000) + 1;
            if (!idsUtilizados.contains(Integer.toString(idCandidato))) {
                idGerado = idCandidato;
                idsUtilizados.add(Integer.toString(idGerado));
                break;
            }
        }

        int qtdPaginasAleatorio = random.nextInt(100) + 1;
        String tipoDocumento = this.gerarTipoDeDocumentoAleatorio();

        return new Documento(Integer.toString(idGerado), tipoDocumento, qtdPaginasAleatorio);
    }

    private String gerarTipoDeDocumentoAleatorio() {
        int indiceAleatorio = random.nextInt(tiposDeDocumento.size());
        return tiposDeDocumento.get(indiceAleatorio);
    }
}