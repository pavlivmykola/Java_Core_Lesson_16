package ua.lviv.lgs;

public class Car {

	public String model;
	public String color;
	private int weight=1000;
	private int length=5000;
	private int width=1500;
	
	
	public Car() {}


	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}


	public Car(String model, String color, int weight, int length, int width) {
		super();
		this.model = model;
		this.color = color;
		this.weight = weight;
		this.length = length;
		this.width = width;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + length;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (length != other.length)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", weight=" + weight + ", length=" + length + ", width="
				+ width + "]";
	}
	
	
	public void setLightOn() {
		System.out.println("Включено світло");		
	}
	
	public void setLightOff() {
		System.out.println("Світло виключено");		
	}
	
	public void setEngineOn() {
		System.out.println("Двигун увімкнено");
	}
	
	public void move() {
		System.out.println("Машина рухається");
	}
	
}
