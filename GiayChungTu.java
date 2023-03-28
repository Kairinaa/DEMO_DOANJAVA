import java.util.Scanner;

public class GiayChungTu {
    private String HoTenNguoiGiaoHang;
    private int ngay, thang, nam, DonGia;
    private String DiaChiKho, SanPham, MaSoSP;

    public GiayChungTu() {}

    public GiayChungTu(String hoTenNguoiGiaoHang, int ngay, int thang, int nam, int donGia, String diaChiKho, String sanPham, String maSoSP) {
        HoTenNguoiGiaoHang = hoTenNguoiGiaoHang;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        DonGia = donGia;
        DiaChiKho = diaChiKho;
        SanPham = sanPham;
        MaSoSP = maSoSP;
    }

    public String getHoTenNguoiGiaoHang() {
        return HoTenNguoiGiaoHang;
    }

    public void setHoTenNguoiGiaoHang(String hoTenNguoiGiaoHang) {
        HoTenNguoiGiaoHang = hoTenNguoiGiaoHang;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }

    public String getDiaChiKho() {
        return DiaChiKho;
    }

    public void setDiaChiKho(String diaChiKho) {
        DiaChiKho = diaChiKho;
    }

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String sanPham) {
        SanPham = sanPham;
    }

    public String getMaSoSP() {
        return MaSoSP;
    }

    public void setMaSoSP(String maSoSP) {
        MaSoSP = maSoSP;
    }

    public void NhapThongTin() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("----Vui long dien thong tin giay to---");
        System.out.println("Nhap Ho ten nguoi giao hang: "); HoTenNguoiGiaoHang = sc1.nextLine();
        System.out.println("Nhap San pham: "); SanPham = sc1.nextLine();
        System.out.println("Nhap Ma so san pham: "); MaSoSP = sc1.nextLine();
        System.out.println("Nhap ngay: "); ngay = sc1.nextInt();
        System.out.println("Nhap thang: "); thang = sc1.nextInt();
        System.out.println("Nhap nam: "); nam = sc1.nextInt();
        System.out.println("Nhap don gia: "); DonGia = sc1.nextInt();
        System.out.println("Nhap dia chi kho: "); DiaChiKho = sc1.nextLine();
    }

    public void XuatThongTin() {
        System.out.println("Ho ten: " +HoTenNguoiGiaoHang);
        System.out.println("San pham: " + SanPham + "|" + "Ma SP: " + MaSoSP);
        System.out.println("Ngay" + ngay + "/" + "Thang" + thang + "/" + "Nam" + nam);
        System.out.println("Don gia: "+ DonGia);
        System.out.println("Dia chi kho: " + DiaChiKho);
        System.out.println("");
        System.out.println("-------Ket_Thuc-------");

    }

}
