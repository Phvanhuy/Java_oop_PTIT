// package JAVA_OOP;

import java.util.Scanner;

public class Phuong_Trinh_Bac_Nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a==0 && b!=0) System.out.println("VN");
        else if(a==0 && b==0) System.out.println("VSN");
        else System.out.printf("%.2f", (float) -b/a );
    }
}
