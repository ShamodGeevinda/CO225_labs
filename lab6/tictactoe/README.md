5*5 TICTACTOE GAME USING MVC DESIGN PATTERN

This project includes the implementation of basic java programming to create the game called Tic-tac-toe using the MVC approach. MVC stands for model, view and controller.


Model: Models includes various states of data which are required to determine if the user wins or not. Model does not have any access to view and controller. 


View: It includes necessary UI and few logic for game to interact with user.


Controller: Controller has the interaction to both view and model.

PROJECT DESIGN FLOW
There are four different classes and all of them have specific funtions:

Main Class:
The main class generate the instance of the controller, view and model classes.

Game View Class:
 The game starts with view class generating necessary UI and the buttons for UI control, through the various predefined library such as JFrame, GridLayout and Jbutton. It also contains the methods like TestWinner and updateGameState to check for every input’s user gives.
 
Game Model Class:
The major role played by this class is to count the number of clicks passed by the user. It also responsible for determining which turns of player i.e. X or O). 

Game Controller Class: 
The ActionListener and actionPerformed in Controller listen the various click events from the view class and number of click event from model class. 

Game Description for User
There will be two players: X and O. Their turn is displayed alternately. As soon as one player wins the game or the total click counts become 25, the button becomes disabled. 
