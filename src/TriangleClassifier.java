    public class TriangleClassifier {
        public static int sideA;
        public static int sideB;
        public static int sideC;

        public static String typeTriangle(int sideA,int sideB,int sideC) {
            if ((sideA <= 0) || (sideB <= 0) || (sideC <= 0)||((sideA+sideB)<sideC)||((sideA-sideB)>sideC)) {
                return "It is not a Triangle";
            } else if ((sideA == sideB) && (sideB == sideC)) {
                return "It is a equilateral Triangle";
            } else if ((sideA == sideB) && (sideB != sideC)) {
                return "It is a isosceles Triangle";
            } else if ((sideA != sideB) && (sideB != sideC) && (sideA != sideC)) {
                return "It is a normal Triangle";
            }
            return "";

        }
    }

