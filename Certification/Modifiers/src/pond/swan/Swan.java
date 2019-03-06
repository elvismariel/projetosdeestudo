package pond.swan;

import pond.shore.Bird;                     // In different package tha Bird

/**
 *
 * @author elvis
 */
public class Swan extends Bird {            // But subclass of Bird

    public void swim() {
        floatInWater();                     // Package access to superclass
        System.out.println(text);           // Package access to superclass
    }
    
    public void helpOtherSwanSwin(){
        Swan other = new Swan();
        other.floatInWater();               // Package access to superclass
        System.out.println(other.text);     // Package access to superclass
    }
    
    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        other.floatInWater();               // Does Not Compile
        System.out.println(other.text);     // Does Not Compile
    }
}

// This works for extends but not for another package