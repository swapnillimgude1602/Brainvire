package com.example.demo.Service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExampleTest {
    
    @Test
    public void test1(){
        float actual = 12;
        Float expected = 12.0f;
        Assertions.assertThat(expected);
    }
}
