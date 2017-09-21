import java.util.ArrayList;
import java.util.List;


public class Matrix {

	private ArrayList<ArrayList<Integer>> list;
	private int rows;
	private int columns;
	private String name;

	Matrix (String name, int rows, int columns){
		
	}
	
	Matrix (String name, int rows, int columns, ArrayList<ArrayList<Integer>> list){
		this.rows = rows;
		this.columns = columns;
		this.name = name;
		this.list = list;
	}	
	
	public void setMatrixList(ArrayList<ArrayList<Integer>> list){
		this.list = list;
	}
	
	public ArrayList<ArrayList<Integer>> getMatrixList(){
		return this.list;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getRows(){
		return this.rows;
	}
	
	public int getColumns(){
		return this.columns;
	}
}

//1: unit test for each operation such as proper dimensions for multiplication
//2: check answers for each operation
