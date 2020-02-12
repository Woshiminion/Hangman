 

import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    private String puzzleKey;
    private boolean[] guessed;
    ArrayList<String> guesses;
    Puzzle() {
        puzzleKey = "Shuai";
        guessed = new boolean[puzzleKey.length()];
        guesses = new ArrayList<String>();
    }

    Puzzle(String key) {
        puzzleKey = key;
        guessed = new boolean[key.length()];
    }

    public void show() {
        
        
        for (int i = 0; i < guessed.length; i++) {
            if (guessed[i]) {
                System.out.print(puzzleKey.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        
        System.out.println();
        System.out.print("letters guessed: ");
        
        for(String str : guesses){
            System.out.print(str + ". ");
        }
    }

    public boolean isUnsolved() {
        for (boolean b : guessed) {
            if (!b)
                return true; //not solved
        }
        
        return false; //solved
    }

    public boolean makeGuess(String guess) {
        boolean ret = false;
        guesses.add(guess);
        
        for (int i = 0; i < puzzleKey.length(); i++) {
            if ((puzzleKey.charAt(i) + "").equals(guess)) {
                guessed[i] = true;
                ret = true;
            }
        }
        
        return ret;
    }

    public String getWord(){
        return puzzleKey;
    }
}

