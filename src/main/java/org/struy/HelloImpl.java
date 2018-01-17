package org.struy;

/**
 * author with struy.
 * Create by 2018/1/17 13:18
 */

public class HelloImpl implements HelloApi {

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello World!"+name);
    }
}
