package Assignment3;

import java.util.Scanner;

class Book
{
	private int bookno;
	
	private String title;
	
	private String Author;
	
	private float price;

	
	
	
   public Book(int bookno, String title,String Author ,float price) {
		super();
		this.bookno = bookno;
		this.title = title;
		this.Author=Author;
		this.price = price;
		
		
   }

	

	

	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		
	}

	
	public String getAuthor() {
		return Author;
	}



	public void setAuthor(String author) {
		Author = author;
	}



	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		
	}
}
	
	class EngineeringBook extends Book
	{
	
		private String category;
	
		Scanner sc=new Scanner(System.in);
		
		public EngineeringBook(int bookno, String title, String Author, float price, String catagory)
	{
			super(bookno, title, Author, price);
			this.category=category;
			
		}

	

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
			
		}
	
	}


public class BookDetails {

	public static void main(String[] args) {
		
	Book b=new Book(1,"pds","xyz",580);
	
	b.getBookno();
	b.getTitle();
	b.getAuthor();
	b.getPrice();
	
    System.out.println(b.getBookno());
	
	System.out.println(b.getTitle());
	
	System.out.println(b.getAuthor());
	
	System.out.println(b.getPrice());
	

	
EngineeringBook e = new EngineeringBook(1, "pds", "xyz",580,"Javaprogramming");
	
	
	e.getCategory();
	
   System.out.println(e.getCategory());
	
	
	
	
	}

}
