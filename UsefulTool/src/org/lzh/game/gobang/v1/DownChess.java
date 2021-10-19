package org.lzh.game.gobang.v1;

public class DownChess {

    public static void down(String line, char[][] board, boolean[][] judgeBoard,int stepNum){
        String[] split = line.split(",");
        int x = 2*Integer.parseInt(split[0]);
        int y = 2*Integer.parseInt(split[1]);
        //判断该格子是否被已经填上
        if (!judgeBoard[x][y]){
           judgeBoard[x][y] = true;
           if (stepNum%2 == 0){
               board[x][y] = '○';
           }else {
               board[x][y] = '●';
           }
        }else {
            //想办法减1
            System.out.println("this position is used");
        }

        //重新加载棋盘
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}
