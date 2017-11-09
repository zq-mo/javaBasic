//: polymorphism/music/Music.java
// Inheritance & upcasting.
package polymorphism.music;

public class Music {
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void dosoming(Instrument i){
        i.play2(2);//若导出类没有重写基类方法，则调用基类方法，重写的条件是返回值和参数列表完全相同。如果仅仅是函数名称相同，
                        //参数列表不同或者返回值不同，编译器判定为函数重载，不是重写。
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        dosoming(flute);
        tune(flute); // Upcasting

    }
} /* Output:
Wind.play() MIDDLE_C
*///:~
