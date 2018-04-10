package com.spectra.designpattern;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgjo on 2018. 4. 10..
 */
public class RandomSelection extends TestCase {

    public void testSelection()
    {
        String[] githubs = new String[]{
                "https://github.com/leesoomin/designpattern.git",
                "https://github.com/go4no/DesignPattern.git",
                "https://github.com/fjk1111/designpattern.git"
        };

        System.out.println(githubs[2]);
        List list = new ArrayList();

    }

}
