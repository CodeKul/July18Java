package abstraction.abstractdemo;

public class Cricket extends AbsSports{
    @Override
    public void play() {

    }

    public static void main(String[] args) {

        Cricket obj =  new Cricket();
        obj.show();
        obj.play();
    }
}

/**
 *         abstract class                                        interface
 *
 *   1. abstract class uses abstract keyword                     uses interface keyword
 *
 *   2. we can use private,protected,default with methods        only public methods allowed
 *
 *   3. declared and defined both methods                        only declared
 *
 *   4. partial abstraction                                       100% abstraction
 */