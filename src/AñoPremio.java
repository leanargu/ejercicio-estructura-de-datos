
public class A�oPremio {
	
	int a�o;
	String premio;
	
	
	
	public A�oPremio(int a�o, String premio) {
		this.a�o = a�o;
		this.premio = premio;
	}
	
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getPremio() {
		return premio;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	
	public String toString() {
		return a�o + "," + premio;
	}

}
