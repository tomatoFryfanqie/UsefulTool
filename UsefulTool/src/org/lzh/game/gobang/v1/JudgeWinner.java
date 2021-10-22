package org.lzh.game.gobang.v1;

public class JudgeWinner {

    public static boolean judge(char[][] board,Winner winner){
        boolean winnerFlag = false;
        int  columnNum = board.length;
        int  rowNum = board[0].length;
        char winChess = ' ';
        //笨b算法1:
        for (int i = 0; i < columnNum; i++) {
            if (i%2 == 1){
                continue;
            }
            for (int j = 0; j < rowNum; j++) {
                if (j%2 == 1){
                    continue;
                }
                winChess = board[i][j];
                if(judgeArithmetic(i, j, winChess, board) && winChess != ' '){
                    winner.setWinnerName(String.valueOf(winChess));
                    return true;
                }
            }
        }
        return winnerFlag;
    }

    public static boolean judgeArithmetic(int x, int y, char winChess, char[][] board){
        int rowNum = board.length;
        int columnNum = board[0].length;
        //left
        if (y-8 >= 0){
            if (winChess == board[x][y-2] && winChess == board[x][y-4] && winChess == board[x][y-6] && winChess == board[x][y-8]){
                return true;
            }
        }
        //right
        if (y+8 <= rowNum){
            if (winChess == board[x][y+2] && winChess == board[x][y+4] && winChess == board[x][y+6] && winChess == board[x][y+8]){
                return true;
            }
        }
        //top
        if (x-8 >= 0){
            if (winChess == board[x-2][y] && winChess == board[x-4][y] && winChess == board[x-6][y] && winChess == board[x-8][y]){
                return true;
            }
        }
        //bottom
        if(x+8 <= columnNum){
            if (winChess == board[x+2][y] && winChess == board[x+4][y] && winChess == board[x+6][y] && winChess == board[x+8][y]){
                return true;
            }
        }
        //winChess,top
        if(x-8 > 0 && y-8 > 0){
            if (winChess == board[x-2][y-2] && winChess == board[x-4][y-4] && winChess == board[x-6][y-6] && winChess == board[x-8][y-8]){
                return true;
            }
        }
        //top,right
        if (x-8 > 0 && y+8 < rowNum){
            if (winChess == board[x-2][y+2] && winChess == board[x-4][y+4] && winChess == board[x-6][y+6] && winChess == board[x-8][y+8]){
                return true;
            }
        }
        //right,bottom
        if (x+8 < columnNum && y+8 <rowNum){
            if (winChess == board[x+2][y+2] && winChess == board[x+4][y+4] && winChess == board[x+6][y+6] && winChess == board[x+8][y+8]){
                return true;
            }
        }
        //bottom,winChess
        if (x+8 <columnNum && y-8 > 0){
            if (winChess == board[x+2][y-2] && winChess == board[x+4][y-4] && winChess == board[x+6][y-6] && winChess == board[x+8][y-8]){
                return true;
            }
        }
        return false;
    }
}
