package OOP.t_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Game {
    private final int NUMBER_LENGTH = 4;
    private final int MAX_ATTEMPTS = 10;

    private List<String> history;
    private String secretNumber;
    private int attempts;

    public Game() {
        history = new ArrayList<>();
        secretNumber = generateSecretNumber();
        attempts = 0;
    }

    private String generateSecretNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        while (sb.length() < NUMBER_LENGTH) {
            int digit = random.nextInt(10);
            if (sb.indexOf(String.valueOf(digit)) == -1) {
                sb.append(digit);
            }
        }

        return sb.toString();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to the Bulls and Cows game!");

        while (!gameOver) {
            System.out.print("Enter your guess (a " + NUMBER_LENGTH + "-digit number): ");
            String guess = scanner.nextLine();

            if (guess.equalsIgnoreCase("history")) {
                printHistory();
                continue;
            } else if (guess.equalsIgnoreCase("restart")) {
                restartGame();
                continue;
            }

            if (isValidGuess(guess)) {
                String result = checkGuess(guess);
                System.out.println(result);
                history.add(guess + " - " + result);
                attempts++;

                if (result.equals("4 bulls")) {
                    System.out.println("Congratulations! You guessed the secret number in " + attempts + " attempts.");
                    gameOver = true;
                } else if (attempts >= MAX_ATTEMPTS) {
                    System.out.println("Game over! You have reached the maximum number of attempts.");
                    System.out.println("The secret number was: " + secretNumber);
                    gameOver = true;
                }
            } else {
                System.out.println("Invalid guess. Please enter a " + NUMBER_LENGTH + "-digit number.");
            }
        }
    }

    private boolean isValidGuess(String guess) {
        if (guess.length() != NUMBER_LENGTH) {
            return false;
        }

        for (char c : guess.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    private String checkGuess(String guess) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < NUMBER_LENGTH; i++) {
            char digit = guess.charAt(i);

            if (digit == secretNumber.charAt(i)) {
                bulls++;
            } else if (secretNumber.indexOf(digit) != -1) {
                cows++;
            }
        }

        return bulls + " bulls, " + cows + " cows";
    }

    private void printHistory() {
        System.out.println("Game history:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }

    private void restartGame() {
        history.clear();
        secretNumber = generateSecretNumber();
        attempts = 0;
        System.out.println("New game started. Guess the new secret number!");
    }
}
