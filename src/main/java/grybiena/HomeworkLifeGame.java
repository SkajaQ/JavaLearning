package grybiena;

public class HomeworkLifeGame {

    public static void main(String[] args) {

        int size = 10;
        int tries = 50;
        char[][] field = new char[size][size];
        // generate random first field
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (Math.random() < 0.25) {
                    field[i][j] = 'x';
                } else {
                    field[i][j] = '.';
                }
            }
        }
        printField(field);
        // array which holds fields for history
        char[][][] allFields = new char[tries][size][size];
        // copy field to new field to use it in loop
        char[][] newField = field;
        for (int attempt = 0; attempt < tries; attempt++) {
            char[][] tempField = new char[size][size];
            for (int i = 0; i < newField.length; i++) {
                for (int j = 0; j < newField[i].length; j++) {
                    // function which get all alive neighbour cells
                    int neighbours = getNeighbours(i, j, newField);
                    char cell = newField[i][j];
                    // fill new field
                    tempField[i][j] = drawCell(cell, neighbours);
                }
            }

            newField = tempField;
            System.out.println(attempt +1);
            printField(newField);
            allFields[attempt] = newField;
            boolean foundSame = false;

            for (int i=0; i < attempt; i++) {
                if (compareArrays(newField, allFields[i])) {
                    System.out.println("Found same field on attempt: " + attempt);
                    foundSame = true;
                    break;
                }
            }

            if (foundSame) {
                break;
            }
        }

    }

    private static int getNeighbours(int i, int j, char[][] field) {

        int neighbours = getCell(i-1, j-1 , field) + getCell(i-1, j , field) + getCell(i-1, j+1 , field) +
                getCell(i, j-1 , field) + getCell(i, j+1 , field) + getCell(i+1, j-1 , field) +
                getCell(i+1, j , field) + getCell(i+1, j+1 , field);
        
        return neighbours;
    }
    // if neighbour exists and alive - return 1 else 0
    public static int getCell(int i, int j, char[][] field) {
        if (i >= 0 && i < field.length) {
            if (j >= 0 && j < field.length) {
                if (field[i][j] == 'x') {
                    return 1;
                }
            }
        }
        return 0;
    } 
    
    public static char drawCell(char cell, int neighbours) {
        if (neighbours == 3) {
            return 'x';
        } else if (neighbours == 2 && cell == 'x') {
            return 'x';
        } else {
            return '.';
        }
    }

    public static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static boolean compareArrays(char[][] arr1, char[][] arr2) {
        boolean areEqual = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    areEqual = false;
                    break;
                }
            }
            if (!areEqual) {
                break;
            }
        }
        return areEqual;
    }
}
