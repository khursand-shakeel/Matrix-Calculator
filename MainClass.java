import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

	private static Matrix matrix1;
	private static Matrix matrix2;

	public static void main(String[] args) {
				
		fillUpMatrices();
		Scanner input = new Scanner(System.in);
		/*for (int i = 0; i < 2; i++){
			for (int j = 0; j < 2; j++){
				System.out.print(matrix1.getMatrixList().get(i).get(j) + " ");
			}
			System.out.println();
		}*/
		

		System.out.println("Please enter an equation you want to have evaluated:");
		String equation = input.nextLine();
		String stringArray[] = equation.split(" ");
		//System.out.println(stringArray[0] + " "+ stringArray[1] + " " + stringArray[2]);
		
		if (equation.contains("+")){
			//System.out.println("+ if:");
			Matrix resultantMatrix = MatrixOperations.addMatrix(figureOutMatrix(stringArray[0]), figureOutMatrix(stringArray[2]));
		}
		else if(equation.contains("-")){
			Matrix resultantMatrix = MatrixOperations.subtractMatrix(figureOutMatrix(stringArray[0]), figureOutMatrix(stringArray[2]));
		}
		else if(equation.contains("*")){
			Matrix resultantMatrix = MatrixOperations.multiplyMatrix(figureOutMatrix(stringArray[0]), figureOutMatrix(stringArray[2]));
		}
		else if(equation.contains("@")){
			System.out.print("Enter a scaler: ");
			int number = input.nextInt();
			Matrix resultantMatrix = MatrixOperations.scalerMultiply(figureOutMatrix(stringArray[0]), number);
		}
		
		else if(equation.contains("#")){
			MatrixOperations.transposeMatrix(figureOutMatrix(stringArray[0]));
		}

	} //main ends
	
	private static Matrix figureOutMatrix(String nameString){
		
		if (matrix1.getName().equals(nameString)){
			return matrix1;
		}
		else{
			return matrix2;
		}
	}
	private static void fillUpMatrices(){
		Scanner input = new Scanner(System.in);

		for (int k = 0; k < 2; k++){
			System.out.println("Please enter no of rows for the Matrix "+ (k + 1) + ":");
			int rows = input.nextInt();
			System.out.println("Please enter no of columns for the Matrix "+ (k + 1) + ":");
			int columns = input.nextInt();
			System.out.println("Now please name this matrix in any way you want:");
			String name = input.next();
			
			ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
			
			for (int i = 0; i < rows; i++){
				matrixList.add(new ArrayList<Integer>());				
			}
			
			System.out.println("Fill up the matrix "+name+" with integers:");
			
			for (int i = 0; i < rows; i++){
				for (int j = 0; j < columns; j++){
					matrixList.get(i).add(input.nextInt());
				}
			}
			
			if (k == 0){
				matrix1 = new Matrix(name, rows, columns, matrixList);
			}
			
			else{
				matrix2 = new Matrix(name, rows, columns, matrixList);
			}
														
		}
	}

}
