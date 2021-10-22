package org.lzh.game.gobang.v1;

import org.lzh.transform.DateTransform;

import java.util.Scanner;

public class Gobang {
    public static Winner startGame(){
        //棋盘格子数目
        int num = 18;
        //画出棋盘
        char[][] board = DrawBoard.getBoard(num);
        DrawBoard.reloadBoard(board);
        //判断棋盘
        boolean[][] judgeBoard = DrawBoard.getJudgeBoard(num);
        //胜者
        Winner winner = new Winner();
        long startTime = System.currentTimeMillis();
        for (int stepNum = 1; ; stepNum++) {
            if (stepNum > 9){
                //确认胜者
                if (JudgeWinner.judge(board,winner)){
                    winner.setTime(System.currentTimeMillis()-startTime);
                    winner.setStepNum(stepNum-1);
                    return winner;
                }
                //平局
                if (stepNum == num*num){
                    winner.setWinnerName("平局");
                    return winner;
                }
            }
            //下棋
            DownChess.down(new Scanner(System.in).nextLine(),board,judgeBoard,stepNum);
        }
    }

    public static void main(String[] args) {
        System.out.println(Gobang.startGame().toString());
    }
}
