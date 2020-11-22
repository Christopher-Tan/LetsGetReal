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
        //GET
        System.out.println(rn9.getValue());
        System.out.println(rn9.getNumerator());
        System.out.println(rn9.getDenominator());
        System.out.println(new RationalNumber(102,0).getNumerator());
        System.out.println(new RationalNumber(102,0).getDenominator());
        //RECIPROCAL
        System.out.println(rn9.reciprocal().getNumerator());
        System.out.println(rn9.reciprocal().getDenominator());
        //EQUALS
        System.out.println(rn9.equals(new RationalNumber(10,27)));
        System.out.println(rn9.equals(new RationalNumber(10,26)));
        //TOSTRING
        System.out.println(rn9);
        System.out.println(new RationalNumber(102,0));
        //REDUCE
        System.out.println(new RationalNumber(10,5));
        System.out.println(new RationalNumber(7544,115));
        //MULTIPLY
        System.out.println(new RationalNumber(7544,115).multiply(new RationalNumber(10,4)));
        //DIVIDE
        System.out.println(new RationalNumber(7544,115).divide(new RationalNumber(328,5)));
    }
}