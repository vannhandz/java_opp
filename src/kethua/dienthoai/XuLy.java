package kethua.dienthoai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class XuLy {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Phone> phones = new ArrayList<>();

    private static ArrayList<PhoneOld> getPhoneOld() {
        ArrayList<PhoneOld> phoneOlds = new ArrayList<>();
        for (Phone phone : phones) {
            if(phone instanceof PhoneOld) {
                phoneOlds.add((PhoneOld) phone);
            }
        }
        return phoneOlds;
    }

    private static ArrayList<PhoneNew> getPhoneNew() {
        ArrayList<PhoneNew> phoneNews = new ArrayList<>();
        for (Phone phone : phones) {
            if(phone instanceof PhoneNew) {
                phoneNews.add((PhoneNew) phone);
            }
        }
        return phoneNews;
    }
    //1
    static void showAllPhone() {
        for (Phone phone : phones) {
            phone.output();
        }
    }
    static void showPhoneNew() {
        System.out.println("===== Thong Tin Dien Thoai Moi =====");
        for (Phone value : phones) {
            if (value instanceof PhoneNew) {
                value.output();
            }
        }
    }

    static void showPhoneOld() {
        System.out.println("===== Thong Tin Dien Thoai Cu =====");
        for (Phone value : phones) {
            if (value instanceof PhoneOld) {
                value.output();
            }
        }
    }

    //2
    // them moi dien thoai moi
    static void addPhoneNew() {
        Phone phoneMoi = new PhoneNew();
        phoneMoi.input();
        phones.add(phoneMoi);
    }

    // them moi dien thoa cu
    static void addPhoneOld() {
        Phone phoneCu = new PhoneOld();
        phoneCu.input();
        phones.add(phoneCu);
    }

    //3
    static void updatePhone() {
        System.out.print("Nhap ID can sua: ");
        String id = sc.nextLine();
        if (id.startsWith("DTM")) {
            for (Phone value : phones) {
                if (value.getId().equals(id)) {
                    value.input();
                    break;
                }
            }
        } else if (id.startsWith("DTC")) {
            for (Phone value : phones) {
                if (value.getId().equals(id)) {
                    value.input();
                    break;
                }
            }
        } else {
            System.out.println("ID khong hop le!");
        }
    }

    //4
    static void deletePhone() {
        System.out.print("Nhap ID can xoa: ");
        String id = sc.nextLine();
        if (id.startsWith("DTM")) {
            for (Phone value : phones) {
                if (value.getId().equalsIgnoreCase(id)) {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        phones.remove(value);
                        System.out.println("Da xoa");
                        break;
                    }
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else if (id.startsWith("DTC")) {
            for (Phone value : phones) {
                if (value.getId().equalsIgnoreCase(id)) {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        phones.remove(value);
                        System.out.println("Da xoa");
                        break;
                    }
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else {
            System.out.println("ID khong hop le!");
        }
    }
    //5 tang dan
    static void sortPrice() {
        for (int i = 0; i < phones.size(); i++) {
            Collections.sort(phones);
        }
    }
    static void redudePrice() {
        for (int i = 0; i < phones.size(); i++) {
           phones.sort(Collections.reverseOrder());
        }
    }

    //tìm tất cả phone = giá
    static void findAllPhone() {
        System.out.print("Nhap gia muon tim trong khoang : ");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (Phone value : phones) {
            if(value.getPrice()>=a && value.getPrice()<=b) {
                value.output();
            }
        }
    }
    //tìm tất cả phone = ten
    static void findAllPhoneName()
    {
        System.out.print("nhap ten dien thoai can tim: ");
        String phoneName = sc.nextLine();
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (Phone value : phones) {
            if (value.getTenDt().equalsIgnoreCase(phoneName)) {
                value.output();
            }
        }
    }
    //tìm tất cả phone = giá
    static void findAllPhoneBrand()
    {
        System.out.print("nhap hang dien thoai can tim: ");
        String phoneBrand = sc.nextLine();
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (Phone value : phones) {
            if (value.getHangXs().equalsIgnoreCase(phoneBrand)) {
                value.output();
            }
        }
    }

    //tìm tất cả phone = giá
    static void findPhoneNew() {
        ArrayList<PhoneNew> phoneNews = getPhoneNew();
        System.out.print("Nhap gia muon tim trong khoang : ");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (PhoneNew phoneNew : phoneNews) {
            if (phoneNew.getPrice() >= a && phoneNew.getPrice() <= b) {
                phoneNew.output();
            }
        }
    }
    //tìm tất cả phone = ten
    static void findPhoneNewName()
    {
        ArrayList<PhoneNew> phoneNews = getPhoneNew();
        System.out.print("nhap ten dien thoai can tim: ");
        String phoneName = sc.nextLine();
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (PhoneNew phoneNew : phoneNews) {
            if (phoneNew.getTenDt().equalsIgnoreCase(phoneName)) {
                phoneNew.output();
            }
        }
    }
    //tìm tất cả phone = giá
    static void findPhoneNewBrand()
    {
        ArrayList<PhoneNew> phoneNews = getPhoneNew();
        System.out.print("nhap hang dien thoai can tim: ");
        String phoneBrand = sc.nextLine();
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (PhoneNew phoneNew : phoneNews) {
            if (phoneNew.getHangXs().equalsIgnoreCase(phoneBrand)) {
                phoneNew.output();
            }
        }
    }



    //tìm tất cả phone = giá
    static void findPhoneOld() {
        ArrayList<PhoneOld> phoneOlds = getPhoneOld();
        System.out.print("Nhap gia muon tim trong khoang : ");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (PhoneOld phoneOld : phoneOlds) {
            if (phoneOld.getPrice() >= a && phoneOld.getPrice() <= b) {
                phoneOld.output();
            }
        }
    }
    //tìm tất cả phone = ten
    static void findPhoneOldName()
    {
        ArrayList<PhoneOld> phoneOlds = getPhoneOld();
        System.out.print("nhap ten dien thoai can tim: ");
        String phoneName = sc.nextLine();
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (PhoneOld phoneOld : phoneOlds) {
            if (phoneOld.getTenDt().equalsIgnoreCase(phoneName)) {
                phoneOld.output();
            }
        }
    }
    //tìm tất cả phone = giá
    static void findPhoneOldBrand()
    {
        ArrayList<PhoneOld> phoneOlds = getPhoneOld();
        System.out.print("nhap hang dien thoai can tim: ");
        String phoneBrand = sc.nextLine();
        System.out.println("===== Thong Tin Dien Thoai =====");
        for (PhoneOld phoneOld : phoneOlds) {
            if (phoneOld.getHangXs().equalsIgnoreCase(phoneBrand)) {
                phoneOld.output();
            }
        }
    }

    static long sumPrice() {
        long sum=0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }
        return sum;
    }

}
