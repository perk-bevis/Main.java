public class main {
  public static void main(String[] args){
    System.out.println("hello");
  }
}
🔴//khai báo biến
public class main {
  public static void main(String[] args){
    String thongBao = "Xin chao";
    String hoVaTen = "Le Quy Doan";
    String tenSach;
    tenSach = "Lap Trinh Java";
    System.out.println("thong bao: " +thongBao);
    System.out.println("ho & ten: " +hoVaTen);
    System.out.println("ten sach: " +tenSach);
  }
}
🔴//hằng số trong java final
public class main {
  public static void main(String[] args){
    final int x = 10;
    System.out.println(x);
  }
}
//nhập dữ liệu từ bàn phím
nextBoolean() đọc một giá trị boolean từ bàn phím 
nextByte() đọc một giá trị byte từ bàn phím
nextDouble() đọc một giá trị double từ bàn phím
nextFloat() đọc một giá trị float từ bàn phím
nextInt() đọc một giá trị int từ bàn phím
nextLine() đọc một giá trị String từ bàn phím
nextLong() đọc một giá trị long từ bàn phím
nextShort() đọc một giá trị short từ bàn phím
__________
import java.util.Scanner;

public class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("nhap vao ho va ten: ");
    String hoVaTen = sc.nextLine();
    
    System.out.println("nhap ma sinh vien: ");
    long maSinhVien = sc.nextLong();
    
    System.out.println("nhap vao diem thi: ");
    float diemThi = sc.nextFloat();
    
    System.out.println("ho va ten: " + hoVaTen);
    System.out.println("ma sinh vien: "+ maSinhVien);
    System.out.println("diem thi: " +diemThi);
  }
}
//chuyển đổi kiểu dữ liệu trong java
public class main {
  public static void main(String[] args){
    int a = 100;
    int b = 2;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    // ép kiểu ngầm định
    float c = a;
    float d = b;
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    // ép kiểu tường minh
    float e = 9.5f;
    float f = 3.5f;
    System.out.println("e = " + e);
    System.out.println("f = " + f);
    
    int g = (int)e;
    int h = (int)f;
    System.out.println("g = " + g);
    System.out.println("h = " + h);
    
    // ép kiểu giữa biến nguyên thủy và đối tượng
    int x = new Integer(32);
    System.out.println("x = " + x);
  }
}
// phép toán trong java
import java.util.Scanner;
public class main {
  public static void main(String[] args){
    //khai báo biến
    int a,b;
    // nhập dữ liệu
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao a = ");
    // nhập dữ liệu từ bàn phím
    a = sc.nextInt();
    System.out.println("nhap vao b = ");
    b = sc.nextInt();
    int tong = a+b;
    System.out.println(a +" + "+b+" = "+ tong);
    int hieu = a-b;
    System.out.println(a +" - "+b+" = "+ hieu);
    int tich = a*b;
    System.out.println(a +" * "+b+" = "+ tich);
    float thuong = (float)a/b;
    System.out.println(a +" / "+b+" = "+ thuong);
    int soDu = a%b;
    System.out.println(a +" % "+b+" = "+ soDu);
  }
}
//toán tử trong java
public class main {
  public static void main(String[] args) {
    int a = 5;
    boolean b = false;
    System.out.println(" -a => giá tri: "+ (-a));
    System.out.println(" +a => giá tri: "+ (+a));
    System.out.println(" !b => giá tri: "+ (!b));
    System.out.println("-------");
    //++a giá trị tăng lên trước khi dòng lệnh đc thực thi 
    System.out.println("a = "+ a);
    System.out.println("++a = "+ ++a);
    // a++ thực hiện dòng lệnh đó thực hiện xong ms tăng giá trị 
    System.out.println("a++ = "+ a++);
    System.out.println("a = "+ a);
    //
    System.out.println("--a = "+ (--a));
    System.out.println("a-- = "+ (a--));
    System.out.println("a = "+ a);
  }
}
❌❌// lớp math và các hàm toán học
import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		
		// Ham tri tuyet doi
		System.out.println("|a|= " + Math.abs(a));
		
		// Ham tim min
		System.out.println("min(a, b) = " + Math.min(a, b));
		
		// Ham tim max
		System.out.println("max(a, b) = " + Math.max(a, b));
	
		// Ham  ceil
		System.out.println("ceil(a) = " + Math.ceil(a));
		
		// Ham  floor
		System.out.println("floor(a) = " + Math.floor(a));
		
		// Ham  can bac hai sqrt
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		
		// Ham tinh a^b
		System.out.println("a^b = " + Math.pow(a, b));
	}
}
________________
__________________&&&_______________________________
🚩🚩🚩🚩// tính chu vi và diện tích hình tròn
import java.util.Scanner;

public class BaiTapHinhTron {
  public static void main(String[] args) {
    double r, dienTich, chuVi;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ban kinh r: ");
    r = sc.nextDouble();
    
    // Tinh chu vi
    chuVi = 2*Math.PI*r;
    System.out.println("Chu vi = "+ chuVi);
    System.out.println("Chu vi = "+ Math.round(chuVi));
    System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
    
    // Tinh dien tich
    dienTich = Math.PI * Math.pow(r,2);
    System.out.println("Dien tich = " + dienTich);
    System.out.println("Dien tich = " + Math.round(dienTich));
    System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
  }
}
_____________________________________
⭕⭕⭕// giải pt bậc 2
import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		// Phuong trinh bac 2: ax^2 + bx + c = 0
		// Các biến cần có: a, b, c, x1, x2, delta
		/*
		 * Nếu a == 0 thì báo lỗi. B1. delta = b^2 - 4ac B2. Kiem tra delta 2.1. delta
		 * <0 => Phương trình vô nghiệm 2.2. delta ==0 => Phương trình có nghiệm kép
		 * x1=x2=-b/2a 2.3. delta>0 => Phuong trình có 2 nghiệm x1 =
		 * (-b-sqrt(delta))/(2a) x2 = (-b+sqrt(delta))/(2a)
		 */
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao a = ");
		a = sc.nextDouble();
		System.out.println("Nhap vao b = ");
		b = sc.nextDouble();
		System.out.println("Nhap vao c = ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");
		} else {
			if (delta < 0) {
				// Tinh huong delta<0
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				// Tinh huong delta==0
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
			} else {
				// Tinh huong delta>0
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có nghiệm");
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			}
		}
	}
}
