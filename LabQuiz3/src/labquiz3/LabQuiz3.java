/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz3;
import java.util.Scanner;
/**
 *
 * @author Mehmet Sait
 */
public class LabQuiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Bir yazı yazınız :");
       String yazi=in.nextLine();
       String kucukYazi= yazi.toLowerCase();//tüm yazıyı küçük harfe çevirir
       int harf=0,sayac=0;
       for (int i=0;i<kucukYazi.length();i++)
       {
           harf=kucukYazi.charAt(i);//yazıyı harflere ayırır
           if (harf>'d') sayac++;// d harfinden sonra gelen karakter sayısını tutar
       }
       System.out.println("d harfinden sonra gelen harf adedi="+sayac);
    

    }
    
}
