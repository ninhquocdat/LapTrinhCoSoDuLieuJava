package topica.edu.vn;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien teo=new NhanVienChinhThuc();
		teo.setTen("Nguyễn văn teo");
		System.out.println(teo);
		
		NhanVienChinhThuc ty=new NhanVienChinhThuc();
		ty.setTen("Trần thị tí");
		System.out.println(ty);
		
		teo=new NhanVienThoiVu();
		teo.setTen("Nguyễn văn tèo");
		System.out.println(teo);
	}

}
