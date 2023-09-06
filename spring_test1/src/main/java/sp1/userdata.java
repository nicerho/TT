package sp1;

public class userdata {
	private String name;
	private String id;

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public userdata(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "userdata [name=" + name + ", id=" + id + "]";
	}

}
