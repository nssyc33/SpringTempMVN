package Spring.io.Controller;

public class TestVo {

	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String callTest(){
		return "syc_test";
	}
}