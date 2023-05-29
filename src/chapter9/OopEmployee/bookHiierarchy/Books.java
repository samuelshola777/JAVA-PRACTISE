package chapter9.OopEmployee.bookHiierarchy;

public class Books {


    private String title;
    private String yearOfPopulation;
    private String authorName;

    public Books() {
    }

    public Books(String title, String yearOfPopulation, String authorName) {
        this.title = title;
        this.yearOfPopulation = yearOfPopulation;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearOfPopulation() {
        return yearOfPopulation;
    }

    public void setYearOfPopulation(String yearOfPopulation) {
        this.yearOfPopulation = yearOfPopulation;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String toString(){
        return String.format("""
                BOOK TITLE --> %s\n
                
                YEAR OF POPULATION --->%S\n
                
                AUTHOR NAME -->%s
                
                
                """, getTitle(),getYearOfPopulation(),getAuthorName());

    }
}
