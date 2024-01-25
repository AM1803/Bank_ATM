import java.util.*; 
    class HelloWorld { 
        public static void main(String[] args) { 
            Scanner sc=new Scanner(System.in); 
             
            System.out.println("1. Credit amount"); 
            System.out.println("2. Withdraw amount"); 
            System.out.println("3. Balance amount"); 
            System.out.println("4. Exit"); 
            System.out.println("Enter your choice"); 
            int ch=sc.nextInt(); 
            int amt=0;
            while(ch!=4){
            switch(ch){ 
                case 1: 
                    System.out.println("Enter amount to be added"); 
                    int x=sc.nextInt(); 
                        amt=amt+x; 
                    System.out.println("Now total available balance is ");
                    System.out.println(amt);
                     break;
                case 2: 
                    System.out.println("Enter amount to be debited"); 
                    int y=sc.nextInt();
                    if(y>amt){
                        System.out.println("Insufficient funds");
                    } 
                    else{
                        amt=amt-y;
                        if(amt<2000){
                            System.out.println("Minimum balance is not there ");
                            System.out.println("CANCEL TRANSACTION");
                            amt=amt+y;
                        }
                    }
                   
                   break;
                case 3: 
                    System.out.print("Balance amount: "); 
                    System.out.println(amt); 
                    if(amt==2000){
                        System.out.println("Only the minimum balance is there");
                    }
                    
                    break;
                case 4:
                    System.out.println("Thank you for the visit");
                    System.out.println("--------------");
                   //System.exit(0);
                   break;
                default:
                    System.out.println("Invalid choice");
                    break;
            } 
            System.out.println("Enter your choice again");
            ch=sc.nextInt();
        }    
            System.out.println("Thank You");
            System.out.println("-------------------------------");
        } 
        
    }
