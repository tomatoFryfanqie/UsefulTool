package org.lzh.game.gobang.v1;

import java.util.Scanner;

public class Gobang {
    public static Winner startGame(){
        //棋盘格子数目
        int num = 2;
        //画出棋盘
        char[][] board = DrawBoard.getBoard(num);
        //判断棋盘
        boolean[][] judgeBoard = new boolean[2 * num + 1][2 * num + 1];
        for (int i = 0; i < judgeBoard.length; i++) {
            for (int j = 0; j < judgeBoard[0].length; j++) {
                if ( i%2 == j%2 ){
                    judgeBoard[i][j] = false;
                }
            }
        }
        //胜者
        Winner winner = new Winner();
        long startTime = System.currentTimeMillis();
        for (int stepNum = 1; ; stepNum++) {
            //确认胜者
            if (JudgeWinner.judge(board)){
                winner.setTime(GMT2Time.gmtTransformTime(System.currentTimeMillis()-startTime));
                winner.setStepNum(stepNum);
                winner.setWinnerName("");
                return winner;
            }
            //平局
            if (stepNum == num*num){
                winner.setTime(GMT2Time.gmtTransformTime(System.currentTimeMillis()-startTime));
                winner.setStepNum(stepNum);
                winner.setWinnerName("平");
                return winner;
            }
            //下棋
            DownChess.down(new Scanner(System.in).nextLine(),board,judgeBoard,stepNum);
        }
    }

    public static void main(String[] args) {
        Gobang.startGame();
    }
}
