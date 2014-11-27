package boki.server.webService;

import com.caucho.hessian.server.HessianServlet;

// The service implementation can be a plain-old Java object (POJO) 
// or can extend HessianServlet to make the servlet-engine configuration trivial
public class BasicService extends HessianServlet implements BasicAPI {
	private String _greeting = "Hello, world";
		
	public void setGreeting(String greeting) {
		_greeting = greeting;
	}
	
	public String getGreeting() {
		return _greeting;
	}
	
	public String hello() {
		return _greeting;
	}
}
