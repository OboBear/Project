package boki.client.webService;

import boki.server.webService.BasicAPI;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianClient {
	public static void main(String[] args) throws Exception {
		String url = "http://127.0.0.1:8888/Hessian/hello.xsp";
		
		HessianProxyFactory factory = new HessianProxyFactory();
		
		BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);
		
		System.out.println("hello(): " + basic.hello());
	}
}
