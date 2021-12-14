public class Main {
    public static void main(String[] args) {


        Soda s1 = new Soda("Blue", "Cola", 500);

        System.out.println(s1);

        s1.drinkAsip(600);
        s1.drinkAsip(300);
        System.out.println(s1.getCssLeft());

        s1.drinkAsip(100);

        System.out.println(s1);

        //s1.getCssLeft();
        System.out.println(s1.getCssLeft());

    }
}