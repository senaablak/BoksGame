public class Main {
    public static void main(String[] args) {
        Fighter F1 = new Fighter("A", 10, 100, 20, 80);
        Fighter F2 = new Fighter("B", 20, 85, 20 , 50);
        Match match = new Match(F1, F2, 85, 100);
        match.run();
    }
}