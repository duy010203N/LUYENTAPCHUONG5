
package BAI1;

public class ngoaithanh extends chuyenxe {
    String noiden;
    int songaydidc;
    float doanhthu;
    public void ngoaithanh(){
    }
    public void ngoaithanh(String noiden,int songaydidc,float doanhthu){
        this.noiden=noiden;
        this.songaydidc=songaydidc;
        this.doanhthu=doanhthu;
    }
    public String getNoiden(){
        return noiden;
    }
    public void setNoiden(String noiden){
        this.noiden=noiden;
    }
    public int getSongaydidc(){
        return songaydidc;
    }
    public void setSongaydidc(int songaydidc){
        this.songaydidc=songaydidc;
    }
    @Override
    public float getDoanhthu(){
        return (getSongaydidc()*100000);
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
        System.out.println("nhập nơi đến");
        noiden=sc.nextLine();
        System.out.println("nhập số ngày đi");
        songaydidc=sc.nextInt();
    }
    @Override
    public void xuat(){
        System.out.println("Mã số chuyến:"+getMsc()+"-tên tài xế:"+getHotentaixe()+"-số xe:"+getSoxe()+"nơi đến:"+getNoiden()+"số ngày đi được:"+getSongaydidc()+"-Doanh thu:"+getDoanhthu());
    }
    
}


