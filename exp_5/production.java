public class production {
    public static void main(String[] args) {
        Play p1 = new Play();
        Play p2 = new Play();
        Play p3 = new Play();

        Musical m1 = new Musical("Samarth","Naman");
        Musical m2 = new Musical("abc", "xyz");

        System.out.println(m1.getComposer());
        System.out.println(m1.getLyricist());
        //Musical m2 = new Musical();



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