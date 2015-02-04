/**
 * Write a description of class ExceptionOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DemoOne
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ExceptionOne
     */
    public DemoOne(){

        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int methodOneCatching(String y)
    {
        try{
            if (y == null)
                throw new MyException("y is null");
            // put your code here
        } catch(MyException e){
            System.out.println("caught Exception: "+e.getMessage());
        }
        return x;

    }

    public int methodOne(String y) throws MyException
    {
        if (y == null)
            throw new MyException("y is null");
        System.out.println("I'm here");
        return x;

    }

    public void ok(){
        try{
            methodOne("x");
        }
        catch(MyException e){
            System.out.println("caught Exception: "+e.getMessage());

        }
    }

    public void notOk(){
        try{
            methodOne(null);
        }
        catch(MyException e){
            System.out.println("caught Exception: "+e.getMessage());
        }
    }
}
