import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Exec24
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the filename to read:");
        String s=sc.nextLine();
        
        try{
            FileReader filereader=new FileReader(s);
            int character;
            System.out.println("\nFile Contents:\n");
            while((character=filereader.read())!=-1)
            {
                System.out.print((char)character);
            }
            filereader.close();
        }
        catch(IOException e)
        {
            System.out.println("An error Occured"+ e.getMessage());
        }
    }
}