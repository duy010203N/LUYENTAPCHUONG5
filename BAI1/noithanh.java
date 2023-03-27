
package BAI1;
public class noithanh extends chuyenxe {
    int sotuyen;
    float sokmdidc;
    float doanhthu;
    public void noithanh(){
    }
    public void noithanh(int sotuyen,float sokmdidc,float doanhthu){
        this.sotuyen=sotuyen;
        this.sokmdidc=sokmdidc;
        this.doanhthu=doanhthu;
    }
    public int getSotuyen(){
        return sotuyen;
    }
    public void setSotuyen(int sotuyen){
        this.sotuyen=sotuyen;
    }
    public float getSokmdidc(){
        return sokmdidc;
    }
    public void setSokmdidc(float sokmdidc){
        this.sokmdidc=sokmdidc;
    }
    @Override
    public float getDoanhthu(){
        return 3000;
    }
    @Override
    public void setDoanhthu(float doanhthu){
        this.doanhthu=doanhthu;
    }
    @Override
    public void nhap()
    {
        System.out.println("nhập mã số chuyến");
        msc=sc.nextLine();
        System.out.println("nhập tên tài xế");
        hotentaixe=sc.nextLine();
        System.out.println("nhập số xe");
        soxe=sc.nextLine();
        System.out.println("nhập số tuyến");
        sotuyen=sc.nextInt();
        System.out.println("nhập số km đi được");
        sokmdidc=sc.nextInt();
    }
    @Override
    public void xuat(){
        System.out.println("Mã số chuyến:"+getMsc()+"-tên tài xế:"+getHotentaixe()+"-số xe:"+getSoxe()+"số tuyến"+getSotuyen()+"số km đi được"+getSokmdidc()+"Doanh thu:"+getDoanhthu());
    }
    
}
