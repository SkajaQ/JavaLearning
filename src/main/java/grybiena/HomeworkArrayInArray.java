package grybiena;

public class HomeworkArrayInArray {

    public static void main(String[] args) {

        int[] myArray = {4, 8, 3, 7, 1};

        int[][] result = getMatrix(myArray);
        printArray(result);
    }

    public static int[][] getMatrix(int[] numbers) {

        int[][] result = new int[numbers.length][numbers.length];
        result[0] = numbers;

        for (int i = 1; i < numbers.length; i++) {
            result[i] = shiftArray(result[i-1]);
        }
        return result;
    }

    public static int[] shiftArray(int[] array) {
        int[] shiftResult = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if ( (i+1) > array.length - 1 ) {
                shiftResult[0] = array[array.length - 1];
            } else {
                shiftResult[i+1] = array[i];
            }
        }
        return shiftResult;
    }

    public static void printArray(int[][] array) {
        for (int h = 0; h < array.length; h++) {
            for (int i=0; i<array[h].length; i++) {
                System.out.print(array[h][i] + ", ");
            }
            System.out.println();
        }
    }
}
