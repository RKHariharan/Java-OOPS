package real;
public class suboops{
class suboops extends oops1
{
    public static void main(String[]args)
    {
        suboops obj = new suboops();
        obj.display();
        try{
            obj.display1();
           
        }
        catch(Exception e)
        {
            System.out.println("default property cannot be displayed");
        }
       
}

    private void display1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
}