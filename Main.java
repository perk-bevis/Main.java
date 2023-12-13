public class main {
  public static void main(String[] args){
    System.out.println("hello");
  }
}
🔴//khai báo biến
public class main {
  public static void main(String[] args){
    String thongBao = "Xin chao";
    String hoVaTen = "Le Nhat Tung";
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
