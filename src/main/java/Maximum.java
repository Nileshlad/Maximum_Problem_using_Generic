public class Maximum
{
    //TO METHOD INTEGER VALUE
    public static Integer findMaximumInteger(Integer oneValue, Integer twoValue, Integer threeValue) {
        Integer maximumValue = oneValue;
        if (oneValue.compareTo(maximumValue) > 0)
            maximumValue = twoValue;
        if (threeValue.compareTo(maximumValue) > 0)
            maximumValue = threeValue;
        return maximumValue;
    }

    //TO METHOD FLOAT VALUE
    public static Float findMaximumFloat(Float oneValue, Float twoValue, Float threeValue) {
        Float maximumValue = oneValue;
        if (oneValue.compareTo(maximumValue) > 0)
            maximumValue = twoValue;
        if (threeValue.compareTo(maximumValue) > 0)
            maximumValue = threeValue;
        return maximumValue;
    }

    //TO MAIN METHOD AND CREATE OBJECT
    public static void main(String[] args) {
        System.out.println("WELCOME TEST MAXIMUM AND GENERIC");
        Maximum maximum = new Maximum();
        }

}
