import java.util.Scanner;

public class MayTinhXachTay extends MayTinh {
    private double TrongLuong;

    @Override
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Trong luong: "); TrongLuong = sc.nextDouble();
        super.NhapThongTin();

    }

    @Override
    public void XuatThongTin() {
        System.out.println("Trong luong: " + "kg" + TrongLuong); //Dau cham plz
        super.XuatThongTin();
    }
}
