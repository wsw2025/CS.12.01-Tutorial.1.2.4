# CS.12.01-Tutorial.1.2.4

This question involves the WordMatch class, which stores a secret string and provides methods that compare other strings to the secret string. You will write two methods in the WordMatch class. 

public class WordMatch 
{ 

/**The secret string.*/ 
private String secret; 

/**Constructs a WordMatch object with the given secret string of lowercase letters.*/ 
public WordMatch(String word) 
{ 
/*implementation not shown*/ 
} 

/**Returns a score for guess, as described in part(a). 
 *Precondition: 0 < guess.length() <= secret.length() 
 */ 
public int scoreGuess(String guess) 
{ /*to be implemented in part(a)*/ } 

/**Returns the better of two guesses, as determined by scoreGuess and the rules for a 
 *tie-breaker that are described in part (b). 
 *Precondition: guess 1 and guess 2 contain all lowercase letters. 
 *guess1 is not the same as guess 2. 
 */ 
public String findBetterGuess(String guess1, String guess2) 
{  /*to be implemented in part(b)*/ } 

}

Write the WordMatch method scoreGuess. To determine the score to be returned, scoreGuess finds the number of times that guess occurs as a substring of secret and then multiplies that number by the square of the length of guess. Occurrences of guess may overlap within secret. 

Assume that the length of guess is less than or equal to the length of secret and that guess is not an empty string. 

The following examples show declarations of a WordMatch object. The tables show the outcomes of some possible calls to the scoreGuess method. 

WordMatch game = new WordMatch("mississippi");

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.4/assets/57818506/9515fda8-bf0e-436b-92e1-1ec5746a774f)

WordMatch game = new WordMatch("aaaabb");

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.4/assets/57818506/56cf2af7-e56d-406a-bea4-69c76065a5e7)

Write the WordMatch method findBetterGuess, which returns the better guess of its two String parameters, guess1 and guess2. If the scoreGuess method returns different values for guess1 and guess2, then the guess with the higher score is returned. If the scoreGuess method returns the same value for guess1 and guess2, then the alphabetically greater guess is returned. 

The following example shows a declaration of a WordMatch object and the outcomes of some possible calls to the scoreGuess and findBetterGuess methods.

WordMatch game = new WordMatch(“concatenation”);

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.4/assets/57818506/e3c1bf6a-ae81-468e-ad84-6d730f58cede)

Write the complete WordMatch class, including the constructor and any required instance variables and methods. Your implementation must pass all of the tests in the WordMatchTest class (provided).


