package com.feedback;

public class Feedback {
	private int id;
	private String username;
	private String movieName;
	private int movieRating;
	private int siteRating;
	private String feedbackcol;
	//private int userId;
	
	public Feedback(int id, String username, String movieName, int movieRating, int siteRating,
			String feedbackcol) { //int userId
		super();
		this.id = id;
		this.username = username;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.siteRating = siteRating;
		this.feedbackcol = feedbackcol;
		//this.userId = userId;
		
		
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public int getSiteRating() {
		return siteRating;
	}

	public String getFeedbackcol() {
		return feedbackcol;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public void setSiteRating(int siteRating) {
		this.siteRating = siteRating;
	}

	public void setFeedbackcol(String feedbackcol) {
		this.feedbackcol = feedbackcol;
	}


	

	
	
}
