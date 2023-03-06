package lists;

public class Lists 
{

    public static void main(String[] args) 
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int length = length(cars);
        System.out.println("length = " + length);

        reverse(cars, length);
    }

    private static int length(String[] cars) 
    {
        int count = 0;

        for (String i : cars) 
        {
            count++;
        }
        return count;

    }

    private static void reverse(String[] cars, int length) 
    {
       for(int a = 0; a < length / 2; a++)
      {
         String strTemp = cars[a];
         cars[a] = cars[length - a - 1];
         cars[length - a - 1] = strTemp;
      }
      System.out.println("Reversed string array: ");
      
      for(int a = 0; a < length; a++)
      {
         System.out.println(cars[a]);
      }
    }

}
