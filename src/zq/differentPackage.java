package zq;


import reusing.Villa;

import static net.mindview.util.Print.print;

public class differentPackage extends Villa {
   // private Villa v = new Villa("xiaogou1");

//    public Villa getV() {
//        return v;
//    }
//
//    public void setV(Villa v) {
//        this.v = v;
//    }

    public static void main(String[] args) {
        differentPackage xg = new differentPackage();
        print(xg);
        xg.set("dagou");
        xg.num=1;
        print(xg);
        //xg.getV().set("dagou");//说明同一个包内的客户端代码可以访问受保护的域和方法
        // xg.getV().num=1;
        //xg.getV().set("dagou");
       // xg.getV().num=1;

    }
}
