public class ArraySum {
    public static boolean verify(int[] values) throws Exception {
        int arrayLength = values[1];
        if(arrayLength + 2 != values.length)
            throw new Exception("Values do not match the arrayLength");

        int expectedSumValue = values[0];
        int valuesLength = arrayLength + 1;

        for (int i = 2; i <= valuesLength; i++){
            for (int j = 2; j <= valuesLength; j++){

                boolean isTheSameIndex = j == i;

                if(isTheSameIndex)
                    continue;

                int sum = values[i] + values[j];

                if(expectedSumValue == sum)
                    return true;
            }
        }

        return false;
    }
}
