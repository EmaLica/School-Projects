package httpcalcolatrice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author emanu
 */
public class HTTPCalcolatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Tabella pitagorica
        // numeri con calcoli

        ServerSocket server = new ServerSocket(80);
        System.out.println("In ascolto sulla porta 80....");
        while (true) {
            try (Socket socket = server.accept()) {
                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(isr);
                String line = reader.readLine();
                System.out.println(line);
                String s = "";
                String richiesta[];
                String get[];
                String l[];
                String httpResponse = "";
                while (!line.isEmpty()) {
                    s += line + "\n";
                    line = reader.readLine();
                }
                int i = 0;
                richiesta = s.split("\n");
                get = richiesta[0].split(" ");
                l = get[1].split("%20");
                switch (l[0]) {
                    case "/calcolatrice":
                        switch (l[2]) {
                            case "+":
                                i = Integer.parseInt(l[1]) + Integer.parseInt(l[3]);
                                System.out.println(i);
                                break;
                            case "-":
                                i = Integer.parseInt(l[1]) - Integer.parseInt(l[3]);
                                System.out.println(i);
                                break;
                            case "*":
                                i = Integer.parseInt(l[1]) * Integer.parseInt(l[3]);
                                System.out.println(i);
                                break;
                            case "/":
                                i = Integer.parseInt(l[1]) / Integer.parseInt(l[3]);
                                System.out.println(i);
                                break;
                        }
                        httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + i;
                        break;
                    case "/tabPitagorica":
                        for (int z = 1; z <= 10; z++) {
                            for (int j = 1; j <= 10; j++) {
                                int prodotto = z * j;
                                if (prodotto < 10) {
                                    System.out.print("   ");
                                } else if (prodotto < 100) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print(" ");
                                }
                                System.out.print(z * j);
                            }
                            System.out.println();
                        }
                        httpResponse = "HTTP/1.1 200 OK\r\n\r\n";
                        break;
                }

                OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
                out.write(httpResponse);
                out.flush();
                out.close();
            }
        }
    }

}
