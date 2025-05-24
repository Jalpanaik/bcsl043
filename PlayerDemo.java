class player{
    String name;
    int age;

    public player(String n, int a)
    {
        name=n;
        age=a;
    }

    void Display_Info()
    {
        System.out.println("Player Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Cricket_Player extends player{
    String team;

    Cricket_Player(String n,int a, String t)
    {
       super(n, a);
        team=t;
    }
@Override
    void Display_Info()
    {
        super.Display_Info();
        System.out.println("Sport: Cricket");
        System.out.println("team: "+team);
    }
} 
class Football_Player extends player{
    String club;

    Football_Player(String n,int a,String t){
       super(n, a);
        club=t;
    }
    @Override
    void Display_Info()
    {
        super.Display_Info();
        System.out.println("Sport: Football");
        System.out.println("club: "+club);
    }
}

public class PlayerDemo{
    public static void main(String[] args) {
        Cricket_Player cp=new Cricket_Player("Virat Kohli",34,"India");
        Football_Player fp=new Football_Player("Lionel Messi",36,"Inter Miami");

        System.out.println("Criclet Player Info: ");
        cp.Display_Info();
        System.out.println(0);

        System.out.println("Football_Player Info:");
        fp.Display_Info();
        System.out.println();
    }


    
}
