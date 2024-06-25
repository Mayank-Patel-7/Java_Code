class Pen{
    String color;
    String type;

    public void printcol(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
}
}
public class javaoops1{
    public static void main(String[] args){
    Pen pen1 = new Pen();
    pen1.color = "Blue";
    pen1.type = "gel";

    pen1.printcol();
    pen1.printtype();
    }
}