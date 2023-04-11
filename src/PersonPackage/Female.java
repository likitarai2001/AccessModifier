package PersonPackage;

public class Female extends Person {
    public static void main(String args[]){
        Female f1 = new Female();
        f1.info();
        f1.show();
//        f1.display(); //error: private method accessible only in same class
    }
}
