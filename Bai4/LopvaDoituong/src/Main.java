import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap rong");
        double width = scanner.nextDouble();
        System.out.println("nhap dai");
        double height = scanner.nextDouble();
        Hinhchunhat hinhchunhat = new Hinhchunhat(width, height);
        System.out.println("Hinh chu nhat:" + hinhchunhat.display());
        System.out.println("chuvi hinhchunhat:" + hinhchunhat.getPerimeter());
        System.out.println("dientich hinhchunhat:" + hinhchunhat.getArea());
    }
}
