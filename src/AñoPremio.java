
public class AñoPremio {
	
	int año;
	String premio;
	
	
	
	public AñoPremio(int año, String premio) {
		this.año = año;
		this.premio = premio;
	}
	
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getPremio() {
		return premio;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	
	public String toString() {
		return año + "," + premio;
	}

}
