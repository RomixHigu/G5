package proyecto;

public class Comment {

	private Integer postId;
	private Integer id;
	private String name;
	private String email;
	private String body;
	
	public Comment() {
		super();
	}

	public Comment(Integer postId, Integer id, String name, String email, String body) {
		super();
		this.postId = postId;
		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Comment [postId= " + postId +"\n"+ "id= " + id +"\n"+ "name =" + name +"\n"+ "email =" + email +"\n"+ "body =" + body +"\n"
				+ "]\n";
	}
	
	
}
