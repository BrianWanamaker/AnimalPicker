import java.util.Scanner;

class AnimalPicker
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to see a 'dog' or a 'cat' ?");
        String input = in.nextLine();
        if(input.toLowerCase().equals("dog"))
        {
            System.out.println("DOG ASCII ART HERE");
        }
        else if(input.toLowerCase().equals("cat"))
        {
            System.out.println("CAT ASCII ART HERE");
        }

    }
}