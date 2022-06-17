import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class production {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of plays: ");
        int n = sc.nextInt();
        Play[] arr1 = new Play[n];
        for (int i = 0; i <n ; i++) {
            arr1[i] = new Play();
            arr1[i].play();
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
        return super.getTitle() + " " + super.getDirector() + " "+ super.getWriter();
    }


}

class Musical extends Play{
    private String composer, lyricist;

    Musical(String newComposer, String newLyricist){
        this.composer = newComposer;
        this.lyricist = newLyricist;
    }

    String getComposer(){
        return composer;
    }

    String getLyricist(){
        return lyricist;
    }


}