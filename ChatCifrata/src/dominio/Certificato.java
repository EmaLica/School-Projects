package dominio;

import libCrittografia.Hash;

public class Certificato {
    private String nome;
    private String dataScadenza;
    private String nomeEnte;
    private String publicKey;
    private String firmaCertificato;

    public Certificato() {
    }

    public Certificato(String nome, String dataScadenza, String nomeEnte, String publicKey, String firmaCertificato) {
        this.nome = nome;
        this.dataScadenza = dataScadenza;
        this.nomeEnte = nomeEnte;
        this.publicKey = publicKey;
        this.firmaCertificato = firmaCertificato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String getNomeEnte() {
        return nomeEnte;
    }

    public void setNomeEnte(String nomeEnte) {
        this.nomeEnte = nomeEnte;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getFirmaCertificato() {
        return firmaCertificato;
    }

    public void setFirmaCertificato(String firmaCertificato) {
        this.firmaCertificato = firmaCertificato;
    }
    
    public String getHash() {
        return Hash.SHA256(nome + dataScadenza + nomeEnte + publicKey);
    }
}