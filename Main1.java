package FinalProject;

public class Main {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[3];
        cakes[0] = new Cake ("Vanilla");
        cakes[1] = new Cake ("German Chocolate");
        try {
            cakes [2] = new BirthdayCake ("Strawberry", 16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        for(Cake cake: cakes) {
            System.out.println(cake.toString());
        }

        try{
            Cake cakeWithNoFlavor = new Cake();
        } catch (NoFlavorException e) {
            System.out.println(e.getMessage());
        }
    }
}
