import java.util.*;  
class Mathx   
{  

    public static void main(String[] args)  


{  


    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

    System.out.print("How many pages does the book has?");  

    float numberOfPages= sc.nextInt();  

    System.out.print("How many pages can you read per day?");  

    float readingRate= sc.nextInt();  

    float d = numberOfPages/readingRate;  

    System.out.println("It will take " + d + " days to finish the book" );  

}  

}  
