package OOPS;

//enum
enum Status{
    Running,Failed,Pending,Success;
}
public class op_6 {
    public static void main (String[] args){

   Status s = Status.Running;
   System.out.println(s.ordinal()); // out => 0 <= index of Running.
   // status.values() => gives the array.

   switch(s)
   {
    case Running:
        System.out.println("good");
        break;
   
    case Pending:
        System.out.println("pending");
        break;

        case Failed :
            System.out.println("failed"); 

            case Success:
                System.out.println("success!!");

                default:
                    System.out.println("non found 203");
      }
    }
}
//8:56
