class info{
        public void printinfo(String name){
            System.out.println(name);
        }
        public void printinfo(int age){
            System.out.println(age);
        }
        public void printinfo(String name,int age){
            System.out.println(name+" "+age);
        }
}

public class poly {
    public static void main(String[] args){
        info i = new info();
        i.printinfo("Rahul",25);
    }
}

