import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void typeTriangle1() {
//        int sideA=2;
//        int sideB=2;
//        int sideC=2;
//
//        int[] arr={2,2,2};
        String expected= "It is a equilateral Triangle";
        String result=TriangleClassifier.typeTriangle(2,2,2);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void typeTriangle2() {
//        int sideA=3;
//        int sideB=4;
//        int sideC=5;
//
//        int[] arr={3,4,5};
        String expected= "It is a normal Triangle";
        String result=TriangleClassifier.typeTriangle(3,4,5);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void typeTriangle3() {
//        int sideA=8;
//        int sideB=2;
//        int sideC=3;
//
//        int[] arr={8,2,3};
        String expected= "It is not a Triangle";
        String result=TriangleClassifier.typeTriangle(8,2,3);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void typeTriangle4() {
//        int sideA=-1;
//        int sideB=2;
//        int sideC=1;
//
//        int[] arr={-1,2,1};
        String expected= "It is not a Triangle";
        String result=TriangleClassifier.typeTriangle(-1,2,1);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void typeTriangle5() {
//        int sideA=0;
//        int sideB=1;
//        int sideC=1;
//
//        int[] arr={0,1,1};
        String expected= "It is not a Triangle";
        String result=TriangleClassifier.typeTriangle(0,1,1);
        assertEquals(expected,result);
    }


}