package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		for(int i = 0; i < model.getWidth(); i++)
			System.out.print(""+i);
			
		System.out.println();
		for(int i = 0; i < model.getWidth(); i++){
			for(int j=0; j < model.getWidth(); j++){
				System.out.print(""+i);
				System.out.print(model.getMark(i,j));
			}
			System.out.println();
		}
    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		boolean player = model.isXTurn();
		if(player){
			System.out.println("Player 1 (X) Move:");
			System.out.print("Enter the row and column numbers, separated by a space: ");
			player = false;
		}
		else{
			System.out.println("Player 2 (O) Move:");
			System.out.print("Enter the row and column numbers, separated by a space: ");
			player = true;
		}
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}