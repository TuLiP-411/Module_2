public class Test {
    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        System.out.println(p2.toString());
        p2.setXY(34.2f, 44.1f);
        System.out.println(p2.toString());

        Point2D p3 = new Point3D();
        System.out.println(p3.toString());
        System.out.println(p3 instanceof Point2D);
        System.out.println(p3 instanceof Point3D);
        Point3D p4 = (Point3D) p3;
        p4.setXYZ(3.4f, 45.6f, 3443.4f);
        System.out.println(p4.getXYZ());
        System.out.println(p4.toString());
    }

}
