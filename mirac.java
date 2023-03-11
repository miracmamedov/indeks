import java.util.Scanner;
public class mirac {
    public static void main(String[] args) {
      int kutle;
      double boy,indeks;
     Scanner inp=new Scanner(System.in);
      System.out.print("kutleyi giriniz");
     kutle = inp.nextInt();
      System.out.print("boyunuzu giriniz");
      boy= inp.nextDouble();
      indeks=kutle/(boy*boy);
      System.out.print("vucut kitle indeksiniz:"+ indeks);





    }
}
