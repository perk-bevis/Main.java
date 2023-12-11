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
