public class ReverseString
{
    public static void main(String[] args)
    {
        String  s= "RaaaaR";
        String ans = "";
        for(int i = 5;i>=0;i--)
        {
            ans = ans + s.charAt(i);
            
        }
        System.out.println(ans);
        
        
        if( s.equals(ans))
        {
            System.out.println("its OKAY");
        }
        else
        {
             System.out.println("its NOT! OKAY");
        }
        
    }
}
