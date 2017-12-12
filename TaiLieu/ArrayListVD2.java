/*Tạo 1 mảng các đối tượng, mỗi đối tượng gồm 2 thuộc tính tên và tuổi.
Gán một vài giá trị rồi in ra màn hình! Các phương thức thao tác tương tự như ở ví dụ 1,
chỉ có sự khác biệt là cách khai báo mảng, các bạn chú ý nhé!*/

package javaandroidvn;
 import java.util.ArrayList;
class HocSinh{
    public String ten;
    public int tuoi;
}
public class JavaAndroidVn {

    public static void main(String[] args) {
        ArrayList<HocSinh> listHS = new ArrayList(); // Khai báo 1 đối tượng ArrayList, các phần tử tạo ra từ lớp HocSinh

        HocSinh a = new HocSinh();
        a.ten = "Vũ Văn A";
        a.tuoi = 19;
        listHS.add(a); // Thêm đối tượng và listHS

        HocSinh b = new HocSinh();
        b.ten = "Vũ Văn B";
        b.tuoi = 20;
        listHS.add(b);

        HocSinh c = new HocSinh();
        c.ten = "Vũ Văn C";
        c.tuoi = 22;
        listHS.add(c);

        System.out.println("Thông tin các học sinh đã thêm vào ArrayList là: ");
        for(int i=0; i<listHS.size(); i++){
            System.out.println("Tên: "+listHS.get(i).ten+" Tuổi: "+listHS.get(i).tuoi);
        }

    }
}