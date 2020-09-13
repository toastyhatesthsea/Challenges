package ApplesOranges;

public class ApplesAndOranges
{
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        int totalApples = getTotal(s, t, a, apples);
        int totalOranges = getTotal(s, t, b, oranges);

        System.out.println(totalApples);
        System.out.println(totalOranges);


    }

    public static int getTotal(int s, int t, int locationOfTree, int[] fruit)
    {
        int totalFruit = 0;
        for (int i = 0; i < fruit.length; i++)
        {
            int aFruit = fruit[i];
            int dropLocation = aFruit +  locationOfTree;

            if (dropLocation >= s && dropLocation <= t)
            {
                totalFruit++;
            }
        }
        return totalFruit;
    }
}

class Testers
{
    public static void main(String[] asdasdasd)
    {

    }
}
