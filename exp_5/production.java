import java.util.Scanner;

public class production {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Play[] p = new Play[3];
        Musical[] m = new Musical[2];

        for (int i = 0; i <3 ; i++) {
            p[i] = new Play("abc", "abc", "abc");
            p[i].updatePerformances();

            System.out.print("enter the Title of the play: ");
            String title = sc.nextLine();
            p[i].setTitle(title);

            System.out.print("enter the number of seats: ");
            int seats = sc.nextInt();
            p[i].setSeats(seats);

            sc.skip("\\R");
            System.out.print("enter the Director of the play: ");
            String director = sc.nextLine();
            p[i].setDirector(director);

            System.out.print("enter the Writer of the play: ");
            String writer = sc.nextLine();
            p[i].setWriter(writer);

        }

        for (int i = 0; i <2 ; i++) {
            m[i] = new Musical("abc", "abc", "abc");
            m[i].updatePerformances();

            System.out.print("enter the Title of the musical: ");
            String title = sc.nextLine();
            m[i].setTitle(title);

            System.out.print("enter the number of seats: ");
            int seats = sc.nextInt();
            m[i].setSeats(seats);


            sc.skip("\\R");

            System.out.print("enter the Director of the musical: ");
            String director = sc.nextLine();
            m[i].setDirector(director);

            System.out.print("enter the Writer of the musical: ");
            String writer = sc.nextLine();
            m[i].setWriter(writer);

            System.out.print("enter the name of the composer: ");
            String composer = sc.nextLine();
            m[i].setComposer(composer);

            System.out.print("enter the name of the lyricist: ");
            String lyricist = sc.nextLine();
            m[i].setLyricist(lyricist);
        }

        int t1=0,p1=0;
        for (int i = 0; i <3 ; i++) {
            t1=t1+(p[i].getSeats())*500;
            p1=p1+(p[i].getPerformances());
        }

        int t2=0,p2=0;
        for (int i = 0; i <2 ; i++) {
            t2=t2+(m[i].getSeats())*800;
            p2=p2+(p[i].getPerformances());
        }

        System.out.println("the total number of performances are "+ (p1+p2));
        System.out.println("the total box office collection is "+(t1+t2));

    }
}

class Production{
    private String title, director, writer;

    Production(String title, String director, String writer){
        this.title=title;
        this.director=director;
        this.writer=writer;
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
}

class Play extends Production{
    private int performances, seats;
    Play(String title, String director, String writer){
        super(title, director, writer);
    }

    void updatePerformances(){
        performances++;
    }

    int getPerformances(){
        return performances;
    }

    void setSeats(int newSeats){
        seats = newSeats;
    }

    int getSeats(){
        return seats;
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