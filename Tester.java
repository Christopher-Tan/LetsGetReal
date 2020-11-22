public class Tester {
    public static void main(String[] args) {
        //EQUALS
        RealNumber rn1 = new RealNumber(0.0001);
        RealNumber rn2 = new RealNumber(0.01);
        System.out.println(rn1.equals(rn2));
        RealNumber rn3 = new RealNumber(1);
        RealNumber rn4 = new RealNumber(1.00001);
        RealNumber rn5 = new RealNumber(1.000009);
        System.out.println(rn3.equals(rn4));
        System.out.println(rn3.equals(rn5));
    }
}