import java.util.Scanner;

class AnimalPicker
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);    
        boolean done=false;
        while(!done)
        {
            System.out.println("Would you like to see a 'dog','cat', or a 'fish' ?");
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
            else if(input.toLowerCase().equals("fish"))
            {
                System.out.println("(..       \\_    ,  |\\  /|\n \\       O  \\  /|  \\ \\/ /\n  \\______    \\/ |   \\  / \n     vvvv\\    \\ |   /  |\n     \\^^^^  ==   \\_/   |\n      `\\_   ===    \\.  |\n      / /\\_   \\ /      |\n      |/   \\_  \\|      /\n             \\________/");
                done=true;
            }
            else
            {
                System.out.println("Error: Invalid input.");
            }
        }    
    }
}