package com.pc.webservice.server;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * WebService Demo
 * 
 * @author Switch
 * @data 2016年12月21日
 * @version V1.0
 */
@WebService
public class HelloWebService {
	// 只有非static和非final的方式才能提交
	public String helloWebService(String name) {
		return "hello " + name;
	}

	public static void main(String[] args) {
		String address = "http://localhost:6166/hello";
		Object implementor = new HelloWebService();
		// 通过Endpoint发布WebService服务
		// 参数1：发布地址
		// 参数2：端点实现对象
		Endpoint.publish(address, implementor);
	}
}
