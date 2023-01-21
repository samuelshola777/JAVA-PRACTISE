package Chapter8;

import java.util.EnumSet;

public enum EnumBook {
    JHTP("JAVA HOW TO PROGRAM", "2018"),
    CHTP("C HOW TO PROGRAM","2016"),
    IW3HTP("Internet & World Wide Wibe How to Program ", "2012"),
    CPPHTP("C++ How to Program","2017"),
    VBHTP("Visual Basic How to Program","2014"),
    CSHARPHTP("Visual C# how to Program","2017");

    private final String title;
    private final String copyrightYear;

    EnumBook(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    public String getTitle(){
        return title;
    }
    public String getCopyrightYear(){
        return copyrightYear;
    }

    public static void main(String[] args) {

        for (EnumBook book: EnumBook.values()
             ) {
            System.out.printf("%-10s%-45s%s%n",book,
                    book.getTitle(), book.getCopyrightYear());

        }
        System.out.printf("%nDisplay a range of enum constants: %n");

        for (EnumBook book: EnumSet.range(EnumBook.JHTP, EnumBook.CPPHTP)
             ) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear() );
        }

    }

}
