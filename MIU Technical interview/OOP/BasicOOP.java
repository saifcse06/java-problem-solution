class BasicOOP {

}

class SubCalculation {
    int z;

    void addtion(int x, int y) {
        z = x + y;
        System.out.println("X and Y value sum result: " + z);
    }

    void subtraction(int x, int y) {
        z = x - y;
        System.out.println("X and Y value sub result: " + z);
    }
}

class MainCalculation extends SubCalculation {

    void multipction(int x, int y) {
        z = x * y;
        System.out.println("X and Y value sub result: " + z);
    }

    public static void main(String[] args) {
        int x = 5, y = 5;
        MainCalculation demo = new MainCalculation();
        demo.addtion(x, y);
        demo.multipction(x, y);
        demo.subtraction(x, y);
    }
}