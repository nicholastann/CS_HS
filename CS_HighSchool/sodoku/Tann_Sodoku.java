public class Tann_Sodoku {
    private static int[][] board = {
            {3,0,0, 4,9,8, 0,0,2},
            {0,0,8, 1,5,3, 4,0,0},
            {0,0,9, 0,0,0, 3,1,0},

            {1,2,0, 8,0,0, 0,0,6},
            {4,8,5, 0,7,0, 0,3,1},
            {7,9,0, 3,0,0, 0,0,5},

            {0,0,1, 0,0,0, 9,8,0},
            {0,0,2, 7,3,9, 1,0,0},
            {9,0,0, 6,8,1, 0,0,3}
        };
    private static boolean solved = false;
    public static void main() {
        for (int r = 0; r <board.length ; r++) {
            for( int c = 0; c < board.length ; c++) {
                System.out.print(board[r][c]);
                if (c == 8) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        solve(0,0);
        for (int r =0; r <board.length ; r++) {
            for( int c = 0; c < board.length ; c++) {
                System.out.print(board[r][c]);
                if (c == 8) {
                    System.out.println();
                }
            }
        }
    }

    public static void solve(int r, int c) {
        if (solved == true) {
            return;
        }
        if (r == 9) {
            solved = true;
            return;
        }
        if (board[r][c] != 0) {
            c++;
            if (c == 9) {
                c = 0;   
                r++;
            }
            solve(r,c);
            if (solved == true) {
                return;
            }
        }

        else {
            for (int n = 1; n<10; n++) {
                if (rowsafe(n,r,c) && colsafe(n,r,c) && boxsafe(n,r,c)){
                    board[r][c] = n;
                    if (c == 9) {
                        c = 0;   
                        r++;
                    }

                    solve(r,c);
                    if (solved == true) {
                        return;
                    }
                }
            }
            if (solved != true) {
                board[r][c] = 0;
                r = 0;
                c = 0;
            }
        }
    }

    public static boolean rowsafe(int n, int r, int c) {
        for (int i = 0; i<board[r].length; i++) {
            if (n == board[r][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean colsafe(int n,int r, int c) {
        for (int i = 0; i<board[r].length; i++) {
            if (n== board[i][c]) {
                return false;
            }
        }
        return true;
    }

    public static boolean boxsafe(int n, int r, int c) {
        int br, bc;
        if (r<3)  br = 0;
        else if (r<6)  br = 1;
        else  br = 2;
        if (c<3) bc = 0;
        else if (c<6)  bc = 1;
        else bc = 2;

        for ( r =br/3; r <br/3 +3; r++) {
            for( c = bc/3; c < bc/3 +3; c++) {
                if (board[r][c] == n) {
                    return false;
                }
            }
        }
        return true;
    }

}