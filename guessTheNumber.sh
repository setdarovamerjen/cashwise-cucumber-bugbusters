#!/bin/bash
# Guess the Number Game
# Generate a random number between 1 and 10
secret_number=$((RANDOM % 10 + 1))
# Introduction
echo "Welcome to the Guess the Number Game!"
echo "I have chosen a number between 1 and 10. Try to guess it!"
echo "You have three attempts."
echo "Let's get started."
echo
# Variables
attempts=0
# Main loop
while ((attempts < 3)); do
  # Prompt for a guess
  read -p "Enter your guess: " guess
  # Validate the guess
  if [[ ! $guess =~ ^[1-9]$|^10$ ]]; then
    echo "Invalid input. Please enter a number between 1 and 10."
    continue
  fi
  # Increment the number of attempts
  ((attempts++))
  # Check if the guess is correct
  if ((guess == secret_number)); then
    echo "Congratulations! You guessed the correct number in $attempts attempt(s)!"
    exit
  elif ((guess < secret_number)); then
    echo "Too low! Try again."
  else
    echo "Too high! Try again."
  fi
done
# Display the secret number
echo "Sorry, you couldn't guess the number. The secret number was $secret_number."
echo "Better luck next time!"
