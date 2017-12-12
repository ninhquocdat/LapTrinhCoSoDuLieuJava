/*Nhập 1 danh sách học sinh từ bàn phím, danh sách có n phần tử . Mỗi phần tử có 2 thuộc tính là tên và tuổi.
In toàn bộ danh sách ra màn hình! Các thuộc tính để private*/

package javaandroidvn;
 import java.util.ArrayList;import java.util.Scanner;

class HocSinh {

    private String ten;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
public class JavaAndroidVn {

    public static void main(String[] args) {
        ArrayList<HocSinh> listHS = new ArrayList(); // Khai báo 1 đối tượng ArrayList, các phần tử tạo ra từ lớp HocSinh

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số học sinh: ");
        int n = input.nextInt();


        for (int i = 0; i < n; i++) {
            HocSinh x = new HocSinh(); //Tạo đối tượng x để lưu tạm thời dữ liệu
            System.out.println("Học sinh thứ " + i + ": ");
            input.nextLine(); //Dòng này tránh bị trượt dòng!

            System.out.print("Tên: ");
            String tenX = input.nextLine();

            System.out.print("Tuổi: ");
            int tuoiX = input.nextInt();

            x.setTen(tenX);
            x.setTuoi(tuoiX);
            listHS.add(x);  // Thêm đối dữ liệu về x vào trong ArrayList
        }

        System.out.println("Thông tin danh sách vừa nhập vào là: ");
        for (int i = 0; i < listHS.size(); i++) {
            System.out.print("Học sinh thứ " + i);
            System.out.print(" - Tên " + listHS.get(i).getTen() + " Tuổi: " + listHS.get(i).getTuoi()+"\n");
        }
    }
}