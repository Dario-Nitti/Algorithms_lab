package Eserizi_miei2;

import java.security.PublicKey;
import java.util.*;

public class Playlist {

    Queue<Canzone> playlist = new PriorityQueue<>();

    public void insert(Canzone canzone) {
        for (Canzone c : playlist)
            if (!playlist.contains(canzone)) {
                playlist.add(canzone);
            } else {
                return;
            }
    }

    public void deleteoccorrenze(Canzone canzone) {
        playlist.removeIf(canzone::equals);
    }

    public boolean contains(Canzone canzone) {
        return playlist.contains(canzone);
    }

    public TreeSet<Canzone> ordinealfabetico(){
        TreeSet<Canzone> ordinata = new TreeSet<>();
        for(Canzone c: playlist) {
            ordinata.add(c);
        }
        return ordinata;
    }

    public Playlist nuovaplaylist(int durata){
        Playlist playlist_minuto= new Playlist();
        for(Canzone c :playlist)
            if(c.getDurata()<=durata)
                playlist_minuto.playlist.add(c);
            return playlist_minuto;
    }


    public static void main(String[] args) {
            Playlist playlist1 = new Playlist();
        Canzone c1 = new Canzone("loveisall", 500);
        Canzone c2 = new Canzone("igotyou", 560);
        Canzone c3 = new Canzone("Delia", 300);
        Canzone c4 = new Canzone("zelia", 300);
        Queue<Canzone> playlist = new PriorityQueue<>();
        int durata=360;
        playlist.add(c1);
        playlist.add(c2);
        playlist.add(c3);
        playlist.add(c4);
        Playlist playlist_minuto= new Playlist();
        for(Canzone c :playlist)
            if(c.getDurata()<=durata)
                playlist_minuto.playlist.add(c);
        System.out.println(playlist_minuto.playlist);
    }
}