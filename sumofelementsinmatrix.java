public class sumofelementsinmatrix {
    public static void main (String [] args){
        int N =3;
        int M =4;
        int[][] Grid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int sum = 0;
        for(int i =0; i<N; i++){
            for(int j =0; j<M; j++){
                sum = Grid[i][j] + sum;
            }
        }
        System.out.println("The sum of all elements in the grid is: " + sum);
    }
    
}
