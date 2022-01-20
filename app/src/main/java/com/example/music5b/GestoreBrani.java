package com.example.music5b;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> listaBrani;
    public GestoreBrani(){
        listaBrani = new ArrayList<Brano>();

    }
    public void addBrano(Brano nb){

        listaBrani.add(nb);
    }
}
