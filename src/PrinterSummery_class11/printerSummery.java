package PrinterSummery_class11;

public class printerSummery {
    public static void main(String[] args) {

        printerMethods p1 = new printerMethods();
        /*System.out.println(p1.addToner(10));
        System.out.println(p1.addToner(50));
        System.out.println(p1.printPages(15, "double"));
        */
        p1.addToner(50);
        System.out.println(p1.addToner(10));
        p1.addPages(45);
        p1.printerSummery();
        p1.addPages(2);
        p1.printerSummery();
        p1.printPages(7, "single");
        p1.printerSummery();
        p1.printPages(9, "double");
        p1.printerSummery();
        p1.checkToner();
        p1.printPages(25, "single");
        p1.checkToner();
        p1.printerSummery();
        p1.checkpages();
    }
}
