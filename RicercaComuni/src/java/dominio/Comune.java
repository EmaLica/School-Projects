package dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@NamedQueries({
    @NamedQuery(name = "Comune.inizialePerCAP", query = "SELECT c FROM Comune c WHERE c.cap LIKE :cap ORDER BY c.comune DESC"),
    @NamedQuery(name = "Comune.inizialePerProvincia", query = "SELECT c FROM Comune c WHERE UPPER(c.provincia) LIKE UPPER(:provincia) ORDER BY c.comune DESC"),
    @NamedQuery(name = "Comune.inizialePerIstat", query = "SELECT c FROM Comune c WHERE c.istat LIKE :istat ORDER BY c.comune DESC"),
    @NamedQuery(name = "Comune.inizialePerComune", query = "SELECT c FROM Comune c WHERE c.comune LIKE :comune ORDER BY c.comune DESC")
})

@Entity
@XmlRootElement
public class Comune implements Serializable {
    @Id
    private String istat;
    private String comune;
    private String provincia;
    private String regione;
    private String prefisso;
    private String cap;
    private String codFisco;
    private String abitanti;
    private String link;

    public Comune() {
    }

    public Comune(String istat, String comune, String provincia, String regione, String prefisso, String cap, String codFisco, String abitanti, String link) {
        this.istat = istat;
        this.comune = comune;
        this.provincia = provincia;
        this.regione = regione;
        this.prefisso = prefisso;
        this.cap = cap;
        this.codFisco = codFisco;
        this.abitanti = abitanti;
        this.link = link;
    }

    public String getIstat() {
        return istat;
    }

    public void setIstat(String istat) {
        this.istat = istat;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getPrefisso() {
        return prefisso;
    }

    public void setPrefisso(String prefisso) {
        this.prefisso = prefisso;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCodFisco() {
        return codFisco;
    }

    public void setCodFisco(String codFisco) {
        this.codFisco = codFisco;
    }

    public String getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(String abitanti) {
        this.abitanti = abitanti;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}