abstract class animal {
    public void walk() {

    }
}
class horse extends animal {
    public void walk() {
        System.out.println("horse walks on 4 legs");
    }
}

public class abst {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
    }
}