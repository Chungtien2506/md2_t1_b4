import java.util.Scanner;
    class Hinhchunhat {
        double width, height;
        public Hinhchunhat(double width, double height) {
            this.width = width;
            this.height = height;
        }


        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Hinhchunhat";
        }
    }

