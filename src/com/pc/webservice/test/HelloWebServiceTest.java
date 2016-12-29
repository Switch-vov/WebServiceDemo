package com.pc.webservice.test;

import org.junit.Test;

import com.pc.webservice.client.HelloWebService;
import com.pc.webservice.client.HelloWebServiceService;

/**
 * WebService 测试类
 * 
 * @author Switch
 * @data 2016年12月21日
 * @version V1.0
 */
public class HelloWebServiceTest {
	@Test
	public void testHelloWebService() {
		// 对应于wsdl中的service
		HelloWebServiceService helloWebServiceService = new HelloWebServiceService();
		// 对应于wsdl中的port，创建代理对象
		HelloWebService proxy = helloWebServiceService.getHelloWebServicePort();
		// 使用代理对象，调用HelloWebService提供的服务
		// 输出：hello WebService
		System.out.println(proxy.helloWebService("WebService"));
	}
}
