package jsp_lol;

public class Champions implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	Integer id;
	String name;
	String description;
	Integer blue_essence_cost;
	Integer rp_cost;
	
	public Champions(Integer id, String name, String description, Integer blue_essence_cost, Integer rp_cost) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.blue_essence_cost = blue_essence_cost;
		this.rp_cost = rp_cost;
		}
	
	public Integer getChampId() {
		return id;
	}
	
	public String getChampName() {
		return name;
	}
	
	public String getChampDesc() {
		return description;
	}
	
	public Integer getChampBECost() {
		return blue_essence_cost;
	}
	
	public Integer getChampRPCost() {
		return rp_cost;
	}
	
	
	public void setChampId(Integer id) {
		this.id = id;
	}
	
	public void setChampName(String name) {
		this.name = name;
	}
	
	public void setChampDesc(String description) {
		this.description = description;
	}
	
	public void setChampBECost(Integer blue_essence_cost) {
		this.blue_essence_cost = blue_essence_cost;
	}
	
	public void setChampRPCost(Integer rp_cost) {
		this.rp_cost = rp_cost;
	}
}
