public class calculator {
    //double santim;
    double onefeet = 30.48;
    double oneinch = 2.54;
    public double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0) return -1;
        if ((inches < 0) || (inches > 12)) return -1;

        double santim = feet * onefeet + inches * oneinch;
        return santim;
        //System.out.println(santim);
        }

    public double calcFeetAndInchesToCentimeters(int inches) {
        double feet = 0;
        if (inches < 0)  return -1;

        double santim = inches * 2.54;

        return santim;
    }

}
