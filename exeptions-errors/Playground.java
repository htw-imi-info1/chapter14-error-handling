
public class Playground
{
    public static void main(String[] args){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);

        try
        {
            int result = new Playground().division3(a,b);
            System.out.println("the result is: "+result);
        }
        catch (Exception e)
        {
            
            System.out.println("an exception was thrown: "+e.getClass());
            System.out.println("There was a problem: "+e.getMessage());
            //e.printStackTrace();
        }

       
    }

    public static void run() throws Exception {
        new Playground().division(7,0);
    }

    public int division(int a, int b) throws Exception {
        if (b == 0){
           // System.out.println("b darf nicht null sein");
            throw new Exception("b darf nicht null sein");
        }
        return a/b;
    }
    
    public int division3(int a, int b) throws Exception {
        assert b != 0;
        
        return a/b;
    }
}
