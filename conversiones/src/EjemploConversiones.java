
public class EjemploConversiones {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        double c = 0.5f;
        c = a;      //Conversion implicita
        a =(int)c;  //Conversion explicita o "casting"
        String s = "7";
        b = Integer.parseInt(s); //Conversion utilizando metodos de clases primitivas
        //escribo sout + tab = System.out.println();
        System.out.println(a + c + b);
    }
}
