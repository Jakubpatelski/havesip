public class Soda extends Beverage {

    private String name;;
    private int cssLeft;

    public Soda(String color,String name, int cssLeft){
        super(color);
        this.name = name;
        this.cssLeft = cssLeft;
    }


    @Override
    public String toString() {
        return "Soda{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", cssLeft=" + cssLeft +
                '}';
    }



    public void drinkAsip(int css){
        if(cssLeft <= css){
            System.out.println("your sip is too big you cannot drink more than left in the bottle. " + getCssLeft() + " ml left");
        } else {
            cssLeft-=css;
            System.out.println("You  sipped "+ css + " ml, " + getCssLeft() + " ml left");
        }
    }

    public String getName() {
        return name;
    }

    public int getCssLeft() {
        return cssLeft;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCssLeft(int cssLeft) {
        this.cssLeft = cssLeft;
    }
}
