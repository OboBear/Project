package boki.client.webService;

import java.net.MalformedURLException;

import boki.server.webService.Calculator;

import com.caucho.burlap.client.BurlapProxyFactory;

public class CalClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws MalformedURLException {
		String url = "http://127.0.0.1:8888/Hessian/calc.xsp";
		
		BurlapProxyFactory factory = new BurlapProxyFactory();
		
		Calculator calc = (Calculator) factory.create(Calculator.class, url);
		
		int a = 3, b = 6;
		
		System.out.println("add() = " + calc.add(a, b));
		System.out.println("sub() = " + calc.sub(a, b));
		System.out.println("div() = " + calc.div(a, b));
		System.out.println("mul() = " + calc.mul(a, b));
	}
}
