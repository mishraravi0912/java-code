public class android {

    /**
     * @param args
     * @param name
     */
    public static void main(String[] args, String name) {
        Smartphone phone1 = new Smartphone(6, "Blue", "Realme");
        Smartphone phone2 = new Smartphone(4, "Grey", "Xiomi");
        Smartphone phone3 = new Smartphone(8, "Black", "Oppo");
        Smartphone phone4 = new Smartphone(6, "Red", "Vivo");

        Smartphone[] phonearray = new Smartphone[4];
        phonearray[0] = phone1;
        phonearray[1] = phone2;
        phonearray[2] = phone3;
        phonearray[3] = phone4;

        for (Smartphone phone : phonearray) {
            System.out.printf("Ram: " + phone.ram + ", Color: " + phone.color, "this.name: " + name);
        }
    }

}