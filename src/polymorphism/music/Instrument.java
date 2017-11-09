//: polymorphism/music/Instrument.java
package polymorphism.music;

import static net.mindview.util.Print.*;

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
    public void play2(int n){
        print("Instrument.play()"+n);
    }
}
///:~
