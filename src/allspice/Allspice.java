package allspice;

import javax.jws.WebService;

@WebService
public class Allspice {
	public String Hello(String s){
		return "Hello " + s;
	}
}
