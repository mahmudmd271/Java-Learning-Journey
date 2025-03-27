package BasicOfJava;

public class VolumeOfASphere {
    public static void main(String[] args) {
        double r = 5;
        double pi = 3.14;
        double div = 4.0/3.0;
        double a = div*pi*r*r*r;
        System.out.print("Volume of the sphere is: ");
        System.out.println(a);
    }
}
/*
    Another way:

    a = ((double)4 / 3) * pi * (r * r * r);
*/