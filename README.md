🎮 Two-Player Tic-Tac-Toe (Java Console App)
A simple Java-based Tic-Tac-Toe game for two players that runs in the console.
It allows players to enter moves alternately, checks for a win or draw after every move, and lets players play multiple rounds if desired.

📋 Features
->3x3 grid game board
->Two-player mode: X and O
->Input validation to avoid overwriting moves or entering invalid coordinates
->Win detection across rows, columns, and diagonals
->Draw detection when the board is full
->Option to replay after a game ends

🛠️ Skills Demonstrated
->2D Arrays (board representation)
->Loops (while, for)
->Conditional statements (if-else)
->Input handling with Scanner
->Console output formatting
->Logical operations for game state tracking

📂 File Structure
TicTacToe/
├── TicTacToe.java
└── README.md

🚀 How to Run
1.Save the code to a file named TicTacToe.java.
2.Open a terminal or command prompt and compile the program:
             javac TicTacToe.java
3.Run it:
        java TicTacToe
        
💡 Sample Gameplay
=== Welcome to Tic-Tac-Toe ===

Current Board:
   |   |   
---+---+---
   |   |   
---+---+---
   |   |   

Player X, enter your move (row and column 1-3): 1 1

Current Board:
 X |   |   
---+---+---
   |   |   
---+---+---
   |   |   

Player O, enter your move (row and column 1-3): 2 2
...

Player X wins!
Do you want to play again? (y/n): y

->Handles invalid input:
Player O, enter your move (row and column 1-3): 1 1
That cell is already taken. Try again.

🎯 Game Rules
->Players take turns placing X and O on a 3×3 grid.
->The first to get 3 of their marks in a row, column, or diagonal wins.
->If all 9 cells are filled and no one wins, it’s a draw.
->After a win or draw, players can choose to play again.
