package baohiemnhantho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu extends BaoHiem {
    BaoHiem goiBaoHiem = null;
    static Scanner sc = new Scanner(System.in);
    static List<KhachHang> khachHangs = new ArrayList<>();

    public void menu() {

        int choice;
        while (true) {
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Xuất danh sách khách hàng");
            System.out.println("3. Tìm kiếm khách hàng");
            System.out.println("4. Thông tin gói bảo hiểm cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());
            KhachHang khachHang=new KhachHang();
            switch (choice) {
                case 1:
                    khachHang.input();
                    if(!isCCCDTrung(khachHang.getSoChungMinhThu()))
                    {
                        inputBH();
                        khachHang.setBaoHiem(goiBaoHiem);
                        khachHangs.add(khachHang);
                    }else{
                        System.out.println("=======Số chừng minh thư đã tồn tại trong hệ thông=======");
                        continue;
                    }
                    break;
                case 2:
                    outputKhach();
                    break;
                case 3:
                    findKhachHang();
                    break;
                case 4:
                    timBaoHiemMucPhiLonNhat();
            }
        }
    }

    private void inputBH() {
        int choice;
        System.out.println("=======Thong Tin Bao Hiem=======");
        System.out.println("1. Bao hiem trong truong hop tu vong");
        System.out.println("2. Bao hiem sinh ky");
        System.out.println("3. Bao hiem theo thoi han hop dong");
        System.out.print("moi ban nhap lua chon: ");
        choice = Integer.parseInt(sc.nextLine());
        if (choice < 1 || choice > 7) {
            System.out.println("lua chon k hop le");
        }

        switch (choice) {
            case 1:
                goiBaoHiem = XuLy.inputBaoHiemTV();
                break;
            case 2:
                goiBaoHiem = XuLy.inputBaoHiemSinhKy();
                break;
            case 3:
                goiBaoHiem = XuLy.inputBaohiemHopDong();
                break;
            default:
                System.out.println("Lua chon khong hop le! Nhap lai.");
        }

    }
    private void outputKhach() {
        System.out.println("\nDanh sách khách hàng:");
        for (KhachHang kh : khachHangs) {
            kh.output();
            System.out.println("----------------------------");
        }
    }


    private static boolean isCCCDTrung(String soChungMinhThu) {
        for (KhachHang kh : khachHangs) {
            if (kh.getSoChungMinhThu().equals(soChungMinhThu)) {
                return true;
            }
        }
        return false;
    }

    private static void findKhachHang() {
        System.out.println("Nhập So chung minh thu: ");
        String soChungMinhThu = sc.nextLine();
        for (KhachHang kh : khachHangs) {
            if(isCCCDTrung(soChungMinhThu))
            {
                kh.output();
            }
        }
    }

    private static void timBaoHiemMucPhiLonNhat() {
        double mucPhiMax =0;

        for (KhachHang kh : khachHangs) {
            if (kh.getBaoHiem().getMucPhi()>mucPhiMax) {
                mucPhiMax=kh.getBaoHiem().getMucPhi();
            }
        }
        for (KhachHang kh : khachHangs) {
            if (kh.getBaoHiem().getMucPhi()==mucPhiMax) {
                kh.output();
            }
        }
    }


}
