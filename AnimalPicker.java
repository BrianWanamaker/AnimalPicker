import java.util.Scanner;

class AnimalPicker
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);    
        boolean done=false;
        while(!done)
        {
            System.out.println("Would you like to see a 'dog' or a 'cat' ?");
            String input = in.nextLine();
            if(input.toLowerCase().equals("dog"))
            {
                System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
                done=true;
            }
            else if(input.toLowerCase().equals("cat"))
            {
                System.out.println("  /\\_/\\  (\n ( ^.^ ) _)\n   \\\"/  (\n ( | | )\n(__d b__)");
                done=true;
            }
            else
            {
                System.out.println("Error: Invalid input.");
            }
        }    
    }
}