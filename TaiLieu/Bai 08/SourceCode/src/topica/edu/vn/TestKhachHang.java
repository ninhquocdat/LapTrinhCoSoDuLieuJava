package topica.edu.vn;

public class TestKhachHang {

	public static void main(String[] args) {
		KhachHang teo=new KhachHang();
		teo.setMa("NV1");
		//teo.ma="NV1";//KO ĐƯỢC
		teo.setTen("Trần Văn tèo");
		teo.setTuoi(30);
		teo.setDiaChi("Cà mau");
		System.out.println(teo);
		
		System.out.println("Tui chỉ muốn lấy địa chỉ = "+teo.getDiaChi());
		
		KhachHang ty=new KhachHang();
		ty.setTen("Hồ thị Tí");
		
		System.out.println("Tên của tèo = "+teo.getTen());
		System.out.println("Tên của tý = "+ty.getTen());
		
		teo=ty;
		teo.setTen("Hồ văn đồ");
		System.out.println("Tên của tý = "+ty.getTen());
		
		System.out.println("x="+teo.layThongTinX());
		KhachHang an=new KhachHang();
		an.doiThongTinCuaX(100);
		System.out.println("x="+teo.layThongTinX());
		
		KhachHang binh=new KhachHang();
		System.out.println("x cua binh = "+binh.layThongTinX());
		
	}

}
