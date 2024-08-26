package com.queries;

public class User {
    
	 private int id;
	private String queryCategory; 
    private String queryText; 
    private String submittedAt; 
    private String respondedAt; 
    private String responseText;
    
	public User(int id, String queryCategory, String queryText, String submittedAt, String respondedAt,
			String responseText) {
		
		this.id = id;
		this.queryCategory = queryCategory;
		this.queryText = queryText;
		this.submittedAt = submittedAt;
		this.respondedAt = respondedAt;
		this.responseText = responseText;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQueryCategory() {
		return queryCategory;
	}

	public void setQueryCategory(String queryCategory) {
		this.queryCategory = queryCategory;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getSubmittedAt() {
		return submittedAt;
	}

	public void setSubmittedAt(String submittedAt) {
		this.submittedAt = submittedAt;
	}

	public String getRespondedAt() {
		return respondedAt;
	}

	public void setRespondedAt(String respondedAt) {
		this.respondedAt = respondedAt;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}
    
    
    
    

    
}
