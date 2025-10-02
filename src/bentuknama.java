public class bentuknama {
    public static void main(String[] args) {
        printF();
        System.out.println();
        printA();
        System.out.println();
        printI();
        System.out.println();
        printZ();
        System.out.println();

        

        }
    static void printF() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1) {
                    System.out.print("F");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printA() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((j == 1 || j == 5) && i != 1 || i == 1 && j > 1 && j < 5 || i == 4) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printI() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 7 || j == 3) {
                    System.out.print("I");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printZ() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 7 || i + j == 8) {
                    System.out.print("Z");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

