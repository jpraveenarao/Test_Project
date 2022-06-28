package testing;
  
class one 
{ 
    public void print_A() 
    { 
        System.out.println("A"); 
    } 
} 
  
class two extends one 
{ 
    public void print_B() 
    { 
        System.out.println("B"); 
    } 

}
class three extends two 
{ 
    public void print_C() 
    { 
        System.out.println("C"); 
    } 
} 
  
// Drived class 
public class multipleinheritence
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        //g.print_A(); 
       // g.print_B(); 
       //g.print_C(); 
    } 
} 
