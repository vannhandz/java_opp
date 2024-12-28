package kethua.dienthoai;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<PhoneNew> phoneNews = new ArrayList<>();
    static ArrayList<PhoneOld> phoneOlds = new ArrayList<>();

    //1
    public static void showAllPhone()
    {
        showPhoneNew();
        showPhoneOld();
    }
    public static void showPhoneNew()
    {
        System.out.println("===== Thong Tin Dien Thoai Moi =====");
        for (int i = 0; i < phoneNews.size(); i++)
        {
            phoneNews.get(i).output();
        }
    }
    public static void showPhoneOld()
    {
        System.out.println("===== Thong Tin Dien Thoai Cu =====");
        for (int i = 0; i < phoneOlds.size(); i++)
        {
            phoneOlds.get(i).output();
        }
    }

    //2
    // them moi dien thoai moi
    public static void addPhoneNew()
    {
        PhoneNew phoneMoi = new PhoneNew();
        phoneMoi.input();
        phoneNews.add(phoneMoi);
    }
    // them moi dien thoa cu
    public static void addPhoneOld()
    {
        PhoneOld phoneCu = new PhoneOld();
        phoneCu.input();
        phoneOlds.add(phoneCu);
    }

    //3
    public static void updatePhone()
    {
        System.out.print("Nhap ID can sua: ");
        String id=sc.nextLine();
        if(id.startsWith("DTM"))
        {
            for (int i = 0; i < phoneNews.size(); i++)
            {
                if(phoneNews.get(i).getId().equalsIgnoreCase(id))
                {
                    phoneNews.get(i).input();
                    break;
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else if (id.startsWith("DTC"))
        {
            for (int i = 0; i < phoneOlds.size(); i++)
            {
                if(phoneOlds.get(i).getId().equalsIgnoreCase(id))
                {
                    phoneOlds.get(i).input();
                    break;
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else{
            System.out.println("ID khong hop le!");
        }
    }
    //4
    public static void remotePhone()
    {
        System.out.print("Nhap ID can xoa: ");
        String id=sc.nextLine();
        if(id.startsWith("DTM"))
        {
            for (int i = 0; i < phoneNews.size(); i++)
            {
                if(phoneNews.get(i).getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if("yes".equalsIgnoreCase(sc.nextLine()))
                    {
                        phoneNews.remove(i);
                        System.out.println("Da xoa");
                        break;
                    }
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else if(id.startsWith("DTC"))
        {
            for (int i = 0; i < phoneOlds.size(); i++)
            {
                if(phoneOlds.get(i).getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if("yes".equalsIgnoreCase(sc.nextLine()))
                    {
                        phoneOlds.remove(i);
                        System.out.println("Da xoa");
                        break;
                    }
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else{
            System.out.println("ID khong hop le!");
        }
    }




}
