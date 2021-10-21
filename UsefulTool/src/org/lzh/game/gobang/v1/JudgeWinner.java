package org.lzh.game.gobang.v1;

public class JudgeWinner {

    public static boolean judge(char[][] board,Winner winner){
        boolean winnerFlag = false;
        int  columnNum = board.length;
        int  rowNum = board[0].length;
        char left = '●';
        char right = '○';
        //笨b算法1:
        for (int i = 0; i < columnNum; i++) {
            if (i%2 == 1){
                continue;
            }
            for (int j = 0; j < rowNum; j++) {
                if (j%2 == 1){
                    continue;
                }
                //start
                if(board[i][j] == left){
                    //left
                    if (j-8 >= 0){
                        if (left == board[i][j-2] && left == board[i][j-4] && left == board[i][j-6] && left == board[i][j-8]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //right
                    if (j+8 <= rowNum){
                        if (left == board[i][j+2] && left == board[i][j+4] && left == board[i][j+6] && left == board[i][j+8]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //top
                    if (i-8 >= 0){
                        if (left == board[i-2][j] && left == board[i-4][j] && left == board[i-6][j] && left == board[i-8][j]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //bottom
                    if(i+8 <= columnNum){
                        if (left == board[i+2][j] && left == board[i+4][j] && left == board[i+6][j] && left == board[i+8][j]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //left,top
                    if(i-8 > 0 && j-8 > 0){
                        if (left == board[i-2][j-2] && left == board[i-4][j-4] && left == board[i-6][j-6] && left == board[i-8][j-8]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //top,right
                    if (i-8 > 0 && j+8 < rowNum){
                        if (left == board[i-2][j+2] && left == board[i-4][j+4] && left == board[i-6][j+6] && left == board[i-8][j+8]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //right,bottom
                    if (i+8 < columnNum && j+8 <rowNum){
                        if (left == board[i+2][j+2] && left == board[i+4][j+4] && left == board[i+6][j+6] && left == board[i+8][j+8]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                    //bottom,left
                    if (i+8 <columnNum && j-8 > 0){
                        if (left == board[i+2][j-2] && left == board[i+4][j-4] && left == board[i+6][j-6] && left == board[i+8][j-8]){
                            winner.setWinnerName(String.valueOf(left));
                            winnerFlag = true;
                        }
                    }
                }else if (board[i][j] == right){
                    //left
                    if (j-8 >= 0){
                        if (right == board[i][j-2] && right == board[i][j-4] && right == board[i][j-6] && right == board[i][j-8]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //right
                    if (j+8 <= rowNum){

                        if (right == board[i][j+2] && right == board[i][j+4] && right == board[i][j+6] && right == board[i][j+8]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //top
                    if (i-8 >= 0){
                        if (right == board[i-2][j] && right == board[i-4][j] && right == board[i-6][j] && right == board[i-8][j]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //bottom
                    if (i+8 <= columnNum){
                        if (right == board[i+2][j] && right == board[i+4][j] && right == board[i+6][j] && right == board[i+8][j]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //left,top
                    if(i-8 > 0 && j-8 > 0){
                        if (right == board[i-2][j-2] && right == board[i-4][j-4] && right == board[i-6][j-6] && right == board[i-8][j-8]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //top,right
                    if (i-8 > 0 && j+8 < rowNum){
                        if (right == board[i-2][j+2] && right == board[i-4][j+4] && right == board[i-6][j+6] && right == board[i-8][j+8]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //right,bottom
                    if (i+8 < columnNum && j+8 <rowNum){
                        if (right == board[i+2][j+2] && right == board[i+4][j+4] && right == board[i+6][j+6] && right == board[i+8][j+8]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                    //bottom,left
                    if (i+8 <columnNum && j-8 > 0){
                        if (right == board[i+2][j-2] && right == board[i+4][j-4] && right == board[i+6][j-6] && right == board[i+8][j-8]){
                            winner.setWinnerName(String.valueOf(right));
                            winnerFlag = true;
                        }
                    }
                }
            }
        }
        return winnerFlag;
    }
}
