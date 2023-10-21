package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide > secondSide && firstSide > thirdSide) {
            System.out.println((secondSide + thirdSide) > firstSide ? "this is a valid triangle" : "it's not a triangle");
        } else if (secondSide > firstSide && secondSide > thirdSide) {
            System.out.println((firstSide + thirdSide) > secondSide ? "this is a valid triangle" : "it's not a triangle");
        } else {
            System.out.println((secondSide + firstSide) > thirdSide ? "this is a valid triangle" : "it's not a triangle");
        }
    }
}
