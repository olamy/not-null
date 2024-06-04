package org.eclipse.jetty;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{

    private Random random = new Random();

    @Nullable
    public String getFoo() {
        if (true) {
            return null;
        }
        return "Foo";
    }

    @NonNull
    public String getBar() {
        if (random.nextBoolean()) {
            return null;
        }
        return "Bar";
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
