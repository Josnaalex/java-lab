
import java.util.Scanner;
class tooYoung extends Exception
{
    tooYoung(String msg)
    {
        System.out.println(msg);
    }
}
class tooOld extends Exception
{
    tooOld(String msg)
    {
        System.out.println(msg);
    }
}

public class marriage {
    
    public static void main(String args[])
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        age = sc.nextInt();
        if(age>60)
        {
            try{
                throw new tooOld("Time out...You are expired");
            }
            catch(tooOld e){
                System.out.println("Exception Handled");
            }
        }
        else
        if(age<18)
        {
            try{
                throw new tooYoung("Not eligible...wait for some time");
            }
            catch(tooYoung e)
            {
                System.out.println("Exception Handled");
            }
        }
        else
        {
            System.out.println("We can proceed");
        }
    }
    
}
