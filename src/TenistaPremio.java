
public class TenistaPremio {

	String tenista;
	String premio;
	
	public String getTenista() {
		return tenista;
	}
	public void setTenista(String tenista) {
		this.tenista = tenista;
	}
	public String getPremio() {
		return premio;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	
	public TenistaPremio(String tenista, String premio) {
		super();
		this.tenista = tenista;
		this.premio = premio;
	}
	
	public String toString() {
		return "Tenista: " + tenista + " Premio: " + premio;
	}

}
