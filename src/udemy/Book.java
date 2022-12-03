package udemy;

import java.util.ArrayList;

public class Book {
	// state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>(); // ���並 ArrayList�� ����

	// creation
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	// operations
	// ���� �ۼ�
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	// ǥ���� ���� String
	public String toString() {
		return String.format("id = %d, name = %s, author = %s, Review = [%s]", id, name, author, reviews);
	}
	
	
	}

