package Bo;

import java.io.File;

public class Modal {

	private int id;
	private String brandName;
	private String modal;
	private int price;
	private float milage;
	private int siting_cap;
	private File image ;
	public Modal() {
		super();
	}
	
	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public Modal(int id, String brandName, String modal, int price,
			float milage, int siting_cap, File image) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.modal = modal;
		this.price = price;
		this.milage = milage;
		this.siting_cap = siting_cap;
		this.image = image;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getMilage() {
		return milage;
	}
	public void setMilage(float milage) {
		this.milage = milage;
	}
	public int getSiting_cap() {
		return siting_cap;
	}
	public void setSiting_cap(int siting_cap) {
		this.siting_cap = siting_cap;
	}
	
}
