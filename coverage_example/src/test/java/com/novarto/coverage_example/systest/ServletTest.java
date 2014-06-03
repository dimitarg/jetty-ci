package com.novarto.coverage_example.systest;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.junit.Assert;
import org.junit.Test;

public class ServletTest {
	
	@Test
	public void fooServlet() throws ClientProtocolException, IOException {
		Response resp = Request.Get("http://localhost:8080/foo").execute();
		HttpResponse httpResp = resp.returnResponse();
		Assert.assertEquals(200, httpResp.getStatusLine().getStatusCode());
	}
}
