package Day09.Test;

public class Food extends Product{

	String kcal;
	String taste;
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Food [kcal=" + kcal + ", taste=" + taste + "]";
	}
	
	
	
}
