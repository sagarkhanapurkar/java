import java.util.*;  
class Mathx   {

int numberOfPages;
int readingRate;
int days;

 

public static void main(String[] args)  {

Mathx ae = new Mathx();

ae.setPages();
ae.setRate();

ae.theOutput();


}

int theResult(int days) {

    days = numberOfPages/readingRate;

    //System.out.println("You will need " + days + " days to finish the book of" + numberOfPages + "pages");
    return days;
    
}

private void setRate() {
    System.out.println("Enter the number of pages you can read in one day:");
    Scanner a = new Scanner(System.in);
    readingRate = a.nextInt();


}

private void setPages() {
    System.out.println("Enter the number of pages of the book:");
    Scanner a = new Scanner(System.in);
    numberOfPages = a.nextInt();

}

private void theOutput(){
    System.out.println("You will need " + days + " to finish the book of " + numberOfPages + " pages");
}
}
