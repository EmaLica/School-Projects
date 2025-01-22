package dominio;

public class Autenticazione {
    private Certificato certificato;
    private String chiavePrivata;

    public Autenticazione(String nome, String chiavePubblica, String chiavePrivata, String nomeEnte) {
        certificato = new Certificato(nome, "10/06/2023", nomeEnte, chiavePubblica, "");
        this.chiavePrivata = chiavePrivata;
    }

    public Certificato getCertificato() {
        return certificato;
    }

    public void setCertificato(Certificato certificato) {
        this.certificato = certificato;
    }

    public String getChiavePrivata() {
        return chiavePrivata;
    }

    public void setChiavePrivata(String chiavePrivata) {
        this.chiavePrivata = chiavePrivata;
    }
}