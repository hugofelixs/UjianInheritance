package inheritance3;

import java.util.Scanner;

public class ShapeTesterArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Data:");
        int data = in.nextInt();

        System.out.println("Pilihlah Salah Satu");
        System.out.println();
        System.out.println("1. Rectangle\n2. Circle\n3. Cube");
        int pilihan = in.nextInt();
        in.nextLine();

        Shape s[] = new Shape[10];


        for (int i = 1; i <= data; i++) {
            switch (pilihan) {
                case 1:
                System.out.println("==Rectangle==");
                System.out.println("Name :");
                String name = in.nextLine();
                System.out.println("Color :");
                String color = in.nextLine();
                System.out.println("Length :");
                int length = in.nextInt();
                System.out.println("Width :");
                int width = in.nextInt();
                s[0] = new Rectangle(name, color, length, width);
                s[0].print();
                System.out.println("Luas\t: " + length * width);
                    break;
                
                case 2:
                double phi = 3.14;
                System.out.println("==Circle==");
                System.out.println("Name :");
                String name2 = in.nextLine();
                System.out.println("Color :");
                String color2 = in.nextLine();
                System.out.println("Radius :");
                int radius = in.nextInt();
                s[1] = new Circle(name2, color2, radius);
                s[1].print();
                System.out.println("Luas\t: " + radius * radius * phi);
                    break;

                case 3:
                System.out.println("==Cube==");
                System.out.println("Name :");
                String name3 = in.nextLine();
                System.out.println("Color :");
                String color3 = in.nextLine();
                System.out.println("Length :");
                int length3 = in.nextInt();
                System.out.println("Width :");
                int width3 = in.nextInt();
                System.out.println("Height :");
                int height = in.nextInt();
                s[2] = new Cube(name3, color3, length3, width3, height);
                s[2].print();
                System.out.println("Luas\t: " + length3 * width3 * height);
                    break;

                default:
                    break;
            }in.close();
        }
    }
    
}
