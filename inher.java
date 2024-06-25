class shape {  //parent class
    String color;
    public void area(){
        System.out.println("Shapes");
    }
}
class triangle extends shape {  //child class 
    public void area(){         //single level inheritance
        //System.out.pritnln("1/2 * Base * Height");
    }
}
class Eqtriangle extends triangle {    //multi level inheritance
    public void area(){
        System.out.println("1/2 * side * side * sqrt(3) / 4");
    }
}
class circle extends shape { //hierarchial inheritance
    public void area(){
        System.out.println("pi * radius * radius");
    }
}
//hybrid inheritance

public class inher {
    public static void main(String[] args){
        triangle t1 = new triangle();
        t1.color="red";
        t1.area();
        System.out.println(t1.color);
    }
}


