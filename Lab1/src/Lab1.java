//5 вариант
public class Lab1
{
    public static void main(String[] args)
    {
        byte n = 5;
        byte [] [] Matrix = new byte [n] [n];
        System.out.println("Generated Matrix:");
        for(int i = 0;i < Matrix.length;i++)
        {
            for(int j = 0;j < Matrix.length;j++)
            {
                Matrix [i] [j] = (byte) (Math.random()*255);
            }
        }

        for (int i =0;i<Matrix.length;i++,System.out.println())
        {
            for (int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                byte temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }
        }
        System.out.println("Transponated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
