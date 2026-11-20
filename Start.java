class Book  {
    private String bookName ;
    private String bookAuthor;
    private String bookId;
    private String bookType;
	private int bookCopy;
	private static int uniqueBookCounter=0;
    public Book (){
		uniqueBookCounter++;
	}
  
  
  
 public Book (String bookName ,String bookAuthor ,String bookId ,String bookType , int bookCopy)
  {
  setBookName(bookName);
  setBookAuthor(bookAuthor);
  setBookId(bookId );
  setBookType(bookType);
  setBookCopy(bookCopy);
  uniqueBookCounter++;
  }
  
  public void  setBookName (String bookName){
  this.bookName=bookName;
  }
 public String getBookName()
 {
 return bookName;
 }
 
 public void setBookAuthor(String bookAuthor){
 this.bookAuthor=bookAuthor;
 }
 public String getBookAuthor(){
 return bookAuthor;
 }
 
  public void setBookId(String bookId){
 this.bookId=bookId;
 }
 public String getBookId(){
 return bookId;
 }

 public void setBookType(String bookType)
 {
 this.bookType=bookType;
 }
public String getBookType()
 {
 return bookType;

 }
 public void setBookCopy(int bookCopy)
 {
 this.bookCopy=bookCopy;
 }
public int getBookCopy()
 {
 return bookCopy;

 }
 public int  addBookCopy(int x){
	 bookCopy+=x;
	 return bookCopy;
	 
	 
 }
 public static void totalNumberofUniqueBooks(){
	 System.out.println("Total number of unique book:  "+uniqueBookCounter);
 }
 
 
 public void showDetails(){
		System.out.println("Book Name: " +bookName);
		System.out.println("Book Authority: " +bookAuthor);
		System.out.println("Book Id: "+bookId);
		System.out.println("Book type: "+bookType);
		System.out.println("Book Copy: "+bookCopy);
        System.out.println();
		
	}
}

public class Start{
	
	public static void main (String [] args)
	{
		Book b1= new  Book("kothao keo nai","humayon ahmed","23xxxx","Story", 12 );
		Book b2= new  Book("mouarakkhi ","humayon ahmed","24xxx","Story", 20 );
		Book b3= new  Book("prothome alo ","Sunil Gangopadhyay","24xxx","Novel", 26 );
		Book b4= new  Book("Those days ","Sunil Gangopadhyay","28xxx","Novel", 29 );
		b1.addBookCopy(12);
		b1.showDetails();
		
		b2.addBookCopy(18);
		b2.showDetails();
		
		b3.addBookCopy(9);
		b3.showDetails();
		
		b4.addBookCopy(10);
		b4.showDetails();
		Book. totalNumberofUniqueBooks();
		
		
	}
	
}