public class Car {
    // fileds or data 
    String color;
    String modle;
    int year;

    //constructor
    public Car (String color,String modle,int year){
        this.color =  color;
        this.modle =  modle;
        this.year =  year;
    }
    //methods or functions
    public void displayinfo(){
        System.out.println("color : "+color +   "     modle : "+ modle    +"    year : "+ year );
    }

}

