public class Practice5_2{
  public static void main(String[] args){
    String title = "こんにゃく";
    String address = "uso@anvks.com";
    String text = "余ってるんです";
    email(title,address,text);
  }

  public static void email(String title,String address,String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文" + text);
  }
}