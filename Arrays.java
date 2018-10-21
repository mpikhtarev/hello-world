public class Arrays {
    public static void main(String[] args)
    {
        int number = 10;
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++)
        {
            a[i] = i * 10;
        }

        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println();
        int[] b = {1,2,3};

        for(int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}
