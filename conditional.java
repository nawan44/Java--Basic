package basic;

public class conditional{

        // membuat variabel dan Scanner
        int value;
        String name;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("name: ");
        name = scan.nextLine();
        System.out.print("value: ");
        value = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( value >= 70 ) {
            System.out.println("Congrats " + name + ", You Passed!");
        } else {
            System.out.println("Sorry " + name + ", you failed");
        }

}

