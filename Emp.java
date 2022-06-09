import java.util.*;
import java.util.ArrayList;
// import required packages

class Emp{
    public static void main(String args[])

    {   
        ArrayList<String>s1=new ArrayList<String>();

        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
    
        System.out.print("Enter username :");
        String username=sc.nextLine();
        System.out.print("Enter passward :");
        String passward=sc.nextLine();

     if (username.contentEquals("admin")&&passward.contentEquals("admin"))
        {
          
      int ch;
      do{
      System.out.println("~~~~~~~~~~!Employee Management System!~~~~~~~~~~");
      System.out.println(" 1 : To Add an Employee Details");
      System.out.println(" 2 : To show an Employee Details ");
      System.out.println(" 3 : To remove an Employee");
      System.out.println("4  : Exit");
      System.out.println("enter your choice :");
      ch=sc.nextInt();
      
    switch(ch)
    {
        case 1:
        System.out.println("~~~~~~~~~~Enter details!~~~~~~~~~~");

        System.out.println();
        System.out.print("enter ID of Employee   :");
        String eID=sc1.nextLine();
        s1.add(eID);
        System.out.println();

        System.out.print("enter name of Employee :");
        String ename=sc1.nextLine();
        s1.add(ename);
        System.out.println();

        System.out.print("enter email of Employee : "); 
        String email=sc1.nextLine();
        s1.add(email);
        System.out.println();

        System.out.print("enter edept of Employee :");
        String edept=sc1.nextLine();
        s1.add(edept);
      
        System.out.println("Details added successfully!");

        System.out.println("press enter to continue.....");
        String enter=sc1.nextLine();
       
       break;
        case 2:
        System.out.println();
        System.out.println("~~~~~~~~~~Entered details!~~~~~~~~~~");
        Iterator<String>i=s1.iterator();
         while(i.hasNext()){
             System.out.println(i.next());
         }
         System.out.println("After adding the element the size of the ArrayList is: " + s1.size());

         System.out.println("press enter to continue.....");
          enter=sc1.nextLine();

        break;

        case 3:
        System.out.println("-----------------------------------------");
        s1.removeIf(n -> (n.charAt(0) == 'c'));   

        // Showing the elements in the ArrayList 

        System.out.println("data is Deleted");
        System.out.println("After removing the element the size of the ArrayList is: " + s1.size());
        System.out.println("press enter to continue.....");
        enter=sc1.nextLine();
        break;   

       case 4:
       System.out.println("Exit");
       break;
    }

     }

     while(ch!=4);

    }

    else
        {
            System.out.println("Incorrect Username OR Passward");
            System.out.println("~~~~~~~~~~Try Again!~~~~~~~~~~");
        }

}

}
