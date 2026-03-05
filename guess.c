#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int generateRandomNumber(int min, int max)
{
 return ( rand() % (max -min+1))+ min;
}
int main(void){
    int secret_number, guess, attempts = 0;

    srand(time(NULL));
    printf("Welcome to my number guessing game\n");
    printf("Can you guess the number!\n");

    secret_number =generateRandomNumber(1,100);

    do {
        printf("Guess:");
        scanf("%d", & guess);
        attempts++;

        if (guess==secret_number)
        {
          printf("Congratulations!!, You guessed the number in %d attempts\n", attempts);
          break;
        }
        else if (guess> secret_number)
           {
            printf("Too High\n");
           }
        else
        {
          printf("Too low\n");
        }
               

    } while (1);
    
    
    return 0;
}