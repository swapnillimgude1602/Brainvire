package com.example.AnnotationsStub;

import java.util.List;

public interface UserRepository {

	List<User> findNewUsers(int days);

}
