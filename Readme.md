## GuessNumber

## Tasking

Given Number: 1 2 3 4

1. Guess Number: 5 6 8 7  Output: 0A0B

2. Guess Number: 1 6 7 8  Output: 1A0B

3. Guess Number: 1 6 3 7  Output: 2A0B

4. Guess Number: 1 2 3 8  Output: 3A0B
 
5. Guess Number: 1 2 3 4  Output: 4A0B

6. Guess Number: 1 6 2 8  Output: 1A1B

7. Guess Number: 1 3 2 7  Output: 1A2B

8. Guess Number: 1 4 2 3  Output: 1A3B

9. Guess Number: 1 4 3 7  Output: 2A1B

10. Guess Number: 1 4 3 2  Output: 2A2B

11. Guess Number: 1 1 2 3  Output: Wrong Input, input again

12. Guess Number: 1 2      Output: Wrong Input, input again

13. Guess Number: 1 2 3    Output: Wrong Input, input again

14. Guess Wrong answer times <= 6, game continue;

15. Guess Wrong answer times > 6, game over;

16. Guess Number: 1 2 3 4   Output: 4A0B, Guess Correct, game over and show "Congratulations, you win!". 



## git commit issue

Question:

You are about to commit CRLF line separators to the Git repository.

It is recommended to set the core.autocrlf Git attribute to input and and avoid line separator issues.

_If you choose **Fix and Commit**, git config --global core.autocrlf input will be executed._

_If you choose **Commit as Is**, the config value won't be changed._

reference: https://blog.csdn.net/Kikitious_Du/article/details/79603444.
