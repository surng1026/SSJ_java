package Day09.Test;

public class Cloth extends Product{

	String Color;
	String Size;
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	@Override
	public String toString() {
		return "Cloth [Color=" + Color + ", Size=" + Size + "]";
	}
	
	
	
}
