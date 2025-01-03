package kethua.dienthoai;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    int luaChon;
    public void menu() {

        while(true) {
            do{
                System.out.println("===== Chuong trinh quan ly dien thoai =====");
                System.out.println("1. Xem danh sach dien thoai. ");
                System.out.println("2. Them moi. ");
                System.out.println("3. Cap nhap. ");
                System.out.println("4. Xoa. ");
                System.out.println("5. Sap xep theo gia. ");
                System.out.println("6. Tim kiem. ");
                System.out.println("7. Tinh tong tien. ");
                System.out.println("8. Giam gia cho dien thoai cu. ");
                System.out.println("9. Thoat. ");
                System.out.print("Nhap lua chon: ");
                luaChon = Integer.parseInt(input.nextLine());
                switch (luaChon) {
                    case 1:
                        showList();
                        break;
                    case 2:
                        addPhone();
                        break;
                    case 3:
                        updatePhone();
                        break;
                    case 4:
                        deletePhone();
                        break;
                    case 5:
                        sortPrice();
                        break;
                    case 6:
                        findPhone();
                        break;
                    case 7:
                        sumPrice();
                        break;
                    case 8:
                        discountPhoneOld();
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le! Nhap lai.");
                }
            }while(luaChon<1 || luaChon>9);
        }
    }

    private void showList()
    {
        while (true)
        {
            System.out.println("===== 1 =====");
            System.out.println("1. Xem tat ca.");
            System.out.println("2. Xem dien thoai cu.");
            System.out.println("3. Xem dien thoai moi.");
            System.out.println("4. Tro ve.");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon)
            {
                case 1:
                    XuLy.showAllPhone();
                    break;
                case 2:
                    XuLy.showPhoneOld();
                    break;
                case 3:
                    XuLy.showPhoneNew();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }
    private void addPhone()
    {
        while(true)
        {
            System.out.println("===== 2 =====");
            System.out.println("1. Them moi dien thoai moi.");
            System.out.println("2. Them moi dien thoai cu.");
            System.out.println("3. Tro ve.");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon)
            {
                case 1:
                    XuLy.addPhoneNew();
                    break;
                case 2:
                    XuLy.addPhoneOld();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }
    private void updatePhone()
    {
        XuLy.updatePhone();
    }
    private void deletePhone()
    {
        XuLy.deletePhone();
    }
    private void sortPrice()
    {
        while (true)
        {
            System.out.println("===== 5 =====");
            System.out.println("1. Tang dan.");
            System.out.println("2. Giam dan.");
            System.out.println("3. Tro ve");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon)
            {
                case 1:
                    XuLy.sortPrice();
                    break;
                case 2:
                    XuLy.redudePrice();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }
    private void findPhone()
    {
        while (true)
        {
            do {
                System.out.println("===== 6 =====");
                System.out.println("1. Tim kiem tat ca dien thoai.");
                System.out.println("2. Tim kiem dien thoai cu.");
                System.out.println("3. Tim kiem dien thoai moi.");
                System.out.println("4. Tro ve");
                System.out.print("Nhap lua chon: ");
                luaChon = Integer.parseInt(input.nextLine());
                switch (luaChon)
                {
                    case 1:
                        findAllPhone();
                        break;
                    case 2:
                        findPhoneOld();
                        break;
                    case 3:
                        findPhoneNew();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le! Nhap lai.");
                }
            }while (luaChon<1 || luaChon>4);
        }
    }

    private void findAllPhone()
    {
        while (true)
        {

            System.out.println("1. Tim kiem theo gia.");
            System.out.println("2. Tim kiem theo ten.");
            System.out.println("3. Tim kiem theo hang.");
            System.out.println("4. Tro ve");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon)
            {
                case 1:
                    XuLy.findAllPhone();
                    break;
                case 2:
                    XuLy.findAllPhoneName();
                    break;
                case 3:
                    XuLy.findAllPhoneBrand();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }


    private void findPhoneNew()
    {
        while (true)
        {

            System.out.println("1. Tim kiem theo gia.");
            System.out.println("2. Tim kiem theo ten.");
            System.out.println("3. Tim kiem theo hang.");
            System.out.println("4. Tro ve");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon)
            {
                case 1:
                    XuLy.findPhoneNew();
                    break;
                case 2:
                    XuLy.findPhoneNewName();
                    break;
                case 3:
                    XuLy.findPhoneNewBrand();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }


    private void findPhoneOld()
    {
        while (true)
        {

            System.out.println("1. Tim kiem theo gia.");
            System.out.println("2. Tim kiem theo ten.");
            System.out.println("3. Tim kiem theo hang.");
            System.out.println("4. Tro ve");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon)
            {
                case 1:
                    XuLy.findPhoneOld();
                    break;
                case 2:
                    XuLy.findPhoneOldName();
                    break;
                case 3:
                    XuLy.findPhoneOldBrand();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }




    private void sumPrice()
    {
        System.out.println("Tong tien: " +XuLy.sumPrice()+"$");
    }
    private void discountPhoneOld()
    {

    }

}
