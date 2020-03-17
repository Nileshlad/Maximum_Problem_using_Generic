public class Maximum<U extends Comparable> {
    U oneValue;
    U twoValue;
    U threeValue;

    //TO CONSTRICTOR
    public Maximum(U oneValue, U twoValue, U threeValue) {
        this.oneValue = oneValue;
        this.twoValue = twoValue;
        this.threeValue = threeValue;
    }

    //COMPILABLE METHOD
    public U testMaximum() {
        U maximum = testMaximum(oneValue, twoValue, threeValue);
        printMax(maximum);
        return maximum;
    }

    //TO USE GENERIC
    public static <U extends Comparable> U testMaximum(U oneValue, U twoValue, U threeValue) {
        U maximumValue = oneValue;
        if (twoValue.compareTo(maximumValue) > 0)
            maximumValue = twoValue;
        if (threeValue.compareTo(maximumValue) > 0)
            maximumValue = threeValue;
        return maximumValue;
    }

    public static <U> void printMax(U maximum) {
        System.out.println(maximum);
    }

    //TO MAIN METHOD
    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics");
    }
}





