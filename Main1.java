public class Main1 {
  public static void main(String[] args) {
    final double PI = 3.14;  //final 型　定数名 = 初期値;  ＊一般的に定数名にはすべて大文字を用いる
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println( pie*pie*pi );
    System.out.println("パイの半径を倍にします");
    pie = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println( pie*pie*pi );
  }
}