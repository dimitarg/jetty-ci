package com.novarto.coverage_example.systest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.junit.Test;

public class ServletTest {
	
	@Test
	public void fooServlet() throws ClientProtocolException, IOException {
		System.out.println(Request.Get("http://localhost:8080/foo").execute().returnContent().asString());
	}
}
