import java.util.Scanner;
public class s2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int marks[]=new int[5];
        int total=0,i;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter marks:");
            marks[i]=in.nextInt();
            total=total+marks[i];
        }
        double avg=total/5.0;
        System.out.println("Average amrks is:"+avg);
        
    }
}