public class Main {
    public static void main (String args[]){
        calculator calc = new calculator();
        double result = calc.calcFeetAndInchesToCentimeters(3, 5);
        System.out.println(result);
        double result2 = calc.calcFeetAndInchesToCentimeters(13);
        System.out.println(result2);

    }

}