//3.打印出下面的图案

class practice43 {

    public static void main(String[] args) {
        int a[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            int b = 5;
            for (int j = 0; j < 5 - i; j++) {
                a[i][j] = b;
                System.out.print(a[i][j]);
                b--;
            }
            System.out.println();
        }
    }
}