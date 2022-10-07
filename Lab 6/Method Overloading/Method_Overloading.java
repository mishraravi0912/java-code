
public class Method_Overloading {

    public void area(int l, int b) {
        int result = l * b;
        System.out.println(result);
    }

    public void area(double l, double b) {
        double result = l * b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Method_Overloading mo = new Method_Overloading();
        mo.area(7, 3);
        mo.area(5.6, 3.5);
    }

}