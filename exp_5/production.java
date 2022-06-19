import java.util.Scanner;

public class production {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of plays: ");
        int n = sc.nextInt();
        System.out.println("enter the number of musical");
        int m = sc.nextInt();
        Play[] arr1 = new Play[n];
        Musical[] arr2 = new Musical[m];
        for (int i = 0; i <n ; i++) {
            arr1[i] = new Play();
            sc.skip("\\R");
            System.out.print("enter the name of the Play: ");
            String name = sc.nextLine();
            arr1[i].setTitle(name);
            System.out.print("enter the name of the Director: ");
            String director=sc.nextLine();
            System.out.print("enter the name of the Writer: ");
            arr1[i].setDirector(director);
            String writer = sc.nextLine();
            arr1[i].setWriter(writer);

            arr1[i].play();
            System.out.println(arr1[i]);
        }
        System.out.println("total cost of the seats for play are: "+(n*500));

        for (int i = 0; i <m ; i++) {
            arr2[i] = new Musical();
            System.out.print("enter the name of the Musical: ");
            String name = sc.nextLine();
            arr2[i].setTitle(name);
            System.out.print("enter the name of the Director: ");
            String director=sc.nextLine();
            arr2[i].setDirector(director);
            System.out.print("enter the name of the Writer: ");
            String writer = sc.nextLine();
            arr2[i].setWriter(writer);
            System.out.print("enter the name of the composer: ");
            String composer= sc.nextLine();
            arr2[i].setComposer(composer);
            System.out.println("enter the name of the lyricist");
            String lyricist = sc.nextLine();
            arr2[i].setLyricist(lyricist);


            System.out.println(arr2[i]);



        }

    }
}

class Production{
    private String title, director, writer;
    Production(){
        this.title="Lion King";
        this.director="John Favreau";
        this.writer="Sam";
    }

    public String toString(){
        return title + " " + director + " " + writer;
    }

    String getTitle(){
        return title;
    }
    String getDirector(){
        return director;
    }

    String getWriter(){
        return writer;
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
}

class Play extends Production{
    int performances=0;
    void play(){
        performances++;
    }
    public String toString(){
        return performances+ ", " + super.getTitle() + ", " + super.getDirector() + ", "+ super.getWriter();
    }
}

class Musical extends Play{
    private String composer, lyricist;

    String getComposer(){
        return composer;
    }

    String getLyricist(){
        return lyricist;
    }

    void setComposer(String newComposer){
        this.composer=newComposer;
    }

    void setLyricist(String newLyricist){
        this.lyricist=newLyricist;
    }

    public String toString(){
        return super.getTitle()+" "+ super.getDirector()+" "+ super.getWriter()+" "+getComposer()+" "+ getLyricist();
    }

}