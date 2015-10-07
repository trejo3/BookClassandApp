
public class Book 
{
	
// This declares the fields/variables	
	
	private String bookID;
	private String author;
	private String title;
	private String description;
	private double price;	
	
	
// These are the Getters and Setters
	
	public String getBookID()
	{
		return bookID;
	}
	public void setBookID(String bookID)
	{
		this.bookID = bookID;
	}
	
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	

// This is the constructor for the class. It initializes/constructs
	
					// You could name this newBookID, newAuthor, etc.. or myBookID, myAuthor etc..
					// to distinct between the variables that you are passing and the variables native to the class
					//because although they may be named the same, that does not associate them
					//hence the reason you need a constructor, to link the variables from the outside
					//to the variables on the inside and assign the appropriate value passed
	public Book(String bookID, String author, String title, String description, double price)
	{
		// So you could do this.bookID = newBookID; for example, and it works the same way 	
		this.bookID = bookID;
		this.author = author;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	
	
//This is a method for the class 'Book'	
	
	public String getDisplayText()
	{
		return author + "\n" + title + "\n" + description;
	}
	
}
