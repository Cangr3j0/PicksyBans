package application;



public class Summoner {
	private String id;
	private String name;
	private String description;
	private int key;
	private ImageSummoner image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public ImageSummoner getImage() {
		return image;
	}

	public void setImage(ImageSummoner image) {
		this.image = image;
	}
}
