package org.lzh.game.gobang.v1;

public class DrawBoard {

    public static char[][] getBoard(int rowNum){

        char[][] chars = new char[2*rowNum+1][2*rowNum+1];
        int columnLength = chars.length;
        int rowLength = chars[0].length;
        for (int i = 0; i < columnLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                if( i%2 == j%2 ){
                    chars[i][j] = ' ';
                }else if( i%2 == 0 && j%2 == 1){
                    chars[i][j] = 'ㅡ';
                }else if( i%2 == 1 && j%2 == 0){
                    chars[i][j] = '〡';
                }
            }
        }
        return chars;
    }
}
