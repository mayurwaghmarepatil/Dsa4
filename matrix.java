public class matrix {

        static final int N = 3;


        static void transpose(int A[][])
        {
            for (int i = 0; i < N; i++)
                for (int j = i + 1; j < N; j++) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
        }

        // Driver code
        public static void main(String[] args)
        {
            int A[][] = { { 1,2,3 },
                    { 4,5,6},
                    {7,8,9 } };

            transpose(A);

            System.out.print("Modified matrix is \n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(A[i][j] + " ");
                System.out.print("\n");
            }
        }
    }


