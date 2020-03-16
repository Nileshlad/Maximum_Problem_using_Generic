public class Maximum
{
    //TO METHOD
    public void findMaximumInteger()
    {
        //To use array
        int[] array = new int[]{10,20,30};
        int currentMax = array[0];
        for(int index=1;index<=array.length-1;index++){
            if(currentMax < array[index]){
                currentMax = array[index];
            }
        }
        System.out.println("Maximum value is "+ currentMax);
    }

    //TO MAIN METHOD AND CREATE OBJECT AND OBJECT CALL
    public static void main(String[] args) {
        System.out.println("WELCOME TEST MAXIMUM AND GENERIC");
        Maximum maximum = new Maximum();
        maximum.findMaximumInteger();
    }
}
