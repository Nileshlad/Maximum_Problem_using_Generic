public class Maximum<N extends Comparable> {
    N oneValue;
    N twoValue;
    N threeValue;

    //TO CONSTRICTOR
    public Maximum(N oneValue, N twoValue, N threeValue) {
        this.oneValue = oneValue;
        this.twoValue = twoValue;
        this.threeValue = threeValue;
    }

    //
    public N testMaximum() {
        N maximum = testMaximum(oneValue, twoValue, threeValue);
        printMaximum(maximum);
        return maximum;
    }

    //TO USE GENERIC
    public static <N extends Comparable> N testMaximum(N oneValue, N twoValue, N threeValue) {
        N maximumValue = oneValue;
        if (twoValue.compareTo(maximumValue) > 0)
            maximumValue = twoValue;
        if (threeValue.compareTo(maximumValue) > 0)
            maximumValue = threeValue;
        return maximumValue;
    }

    //TO GENERIC CLASS
    public static <N> void printMaximum(N maximum) {
        System.out.println(maximum);
    }

    //TO MAIN METHOD
    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics");
    }
}





