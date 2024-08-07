package com.example.demo.ServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Service.PostService;

import lombok.val;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private RestTemplate restTemplate;

	String baseUrl = "https://jsonplaceholder.typicode.com/"; // fake data

	StringBuilder builder = new StringBuilder(baseUrl);

	String POST = "/posts";

	@Override
	public List<Map<String, Object>> getPost() {
		// TODO Auto-generated method stub
		// req for exchange method :
		// (url of third party, httpMethod-(get,post, put,patch, delete),
		// httpEntity(header and payload, Response type)

		HttpEntity<Void> httpEntity = new HttpEntity<Void>(getHttpHeaders());
		String url = builder.append(POST).toString();
		val response =  restTemplate.exchange(url, HttpMethod.GET, httpEntity, List.class);
		return response.getBody();
	}

	private HttpHeaders getHttpHeaders() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return httpHeaders;
	}

}
