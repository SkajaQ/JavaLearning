package grybiena;

public class HomeworkMulti {

    public static void main(String[] args){

        int from = 2;
        int to = 4;

        System.out.print("  ");

        for (int s = from; s <= to; s++) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");

            for (int j = from; j <= to; j++) {
                System.out.print(j*i + " ");
            }
            System.out.println();
        }
    }
}
