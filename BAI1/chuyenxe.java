package BAI1;

import java.util.Scanner;

public class chuyenxe {
    String msc;
    String hotentaixe;
    String soxe;
    int sotuyen;
    int sokmdidc;
    float doanhthu;
     Scanner sc = new Scanner(System.in);
    public void chuyexe(){
        
    }
    public void chuyenxe(String msc,String hotentaixe,String soxe,float doanhthu){
        this.msc=msc;
        this.hotentaixe=hotentaixe;
        this.soxe=soxe;
        this.doanhthu=doanhthu;
    }
    public String getMsc(){
        return msc;
    }
    public void setMsc(String msc){
        this.msc=msc;
    }
    public String getHotentaixe(){
        return hotentaixe;
    }
    public void setHotentaixe(String hotentaixe){
       this.hotentaixe=hotentaixe;
    }
    public String getSoxe(){
        return soxe;
    }
    public void setSoxe(String soxe){
        this.soxe=soxe;
    }
    public float getDoanhthu(){
        return doanhthu;
    }
    public void setDoanhthu(float doanhthu){
        this.doanhthu=doanhthu;
    }
    public void nhap()
    {
        System.out.println("nhập mã số chuyến");
        msc=sc.nextLine();
        System.out.println("nhập tên tài xế");
        hotentaixe=sc.nextLine();
        System.out.println("nhập số xe");
        soxe=sc.nextLine();
    }
    public void xuat(){
        System.out.println("Mã số chuyến:"+getMsc()+"-tên tài xế:"+getHotentaixe()+"-số xe:"+getSoxe()+"-Doanh thu:"+getDoanhthu());
    }
}
