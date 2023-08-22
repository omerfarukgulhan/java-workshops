
public class Problem {

    public static class Mathematics {

        public static void areaOfCircle(int radius) {
            System.out.println("Dairenin Alanı :" + (Math.PI * radius * radius));
        }

        public static void trianglePerimeter(int edge1, int edge2, int edge3) {

            System.out.println("Üçgenin Çevresi : " + (edge1 + edge2 + edge3));
        }

    }

    public static class Physics {

        public static void dotProduct(Vector vec1, Vector vec2) {

            int product = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println("Dot product of the " + vec1.getName() + " and " + vec2.getName() + " vectors=  " + product);

        }

    }

}
