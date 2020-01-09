package lanqiao;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Scanner;

public class BigIntergerDemo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal[][] bigDecimals = new BigDecimal[30][30];
        String str = "";
        int h=0;
        while (h<30) {

            str = scanner.nextLine();
            for (int i=0;i<str.length();i++){
                if (h>0){
                    if (i!=0&&i!=str.length()-1) {
                        BigDecimal bigDecimal=bigDecimals[h - 1][i - 1].divide(new BigDecimal("2"));
                        BigDecimal bigDecimal1=bigDecimals[h - 1][i].divide(new BigDecimal("2"));
                        bigDecimals[h][i] = new BigDecimal(String.valueOf(str.charAt(i))).add(bigDecimal).add(bigDecimal1);
                    }else if (i==str.length()-1){
                        BigDecimal bigDecimal=bigDecimals[h - 1][i-1].divide(new BigDecimal("2"));
                        bigDecimals[h][i] = new BigDecimal(String.valueOf(str.charAt(i))).add(bigDecimal);
                    } else if (i==0){
                        BigDecimal bigDecimal=bigDecimals[h - 1][i].divide(new BigDecimal("2"));
                        bigDecimals[h][i] = new BigDecimal(String.valueOf(str.charAt(i))).add(bigDecimal);
                    }
                }
                else {
                    bigDecimals[h][i]=new BigDecimal(String.valueOf(str.charAt(i)));
                }
                System.out.printf(bigDecimals[h][i].toString()+" ");
            }
            h++;
            System.out.println("");
        }
        scanner.close();
    }

}
