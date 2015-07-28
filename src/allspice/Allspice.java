package allspice;

import javax.jws.WebService;

@WebService
public class Allspice {
	
	public void constructor(){
		
	}
	
	public String Hello(String s){
		return "Hello " + s;
	}
}
