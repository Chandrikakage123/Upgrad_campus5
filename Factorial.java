class Factorial
{
   public static void main(String args[])
   {
       int i,num,fact=1;
       num = Integer.parseInt(args[0]);
       if(num<0)
             System.out.println("please enter positive number");
       else if(num == 0 || num == 1)
             System.out.println("Factorial of"+num+"is"+fact);
       else
       {
             for(i=2;i<=num;i++)
             {
                  fact=fact*i;
             }
             System.out.println("Factorial of"+num+"is"+fact);
        }
    }
}
