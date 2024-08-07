package com.example.Junit4.AnnotationStub;

import java.util.List;

public interface UserRepository {

	List<User> findNewUsers(int days);
}
