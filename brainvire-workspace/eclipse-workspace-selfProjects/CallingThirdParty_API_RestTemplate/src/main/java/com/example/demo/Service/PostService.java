package com.example.demo.Service;

import java.util.List;
import java.util.Map;

public interface PostService {

	//For unknown quantity of data make it generic
	List<Map<String, Object>> getPost();
}
