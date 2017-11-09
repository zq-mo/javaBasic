package reusing;//: reusing/Orc.java
// The protected keyword.
import static net.mindview.util.Print.*;

 class Villain {
  private String name;
  protected int num=0;
  protected void set(String nm) { name = nm; }
  public Villain(String name) { this.name = name; }
  public String toString() {
    return "I'm a Villain and my name is " + name+" "+num;
  }
}	

//public class Orc extends Villain {
//  private int orcNumber;
//  public Orc(String name, int orcNumber) {
//    super(name);
//    this.orcNumber = orcNumber;
//  }
//  public void change(String name, int orcNumber) {
//    set(name); // Available because it's protected
//    this.orcNumber = orcNumber;
//  }
//  public String toString() {
//    return "Orc " + orcNumber + ": " + super.toString();
//  }
//  public static void main(String[] args) {
//    Orc orc = new Orc("Limburger", 12);
//    print(orc);
//    orc.change("Bob", 19);
//    print(orc);
//  }
//}

/* Output:
Orc 12: I'm a Villain and my name is Limburger
Orc 19: I'm a Villain and my name is Bob
*///:~

public class Orc {

  private Villain v = new Villain("xiaogou");

  public Villain getV() {
    return v;
  }

  public void setV(Villain v) {
    this.v = v;
  }

  public static void main(String[] args){
    Orc xg = new Orc();
    print(xg.getV());
    xg.getV().set("dagou");//说明同一个包内的客户端代码可以访问受保护的域和方法
    xg.getV().num=1;
    print(xg.getV());
  }

}
