package udemy;

import java.util.ArrayList;

public class Book {
	// state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>(); // 리뷰를 ArrayList로 보관

	// creation
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	// operations
	// 리뷰 작성
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	// 표출을 위한 String
	public String toString() {
		return String.format("id = %d, name = %s, author = %s, Review = [%s]", id, name, author, reviews);
	}
	
	
	}

