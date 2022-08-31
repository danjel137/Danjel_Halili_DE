package magicSquare;

public class MagicSquare {
    public static void main(String[] args) {
        {
            int totalCost = 0;
            int biggestNumber = 0;
            int[] v = new int[8];
            int m[][] = new int[][]{{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
            int i0 = 0;
            int i1 = 0;
            int i2 = 0;
            int ij = 0;
            int j0 = 0;
            int j1 = 0;
            int j2 = 0;
            int ji = 0;


            for (int i = 0, j = 2; i < 3; i++, j--) {
                ji += m[i][j];
                v[7] = ji;
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 0) {
                        i0 += m[i][j];
                        v[0] = i0;

                    }
                    if (i == 1) {
                        i1 += m[i][j];
                        v[1] = i1;
                    }
                    if (i == 2) {
                        i2 += m[i][j];
                        v[2] = i2;
                    }
                    if (i == j) {
                        ij += m[i][j];
                        v[3] = ij;
                    }
                    if (j == 0) {
                        j0 += m[i][j];
                        v[4] = j0;
                    }
                    if (j == 1) {
                        j1 += m[i][j];
                        v[5] = j1;
                    }
                    if (j == 2) {
                        j2 += m[i][j];
                        v[6] = j2;
                    }

                }
            }
//            System.out.println(i0);
//            System.out.println(i1);
//            System.out.println(i2);
//            System.out.println(ij);
//            System.out.println(j0);
//            System.out.println(j1);
//            System.out.println(j2);


            for (int i = 0; i < 8; i++) {
                if (biggestNumber < v[i]) {
                    biggestNumber = v[i];
                }

            }

            int a = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 0 & j == 0) {
                        if (i0 == j0 && i0 == ij) {
                            a = biggestNumber - j0;
                            m[i][j] += a;
                            i0 = i0 + a;
                            j0 = j0 + a;
                            ij = ij + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 0 && j == 1) {
                        if (i0 == j1) {
                            a = biggestNumber - j1;
                            m[i][j] += a;
                            j1 = j1 + a;
                            i0 = i0 + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 0 && j == 2) {
                        if (i0 == j2 && i0 == ji) {
                            a = biggestNumber - j2;
                            m[i][j] += a;
                            j2 = j2 + a;
                            i0 = i0 + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 1 && j == 0) {
                        if (i1 == j0) {
                            a = biggestNumber - j0;
                            m[i][j] += a;
                            j0 = j0 + a;
                            i0 = i0 + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 1 && j == 1) {
                        if (i1 == j1 && i1 == ij) {
                            a = biggestNumber - j1;
                            m[i][j] += a;
                            j1 = j1 + a;
                            i1 = i1 + a;
                            ij = ij + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 1 && j == 2) {
                        if (i1 == j2) {
                            a = biggestNumber - j2;
                            m[i][j] += a;
                            j2 = j2 + a;
                            i1 = i1 + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 2 && j == 0) {
                        if (i2 == j0 && i2 == ji) a = biggestNumber - i2;
                        m[i][j] += a;
                        i2 = i2 + a;
                        j0 = j0 + a;
                        ji = ji + a;
                        totalCost += a;
                        a = 0;
                    }
                    if (i == 2 && j == 1) {
                        if (i2 == j1) {
                            a = biggestNumber - i2;
                            m[i][j] += a;
                            i2 = i2 + a;
                            ji = ji + a;
                            totalCost += a;
                            a = 0;
                        }
                    }
                    if (i == 2 && j == 2) {
                        if (i2 == j2 && i2 == ij) {
                            a = biggestNumber - i2;
                            m[i][j] += a;
                            i2 = i2 + a;
                            j2 = j2 + a;
                            totalCost += a;
                            a = 0;
                        }
                    }

                    System.out.print(m[i][j]);
                }
                System.out.println();

            }
            System.out.println("total cost is: " + totalCost);

        }
    }
}