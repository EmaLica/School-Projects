package service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import libCrittografia.EccezioneCripto;
import libCrittografia.Rsa;
import view.IView;

public class Controllore {

    private final Rsa chiavi;
    private final IView view;

    public Controllore(IView view) throws EccezioneCripto {
        chiavi = new Rsa();
        this.view = view;
        this.view.setControllore(this);
    }

    public boolean checkAut(String msg) throws ParseException {
        boolean FOLS = false;
        boolean TRU = true;
        try {
            String ticket = chiavi.decifraPubblica(msg, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjyYn1wfS7PSeDWSmFZY1EODzVbLRqTm9p0zd+oEgZQqpKtpjeg15fL4bMT7GhhdDKaZeNjHduasand9KzSZCCXIr9o2FqUPAddAKbeV6mhW3U7FUdsTf6SrnSM6OYH58gBA/ujSYwJnS3Z5yZjSM81nmIHx+2s+h5piOMahyQUk5j/KOAtpzTJ8IUEfFJo8o5PpmcqJCEC5t8yzsgyDXOyHrjr1iTJ9ioomrnxlQg8Pc7fGo52FwqsiQdcX4irNkUtGcqPTTKBP6AFu4bmcVlwC300WbCIrdIpcQqVotaKoegSeitpZyL8/nORAX/Ihe02KAa1sLXQO4Ky+5XsjyXwIDAQAB");
            String[] split = ticket.split(";");
            LocalDate oggi = LocalDate.now();
            LocalDate dataTicket = LocalDate.parse(split[1], DateTimeFormatter.ISO_LOCAL_DATE);
            if (dataTicket.isAfter(oggi)) {
                return TRU;
            } return FOLS;
        } catch (EccezioneCripto | IllegalArgumentException e) {
            return FOLS;
        }
    }
}