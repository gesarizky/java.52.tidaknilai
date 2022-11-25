
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class tidaknilai {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Y1 ");
        System.out.println(" *************************************************************");

        double y1 = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Y2 ");
        System.out.println(" ************************************************************* ");

        double y2 = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai X1 ");
        System.out.println(" ************************************************************* ");

        double x1 = sc.nextInt();

        double senilai = x1 * y2 / y1;
        double tinilai = x1 * y1 / y2;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Hasil Senilai : Y1/Y2 = X1/X2 = " + senilai);
        System.out.println(" *Maka Hasil Berbalik Nilai : Y1/Y2 = X2/X1 = " + tinilai);
        System.out.println(" ********************************************************** ");
    }
}
