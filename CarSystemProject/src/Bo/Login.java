package Bo;

public class Login {
	private int id;
	private String name;
	private String login_id;
	private String login_pass;
	public Login() {
		super();
	}
	public Login(int id, String name, String login_id, String login_pass) {
		super();
		this.id = id;
		this.name = name;
		this.login_id = login_id;
		this.login_pass = login_pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getLogin_pass() {
		return login_pass;
	}
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}
	

}
