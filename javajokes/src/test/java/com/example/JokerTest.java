package com.example;

import org.junit.Test;

/**
 * Created by Moustafa.Mamdouh on 7/8/2017.
 */

public class JokerTest {
    @Test
    public void test() {
        Joker joker = new Joker();
        assert joker.getJoke().length() != 0;
    }
}
