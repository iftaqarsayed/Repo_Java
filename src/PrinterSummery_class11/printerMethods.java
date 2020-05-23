package PrinterSummery_class11;

public class printerMethods {
    static int tonerLevel;
    static int pagesInTray;
    int maxPages = 100;
    int maxToner = 100;
    public int showToner(){
     return tonerLevel;
    }
    public int showPages() {
     return pagesInTray;
    }
    public void addToner(int toner) {
        if (toner>0 && tonerLevel<=maxToner) {
            if ((tonerLevel + toner) <= maxToner) {
                tonerLevel += toner;
            } else {
                System.out.println("more toner added than printer capacity");
            }
            } else {
            System.out.println("invalid toner to add");
        }
    }

    public void addPages(int pages) {
        if (pages>0 && pagesInTray<=maxPages) {
            if ((pages + pagesInTray) <= maxPages) {
                pagesInTray += pages;
            } else {
                System.out.println("more pages added than printer capacity");
            }
        } else {
                System.out.println("invalid pages to add");
            }
    }

    public void printPages(int print, String style) {
        if (style=="single" && tonerLevel>0 && pagesInTray>0) {
            pagesInTray -= print;
            tonerLevel -= print;
        } else if (style=="double" && tonerLevel>0 && pagesInTray>0) {
            if (print%2==0) {
                pagesInTray -= (print / 2);
                tonerLevel -= print;
            } else {
                pagesInTray -= ((print / 2)+1);
                tonerLevel -= print;
            }
        }
    }

    public void printerSummery(){
        System.out.println("pages= " + pagesInTray);
        System.out.println("toner=" + tonerLevel);
    }
    public void checkToner(){
        if (tonerLevel<=10) {
            System.out.println("Add toner");
        } else {
            System.out.println("Toner level is = " + tonerLevel);
        }
    }
    public void checkpages(){
        if (pagesInTray<=10) {
            System.out.println("Add pages");
        } else {
            System.out.println("Pages in tray is = " + pagesInTray);
        }
    }

}
