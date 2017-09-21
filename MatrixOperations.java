import java.util.ArrayList;


public class MatrixOperations {

	public static Matrix addMatrix(Matrix matrix1, Matrix matrix2){
		Matrix resultantMatrix = new Matrix("Resultant Matrix", matrix1.getRows(), matrix1.getColumns());
		ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < matrix1.getRows(); i++){
			matrixList.add(new ArrayList<Integer>());				
		}
		
		System.out.println("Result of addition: ");
		for (int i = 0; i < matrix1.getRows(); i++){
			for (int j = 0; j < matrix1.getColumns(); j++){
				//matrixList.get(i).add(matrix1.getMatrixList().get(i).get(j) + matrix2.getMatrixList().get(i).get(j));
				System.out.print(matrix1.getMatrixList().get(i).get(j) + matrix2.getMatrixList().get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		resultantMatrix.setMatrixList(matrixList);
		
		return resultantMatrix;
	}
	
	public static Matrix subtractMatrix(Matrix matrix1, Matrix matrix2){
		
		Matrix resultantMatrix = new Matrix("Resultant Matrix", matrix1.getRows(), matrix1.getColumns());
		ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < matrix1.getRows(); i++){
			matrixList.add(new ArrayList<Integer>());				
		}
		
		System.out.println("Result of subtraction: ");
		for (int i = 0; i < matrix1.getRows(); i++){
			for (int j = 0; j < matrix1.getColumns(); j++){
				//matrixList.get(i).add(matrix1.getMatrixList().get(i).get(j) - matrix2.getMatrixList().get(i).get(j));
				System.out.print((matrix1.getMatrixList().get(i).get(j) - matrix2.getMatrixList().get(i).get(j)) + " ");

			}
		}
		
		resultantMatrix.setMatrixList(matrixList);
		
		return resultantMatrix;
	}
	
	public static Matrix multiplyMatrix(Matrix matrix1, Matrix matrix2){
		Matrix resultantMatrix = new Matrix("Resultant Matrix", matrix1.getRows(), matrix1.getColumns());
		ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
		
		/*for (int i = 0; i < matrix1.getRows(); i++){
			for (int j = 0; j < matrix2.getColumns(); j++){
				matrixList.get(j).add(matrix1.getMatrixList().get(i).get(j) * matrix2.getMatrixList().get(j).get(i));
				
			}
		}*/
		
		

		for (int i = 0; i < matrix1.getRows(); i++){
			matrixList.add(new ArrayList<Integer>());				
		}
		
		for (int i = 0; i < matrix1.getRows(); i++) { // aRow
            for (int j = 0; j < matrix2.getColumns(); j++) { // bColumn
                for (int k = 0; k < matrix1.getColumns(); k++) { // aColumn
                	matrixList.get(i).add(matrix1.getMatrixList().get(i).get(k) * matrix2.getMatrixList().get(k).get(j));
                    //C[i][j] += matrix1.getMatrixList().get(i).get(k) * matrix2.getMatrixList().get(k).get(j);
                	System.out.print(matrix1.getMatrixList().get(i).get(k) * matrix2.getMatrixList().get(k).get(j) + " ");
                }
            }
        }
		
		resultantMatrix.setMatrixList(matrixList);
		
		return resultantMatrix;
	}
	
	public static Matrix scalerMultiply(Matrix matrix, int number){
		Matrix resultantMatrix = new Matrix("Resultant Matrix", matrix.getRows(), matrix.getColumns());
		ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < matrix.getRows(); i++){
			matrixList.add(new ArrayList<Integer>());				
		}
		
		System.out.println("Result of scaler multiplication: ");
		for (int i = 0; i < matrix.getRows(); i++){
			for (int j = 0; j < matrix.getColumns(); j++){
				matrixList.get(i).add(matrix.getMatrixList().get(i).get(j) * number);
				System.out.print(matrix.getMatrixList().get(i).get(j) * number + " ");
			}
		}
		resultantMatrix.setMatrixList(matrixList);
		
		return resultantMatrix;
		
	}
	
	public static void transposeMatrix(Matrix matrix){
		System.out.println("Result of transpose:");

		for (int i = 0; i < matrix.getRows(); i++){
			for (int j = 0; j < matrix.getColumns(); j++){
				System.out.print(matrix.getMatrixList().get(j).get(i) + " "); 
			}
			System.out.println();
		}
	}
	public static void printMatrix(Matrix matrix){
		for (int i = 0; i < matrix.getRows(); i++){
			for (int j = 0; j < matrix.getColumns(); j++){
				System.out.print(matrix.getMatrixList().get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
