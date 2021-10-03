package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

/*
Print "Let's play Guess the Number!"
Prompt "IEnter the difficulty level (1, 2, or 3): "
    save input into <difficulty>
do
    if difficulty = 1
        range = 10
    if difficulty = 2
        range = 100
    if difficulty = 3
        range = 1000
    <number> = random number [1-range]
    Prompt " I have my number. What's your guess?"
        save input into <guess>
    until correct count <tries>
        if guess > number
            prompt "Too high. Guess again:"
                save input into <guess>
        if guess < number
            print "Too low. Guess again:"
                save input into <guess>
        else
            Print You got it in <tries> guesses!
            Prompt "Do you wish to play again (Y/N)?"
                if input is y or Y
                    flag true
                else
                    flag false
while flag = false
*/
public class Solution32 {
}
