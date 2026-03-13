//Java : Remove Or Removing All The Whitespaces ( Blank Spaces) In The String
public class SqueezeString
{
    static int i;
    
    static void squeeze(String s)
    {
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch != ' ')
            System.out.print(ch);
        }
    }
    
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("   manchester united is also known as red devil   ");
        SqueezeString.squeeze("   manchester united is also known as red devil    ");
   String tsr =" manchester united is also known as red devil    ";
   String tsr1= tsr.replaceAll("\\s", "");
   System.out.println("print this");
    System.out.println(tsr1);
    
    }
}
