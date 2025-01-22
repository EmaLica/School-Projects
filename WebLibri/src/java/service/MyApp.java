package service;

import dominio.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ws.rs.core.*;
import javax.ws.rs.*;
import sicurezza.ControlloreSicurezza;

@ApplicationPath("app")
@Path("/")
public class MyApp extends Application {
    private static final HashMap<String,Libro> libri = new HashMap<>();
    private ControlloreSicurezza c = new ControlloreSicurezza();
    
    @GET
    @Path("crealibro")
    public String creaLibro() {
        Libro libro = new Libro("La divina commedia", "12345678", 22.5f);
        libri.put(libro.getIsbn(), libro);
        return "Ok";
    }
    
    @GET
    @Path("libro/{isbn}")
    public Response getLibro(@PathParam("isbn") String isbn) {
        Libro obj = libri.get(isbn);
        if (obj == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            return Response.ok(obj).build();
        }
    }
    
    //SI DOVREBBE USARE IL POST
    @POST
    @Path("login")
    public Response login(String username, String password) {
        if (c.checkUtente(username, password))
            return Response.ok("ti ho mandato un cookie.").cookie(new NewCookie("pippo", "1234")).build();
        else 
            c.saveUtente(username, password);
        return null;
    }
    
    @GET
    @Path("libro/elenco")
    public List<Libro> elencoLibri(@CookieParam("pippo") String cookieDiSessione) {
        if (cookieDiSessione.equals("1234"))
            return new ArrayList<>(libri.values());
        else
            throw new WebApplicationException(Response.Status.FORBIDDEN);
    }
    
    //Inserimento di un libro inviato nella richiesta in formato JSON o XML
    @POST
    @Path("libro")
    @Consumes( {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML} )
    public void creaLibro(Libro obj) {
        if (obj != null) {
            if (!libri.containsKey(obj.getIsbn())) {
                libri.put(obj.getIsbn(), obj);
            }
        }
    }
    
    //Inserimento di un libro inviato da un FORM HTML
    @POST
    @Path("libro")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void creaLibroFromForm(
            @FormParam("titolo") String titolo,
            @FormParam("isbn") String isbn,
            @FormParam("prezzo") float prezzo) {
        Libro obj = new Libro(titolo, isbn, prezzo);
        if (obj != null) {
            if (!libri.containsKey(obj.getIsbn())) {
                libri.put(obj.getIsbn(), obj);
            }
        }
    }
    
    @GET
    @Path("{nomeUtente}/eta/{etaUtente}")
    public String benvenuto(
        @PathParam("nomeUtente") String nome,
        @PathParam("etaUtente") int eta) {
        return "Ciao " + nome + " hai " + eta + " anni";
    }
}