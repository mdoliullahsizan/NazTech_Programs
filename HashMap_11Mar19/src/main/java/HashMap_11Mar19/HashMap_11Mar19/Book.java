package HashMap_11Mar19.HashMap_11Mar19;

import java.util.HashMap;
import java.util.Set;

public class Book {
	private String id;
	private String name;
	private String author;

	/**
	 * @param name
	 * @param author
	 */
	public Book(String id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [Id = " + id + ", Name = " + name + ", Author = " + author + "]";
	}

	public static void main(String[] args) {
		Book b1 = new Book("101", "Hamlet", "Shekspear");
		Book b2 = new Book("201", "Himu", "Humayun Ahmed");
		Book b3 = new Book("301", "Sharlock Holmes", "Arthur Conan Doyle");
		Book b4 = new Book("401", "Hercule Poirot", "Agatha Christie");
		Book b5 = new Book("501", "Tin Goyenda", "Rokib Hasan");
		Book b6 = new Book("601", "Masud Rana", "Kazi Anowar Hossain");
		Book b7 = new Book("701", "Amar Bondhu Rashed", "Jafor Iqbal");
		Book b8 = new Book("801", "Debdash", "Sharatcahandra Chattapadhay");
		Book b9 = new Book("901", "Program Pari Na", "Sizan");

		HashMap<String, Book> bookInfo = new HashMap<String, Book>();
		bookInfo.put(b1.getId(), b1);
		bookInfo.put(b2.getId(), b2);
		bookInfo.put(b3.getId(), b3);
		bookInfo.put(b4.getId(), b4);
		bookInfo.put(b5.getId(), b5);
		bookInfo.put(b6.getId(), b6);
		bookInfo.put(b7.getId(), b7);
		bookInfo.put(b8.getId(), b8);
		bookInfo.put(b9.getId(), b9);
		Set<String> s1 = bookInfo.keySet();
		for (String i : s1) {
			System.out.println("Key: " + i + " " + bookInfo.get(i).toString());
		}

	}

}
