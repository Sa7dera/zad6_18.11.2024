import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("podaj liczbe ");

        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();

        if ( liczba < 5 || liczba > 15){
            System.out.println("liczba " + liczba +" jest mniejsza niz 5 lub wieksza niz 15 ");
        }else{
            System.out.println(liczba + " nie spelnia warunku");
        }

        sc.close();
    }
}