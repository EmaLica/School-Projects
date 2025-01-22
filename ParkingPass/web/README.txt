Progetto applicazione parcheggio con autenticazione qr

Componenti:
Java application con scheletro MVC
Classe view con interfaccia grafica relativa

Classe/i per gestire la cifratura/decifratura del qr

Classe/i per gestire la creazione dei qr, quindi che -> connette al sito, ottiene i dati necessari, passa al sito i dati, prende il qr generato
[___ Classe/i che permette di generare qr temporanei

Classe/i per gestire la cifratura delle informazioni del database (diversa da quella usata per il qr)

Applicazione dekstop che simula il controllore e permette di verificare i qr ed eventualmente alzare la sbarra

- Java application + view 
- cifratura asimmetrica 
- si generano i qr (libreria del prof/usi sito magistri) -> dentro: targa - username - data di scadenza del qr
- database con alcuni campi cifrati accessibili solo con la chiave (diversa dalla cifratura del qr)
- utenti devono avere un enum per separare i lavori, massimo 3 qr per utente

SCALETTA:

WebApp (Genera QR)
- 1: login utente + controllo credenziali dal database
- 2: generazione qr con cifratura chiave pubblica del controllore

Desktop App (Controllore)
- 1: controllare la validità del qr + autenticazione dell'hash cifrato con chiave privata del controllore
- 2: lista not(normale) qr banditi
- 3: operazione simulata sulla sbarra in base alla validità del qr

Aggiunta -> Creatore di Utenti:
- 1: Permette di richiedere la creazione di un proprio utente
- 2: Riceve i dati dell'utente
- 3: crea la sua istanza nel database


