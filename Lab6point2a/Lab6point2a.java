
// ****************************************************************

// Square.java

//

// Define a Square class with methods to create and read in

// info for a square matrix and to compute the sum of a row,

// a col, either diagonal, and whether it is magic.

//         

// ****************************************************************

 

public class Lab6point2a

{

 

    int[][] square;

 

    //--------------------------------------

    //create new square of given size

    //--------------------------------------

    public void Square(int size)
    {

 	square = new int[size][size];

    }

 

 

    //--------------------------------------

    //return the sum of the values in the given row

    //--------------------------------------

    public int sumRow(int row)

    {
    int y = row;
	int sum = 0;
 	for (int x= 0;x<square.length;x++)
 		sum = sum + square[y][x];
 		

    }

 

 

    //--------------------------------------

    //return the sum of the values in the given column

    //--------------------------------------

    public int sumCol(int col)

    {

 

    }

 

    //--------------------------------------

    //return the sum of the values in the main diagonal

    //--------------------------------------

    public int sumMainDiag()

    {

 

    }

 

    //--------------------------------------

    //return the sum of the values in the other ("reverse") diagonal

    //--------------------------------------

    public int sumOtherDiag()

    {

 

    }

 

    //--------------------------------------

    //return true if the square is magic (all rows, cols, and diags have

    //same sum), false otherwise

    //--------------------------------------

    public boolean magic()

    {

 

    }

 

    //--------------------------------------

    //read info into the square from the standard input.

    //--------------------------------------

    public void readSquare()

    {

    for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col++)
                square[row][col] = GetInfo.getInt("Enter row "+ row + " column " + col);
                

    }

 

    //--------------------------------------

    //print the contents of the square, neatly formatted

    //--------------------------------------

    public void printSquare()

    {
 

    }

 

}

 

