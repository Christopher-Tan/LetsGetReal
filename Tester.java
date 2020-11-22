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
        RealNumber rn6 = new RealNumber(0);
        System.out.println(rn6.equals(new RealNumber(0.000000000000000000001)));
        //ADD
        System.out.println(rn4.add(rn5).getValue());
        //MULTIPLY
        System.out.println(rn4.multiply(rn5).getValue());
        //DIVIDE
        System.out.println(rn4.divide(rn5).getValue());
        RealNumber rn7 = new RealNumber(10);
        RealNumber rn8 = new RealNumber(2.5);
        System.out.println(rn7.divide(rn8).getValue());
        //SUBTRACT
        System.out.println(rn4.subtract(rn5).getValue());
        System.out.println(rn7.subtract(rn8).getValue());
        //CONSTRUCTOR
        RationalNumber rn9 = new RationalNumber(10,27);
    }
}