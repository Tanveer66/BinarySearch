
package BinarySearch;
import static java.lang.System.exit;
import java.util.Arrays;
public class BinarySearchImplem
{
    private Byte arr[];
    
    private byte left , right , mid , top;
  //-----------------------------------------  
  
    public BinarySearchImplem()
    {
        arr = new Byte[10];
        
        top = 0 ;
        
    }
//-------------------For Data Sorting -------------//
    
    public void Sort()
    {
        byte min , index , swap ;
        for(byte i = 0 ; i < top ; i++)
        {
            min = arr[i];
            
            for(byte n =(byte)(i+1) ; n < top ; n++)
            {
                
                if(min < arr[n])
                {
                    continue ; 
                }else{
                    
                    min = arr[n];
                }
                
               
            }//closing Inner for Loop
            
            index = (byte)Arrays.asList(arr).indexOf(min);
            
            swap = arr[index];
            
            arr[index] = arr[i];
            
             arr[i] = swap ;
            
        }//closing of outer loop
        
    }//closing of Sort
  //-----------------------------------------------
  
    public void add(byte val)
    {
       if(top == arr.length)
       {
           System.out.println("Array is Full ! ");
          
       }
        arr[top] = val ;
        
        top++ ;
               
    }//closing of add method
   
//-----------------------------------------------
    
    public void show()
    {
        for(byte i = 0 ; i < top ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }//closing of show method
    
 //---------------------------------------------


public void BinarySearching(byte val)
{
    left = 0 ; 
    
    right =(byte) (arr.length-1);
    Sort();
    
    while(left <=right)
    {
        
        mid =(byte)( (left + right)/2 ) ; 
      
//------------------------------------------        
        if(val == arr[mid])
        {
            System.out.println("True : Key is Found in Array Index : " + mid + " : " + val);
            exit(0);
        }
//------------------------------------------
        if(val > arr[mid])
        {
            left =(byte) (mid + 1); 
        }
        
//-------------------------------------------        
        if(val < arr[mid])
        {
            right =(byte) (mid - 1);
        }
      
    }//closing of while loop
    
    System.out.println("The Value You Searched is Not Found in DataBase");
}




}//clisng of Class
