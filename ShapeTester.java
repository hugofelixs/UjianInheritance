package inheritance3;

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Select To Continue :");
        System.out.println("1. Rectangle\n2. Circle\n3. Cube");
        int pilihan = s.nextInt();
        s.nextLine();

        if (pilihan == 1) {
            System.out.println("==Rectangle==");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Length :");
            int length = s.nextInt();
            System.out.println("Width :");
            int width = s.nextInt();
            Rectangle r1 = new Rectangle(name, color, length, width);
            r1.print();
            System.out.println("Luas\t: " + length * width);
        } else if (pilihan == 2) {
            double phi = 3.14;
            System.out.println("==Circle==");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Radius :");
            int radius = s.nextInt();
            Circle c1 = new Circle(name, color, radius);
            c1.print();
            System.out.println("Luas\t: " + radius * radius * phi);
        } else if (pilihan == 3) {
            System.out.println("==Cube==");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Length :");
            int length = s.nextInt();
            System.out.println("Width :");
            int width = s.nextInt();
            System.out.println("Height :");
            int height = s.nextInt();
            Cube b1 = new Cube(name, color, length, width, height);
            b1.print();
            System.out.println("Luas\t: " + length * width * height);
        }s.close();
    }
}
