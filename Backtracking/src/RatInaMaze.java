
public class RatInaMaze {

	public static boolean ratInAmaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		return solvemaze(maze,0,0,path);
	}
	public static boolean solvemaze(int maze[][],int i, int j, int path[][]) {
		int n = maze.length;
		//Check if i, j cell is valid or not
		if(i<0 || i>=n || j<0||j>=n||maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		//Include the cell in current path
		path[i][j] = 1;
		//Destination Cell
		if(i == n-1 && j == n-1) {
			return true;
		}
		//Explore further in all directions
		//top
		if(solvemaze(maze,i-1,j, path)) {
			return true;
		}
		//right
		if(solvemaze(maze,i,j+1, path)) {
			return true;
		}
		//down
		if(solvemaze(maze,i+1,j, path)) {
			return true;
		}
		//left
		if(solvemaze(maze,i,j-1, path)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathpossible = ratInAmaze(maze);
		System.out.println(pathpossible);

	}

}
