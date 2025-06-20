public class Documento {
    private String id;
    private String tipoDocumento;
    private int qtdPaginas;

    public Documento(String id, String tipoDocumento, int qtdPaginas) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.qtdPaginas = qtdPaginas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

}
