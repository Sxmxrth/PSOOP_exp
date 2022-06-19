import java.util.Scanner;

public class production {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Play[] p = new Play[3];
        Musical[] m = new Musical[2];

        for (int i = 0; i <3 ; i++) {
            p[i] = new Play("abc", "abc", "abc");

            System.out.print("enter the Title of the play: ");
            String title = sc.nextLine();
            p[i].setTitle(title);

            System.out.print("enter the Director of the play: ");
            String director = sc.nextLine();
            p[i].setDirector(director);

            System.out.println("enter the Writer of the play: ");
            String writer = sc.nextLine();
            p[i].setWriter(writer);

            
        }
    }
}

class Production{
    private String title, director, writer;
    private int seats;

    Production(String title, String director, String writer){
        this.title=title;
        this.director=director;
        this.writer=writer;
    }

    void setSeats(int newSeats){
        seats = newSeats;
    }

    void setTitle(String newTitle){
        this.title = newTitle;
    }

    void setDirector(String newDirector){
        this.director = newDirector;
    }

    void setWriter(String newWriter){
        this.writer = newWriter;
    }

    String getTitle(){
        return title;
    }

    String getDirector() {
        return director;
    }

    String getWriter(){
        return writer;
    }

    int getSeats(){
        return seats;
    }
}

class Play extends Production{
    private int performances;
    Play(String title, String director, String writer){
        super(title, director, writer);
    }
}

class Musical extends Play{
    private String composer, lyricist;
    private int seats;

    Musical(String title, String director, String writer) {
        super(title, director, writer);
    }

    void setSeats(int newSeats){
        seats = newSeats;
    }


    void setComposer(String newComposer ){
        this.composer = newComposer;
    }

    void setLyricist(String newLyricist){
        this.lyricist = newLyricist;
    }

    String getComposer(){
        return composer;
    }

    String getLyricist(){
        return lyricist;
    }

    int getSeats(){
        return seats;
    }

}