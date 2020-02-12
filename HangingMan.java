 

public class HangingMan {

    private int WrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|\n"+
                    "|\n"+
                    "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|    +\n"+
                    "|\n"+
                    "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|    +-\n"+
                    "|\n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|\n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|   / \n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|   / \\\n"+
                    "/\\\n",
    };

    public HangingMan(){
        WrongGuesses = 0;
    }

    public boolean isntDead(){
        return WrongGuesses < 5; //not dead?
    }

    public void show(){
        System.out.println(HangmanImage[WrongGuesses]);
    }

    public void dieSomeMore(){
        WrongGuesses++;
    }
}
