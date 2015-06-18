import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploEntradaSalida {
    public static void main(String[] args) {
        //Instancio la clase BufferedReader, en la cual hago lectura del teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Capturo el dato escrito en el teclado
            String s = br.readLine();
            System.out.println("La variable s vale: "+s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
