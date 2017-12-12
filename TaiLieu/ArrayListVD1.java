/*Tạo 1 mảng kiểu ArrayList để xử lý 1 danh sách tên học sinh, đơn giản thôi nhé,
chưa xử lý các đối tượng nhiều thuộc tính. Ví dụ này chỉ là 1 ArrayList giống 1 mảng thông thường.
Với ví dụ này, chúng ta sẽ làm quen với khác phương thức thêm, chèn, sửa, xóa!*/


package javaandroidvn;
 import java.util.ArrayList;

public class JavaAndroidVn {

    public static void main(String[] args) {
        ArrayList listHS = new ArrayList(); // Khai báo 1 đối tượng ArrayList

        String ten1 = "Vu Van T"; //Tạo đối tượng ten1 là tên 1 người
        listHS.add(ten1);        //Thêm đối tượng ten1 vào trong listHS

        String ten2 = "Nguyen Van A";
        listHS.add(ten2);

        String ten3 = "Nguyen Van B";
        listHS.add(ten3);

        String ten4 = "Vu Van C";
        listHS.add(ten4);
        //Như vậy tới đoạn code trên, ArrayList listHS đã có 4 đối tượng được thêm vào!

        // Tương tự như mảng, ArrayList truy xuất theo chỉ số và bắt đầu từ 0
        for (int i = 0; i < listHS.size(); i++) {        // listHS.size() là lấy ra kích cỡ của listHS
            System.out.println(listHS.get(i));          //Lấy ra từng đối tượng theo chỉ số!
        }

        //Chèn thêm 1 đối tượng  tenChen vào vị trí bất kỳ của ArrayList!
        String tenChen = "Nguyen Van Chen";
        listHS.add(2, tenChen);  //Nó sẽ chèn vào vị trí số 2 và đẩy danh sách dài ra sau!
        System.out.println("\nDanh sách sau khi bị chèn thêm: ");
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i));
        }

        //Sửa giá trị của 1 đối tượng, gán nó bằng đối tượng khác theo chỉ số!
        System.out.println("\nDanh sách sau khi bị sửa giá trị 1 đối tượng: ");
        String tenSet = "Hoang Van Set";
        listHS.set(3, tenSet); //Sủa phần tử thứ 3 thành phần tử tenSet
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i));
        }

        //Xóa 1 phần tử trong ArrayList
        System.out.println("\nPhần tử thứ 1 đã bị xóa đi");
        listHS.remove(1);
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i));
        }

        System.out.println("\nXóa toàn bộ các phần tử ArrayList");
        listHS.clear();
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i));
        } //Sẽ không còn gì để in ra nữa!
    }
}