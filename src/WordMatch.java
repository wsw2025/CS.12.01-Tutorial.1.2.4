public class WordMatch {

    String word;
    public WordMatch(String s){
        this.word = s;
    }

    public int scoreGuess(String guess){
        if(guess.length()==0){
            throw new IllegalArgumentException("Your guess cannot be an empty String!");
        }
        if(guess.length()>word.length()){
            throw new IllegalArgumentException("Your guess cannot exceed the number of characters in the Secret word");
        }
        int i = 0;
        int cnt = 0;
        while(true){
            i = word.indexOf(guess, i);
            if(i!=-1){
                cnt++;
                i++;
            }else{
                break;
            }
        }
        return cnt*guess.length()*guess.length();
    }

    public String findBetterGuess(String a, String b){
        if(scoreGuess(a)>scoreGuess(b)){
            return a;
        }if(scoreGuess(b)>scoreGuess(a)){
            return b;
        }
        if(a.compareTo(b)>0){
            return a;
        }else{
            return b;
        }
    }
}
