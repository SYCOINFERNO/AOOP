package LSP;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Bird ostrich = new Ostrich();

        sparrow.fly();

        try {
            ostrich.fly();
        } 
        catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
