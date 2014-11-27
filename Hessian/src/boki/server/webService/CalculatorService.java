package boki.server.webService;

import com.caucho.burlap.server.BurlapServlet;
// BurlapServlet支援使用xml格式
public class CalculatorService extends BurlapServlet implements Calculator {
	public int add(int a, int b) { return a + b; }
	public int sub(int a, int b) { return a - b; }
	public int div(int a, int b) { return a / b; }
	public int mul(int a, int b) { return a * b; }
}
