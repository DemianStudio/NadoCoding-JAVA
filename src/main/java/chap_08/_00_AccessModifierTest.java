package chap_08;

import chap_07.*;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";   // public
//        b1.resolrution = "FHD";   // default
//        b1.price = 200000;    // private
//        b1.color = "하양이";     // protected

        BlackBox b2;
    }
}
