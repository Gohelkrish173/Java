import java.util.Scanner;
public class LabUnit3Final{
	static BookDetails[] books;
	public static void main(String[] args) {
		LabUnit3Final self = new LabUnit3Final();
		Scanner scString = new Scanner(System.in);
		Scanner scNumber = new Scanner(System.in);
		System.out.println("Enter No of books");
		int n = scNumber.nextInt();
		books = new BookDetails[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter Title of book "+(i+1));
			String title = scString.nextLine();

			System.out.println("Enter Author of book "+(i+1));
			String author = scString.nextLine();

			System.out.println("Enter Price of book "+(i+1));
			double price = scNumber.nextDouble();

			System.out.println("Enter Stock of book "+(i+1));
			int stock = scNumber.nextInt();

			books[i] = new BookDetails(title,author,price,stock);
		}
		self.printAllBooks();

		while(true){
			System.out.println("Enter 1 for search, 2 for purchase, 3 for sell, 4 for display, or any other number to exit");
			int choice = scNumber.nextInt();
			if(choice==1){
				System.out.println("Enter word to search");
				String searchWord = scString.nextLine();
				for(int i=0;i<n;i++){
					books[i].search(searchWord);
				}
			}
			else if(choice==2){
				// code to purchase
				System.out.println("Enter word to search");
				String searchWord = scString.nextLine();
				System.out.println("Enter Stock purchased");
				int noOfBooks = scNumber.nextInt();
				
				for(int i=0;i<n;i++){
					books[i].purchase(searchWord,noOfBooks);
				}
			}
			else if(choice==3){
				// code to sell
				System.out.println("Enter word to search");
				String searchWord = scString.nextLine();
				System.out.println("Enter Stock sold");
				int noOfBooks = scNumber.nextInt();
				
				for(int i=0;i<n;i++){
					books[i].sell(searchWord,noOfBooks);
				}
			}
			else if(choice==4){
				// code to display
				self.printAllBooks();
			}
			else{
				break;
			}
		}
	}

	public void printAllBooks(){
		for(int i=0;i<books.length;i++){
			System.out.println("Title = "+books[i].title+ " , Author = "+books[i].author+ " , Stock = "+books[i].stock);
		}
	}
}

class Book{
	String title;
	String author;
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}

class BookDetails extends Book{
	double price;
	int stock;

	public BookDetails(String title, String author, double price, int stock){
		super(title,author);
		this.price = price;
		this.stock = stock;
	}

	public void search(String searchWord){
		if(title.toLowerCase().indexOf(searchWord.toLowerCase())>-1 || author.indexOf(searchWord)>-1){
			System.out.println("Book Title = "+title);
		}
	}

	public void purchase(String searchWord,int noOfBooks){
		if(title.toLowerCase().indexOf(searchWord.toLowerCase())>-1 || author.indexOf(searchWord)>-1){
			stock += noOfBooks;
		}

	}

	public void sell(String searchWord,int noOfBooks){
		if(title.indexOf(searchWord)>-1 || author.indexOf(searchWord)>-1){
			stock -= noOfBooks;
		}
	}

}