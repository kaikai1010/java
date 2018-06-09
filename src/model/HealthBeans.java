package model;

public class HealthBeans implements java.io.Serializable {
	private String height;
	private String weight;
	private double bmi;
	private String bodyType;

	public HealthBeans() {}
	public HealthBeans(String height, String weight) {
		this.height = height;
		this.weight = weight;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getHeight() {
		return height;
	}
	public String getWeight() {
		return weight;
	}
	public double getBmi() {
		return bmi;
	}
	public String getBodyType() {
		return bodyType;
	}
}
