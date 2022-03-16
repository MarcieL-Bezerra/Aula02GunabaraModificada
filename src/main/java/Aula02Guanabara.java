import java.util.Scanner;

public class Aula02Guanabara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Caneta c1 = new Caneta();

        System.out.println("Olá tenho canetas para vender, digite qual modelo você deseja: ");
        c1.modelo = scan.next();

        System.out.println("digite qual a cor você deseja: ");
        c1.cor = scan.next();

        System.out.println("digite qual a ponta você deseja: ");
        c1.setPonta(Double.parseDouble(scan.next().replace(",","."))); //aceita virgula ou ponto devido replace alem de converter string por double


        System.out.println("digite qual a carga você deseja: ");
        c1.carga = scan.nextInt();
        c1.status();
        c1.rabiscar();
        //c1.destampar();
        System.out.println("Tampando a caneta");
        c1.tampar();




        c1.status();
        c1.rabiscar();

    }
}
