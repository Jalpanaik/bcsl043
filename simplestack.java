public class simplestack{
    private int[] stack;
    private int top;
    private int capacity;

    public simplestack(int size)
    {
        capacity=size;
        stack=new int[capacity];
        top=-1;
    }
    public void push(int value) throws Exception
    {
        if(top==capacity-1)
        {
            throw new Exception ("Stack overflow: cannot push,stack id full.");
        }
        stack[++top]=value;

    }
    public int pop() throws Exception
    {
        if(top==-1)
        {
            throw new Exception("Stack underflow: cannot pop,stack is empty.");
        }
        return stack[top--];
    }
    public static void main(String[] args) {
        simplestack obj=new simplestack(5);
        try{
            obj.push(10);
            obj.push(20);
            obj.push(30);
            obj.push(40);

            System.out.println("popped:"+ obj.pop());
            System.out.println("popped:"+ obj.pop());
            System.out.println("popped:"+ obj.pop());
            System.out.println("popped:"+ obj.pop());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
    }
}
