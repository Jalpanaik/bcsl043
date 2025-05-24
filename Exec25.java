//WAP to to copy a file to another file.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Exec25
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source file name:");
        String sourcefile=sc.nextLine();
        System.out.println("Enter destination file name:");
        String destinationfile=sc.nextLine();

        try
        {
            FileReader reader=new FileReader(sourcefile);
            FileWriter writer=new FileWriter(destinationfile);

            int character;
            while((character=reader.read())!=0)
            {
                writer.write(character);

            }
            reader.close();
            writer.close();

            System.out.println("File copied Successfully:");
        }
        catch (IOException e)
        {
            System.out.println("An error occured:"+e.getMessage());
        }
    }
}