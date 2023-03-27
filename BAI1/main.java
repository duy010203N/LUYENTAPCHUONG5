package BAI1;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        chuyenxe cx= new chuyenxe();
        ngoaithanh ngt= new ngoaithanh();
        noithanh nt= new noithanh();
        nt.nhap();
        ngt.nhap();
        nt.xuat();
        ngt.xuat();
        System.out.println("tổng doanh thu "+(nt.getDoanhthu()+ngt.getDoanhthu()));
    }
}
