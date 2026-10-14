import java.util.Scanner;

class Parking {
    static Scanner sc = new Scanner(System.in);
    static String vehicle[][] = new String[2][3];
    static int hours[][] = new int[2][3];

    static void park() {
        System.out.print("Vehicle number: ");
        String v = sc.next();
        System.out.print("Hours: ");
        int h = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if (vehicle[i][j] == null) {
                    vehicle[i][j] = v;
                    hours[i][j] = h;
                    System.out.println("Floor " + (i+1) +
                                       ", Slot " + (j+1));
                    return;
                }
        System.out.println("Parking Full!");
    }

    static void remove() {
        System.out.print("Vehicle number: ");
        String v = sc.next();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if (v.equals(vehicle[i][j])) {
                    System.out.println("Fee = ₹" + hours[i][j] * 50);
                    vehicle[i][j] = null;
                    hours[i][j] = 0;
                    return;
                }
        System.out.println("Vehicle Not Found!");
    }

    static void status() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Floor " + (i+1) + ": ");
            for (int j = 0; j < 3; j++)
                System.out.print(vehicle[i][j] == null ? "Empty " :
                                 vehicle[i][j] + " ");
            System.out.println();
        }
    }
        public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1.Park 2.Remove 3.Status 4.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: park(); break;
                case 2: remove(); break;
                case 3: status(); break;
                case 4: System.out.println("Thank You"); break;
                default: System.out.println("Invalid");
            }
        } while (ch != 4);
    }
}


    

