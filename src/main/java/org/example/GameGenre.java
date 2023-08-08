package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameGenre {
    private List<Genre> genreList = new ArrayList<>();
    private String name; //название игры
    private int duration;  //продолжительность игры
    private Genre genre; //Жанр игры
    public GameGenre(Genre genre){
        this.genre = genre;
    }
    public void setDuration(int duration) //необходимо для определения бином
    {
        this.duration = duration;
    }

    public void setGenre(Genre genre) //необходимо для определения бином
    {
        this.genre = genre;
    }
    public void setName(String name)  //необходимо для определения бином
    {
        this.name = name;
    }
    public GameGenre(){}

    public void GamePlay(){
        System.out.println("At now i playing: " + genre.getGame());
    }


    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Genre getGenre() {
        return genre;
    }


    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public void showGenreList(){
        for (Genre genre: genreList){
            System.out.println("This game is:" + genre.getGame());
        }
    }
}
