
public class BookApp 
{
	public static void main(String[] args)
	{
		
		String author = "R.L. Stine";
		String bookID = "GB 101";
		String title = "Goosebumps";
		String description = "Scary Scary Scary";
		double price = 14.99;
		
		
		Book myBook = new Book(bookID, author, title, description, price);

			
		System.out.println(myBook.getDisplayText());
	}
}

/* You don't have to define the variables up top and then create the instance of the book, you could
    do this:
    
    public static void main(String[] args)
    {
    
    Book myBook = new Book ("GB 101", "R.L. Stine", "Goosebumps", "Scary Scary Scary", 14.99);
    
    etc...
    }
    
 */