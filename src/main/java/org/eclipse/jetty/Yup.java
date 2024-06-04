package org.eclipse.jetty;

public class Yup {

    public void test() {
        App app = new App();
        String foo = app.getFoo().trim();
        System.out.println("foo:"+foo);
    }

}
