import java.util.Scanner;

public class MayTinh {
    private int Gia, NamSX;
    private String HangSX, QuocGia, HangCPU;

    public MayTinh () {}

    public MayTinh(int gia, int namSX, String hangSX, String quocGia, String hangCPU) {
        Gia = gia;
        NamSX = namSX;
        HangSX = hangSX;
        QuocGia = quocGia;
        HangCPU = hangCPU;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getNamSX() {
        return NamSX;
    }

    public void setNamSX(int namSX) {
        NamSX = namSX;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String hangSX) {
        HangSX = hangSX;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    public String getHangCPU() {
        return HangCPU;
    }

    public void setHangCPU(String hangCPU) {
        HangCPU = hangCPU;
    }

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Xin moi nhap!!! ----");
        System.out.println("Nhap Hang san xuat: "); HangSX = sc.nextLine();
        System.out.println("Nhap Quoc gia: "); QuocGia = sc.nextLine();
        System.out.println("Nhap Hang CPU: "); HangCPU = sc.nextLine();
        System.out.println("Nhap Nam san xuat: "); NamSX = sc.nextInt();
        System.out.println("Nhap Gia tien: "); Gia = sc.nextInt();
    }

    public void XuatThongTin() {
        System.out.println("Ten Hang san xuat: " + HangSX);
        System.out.println("Ten Quoc gia: " + QuocGia);
        System.out.println("Hang CPU: " + HangCPU);
        System.out.println("Nam san xuat: " + NamSX);
        System.out.println("Gia tien: " + Gia);
    }
}
