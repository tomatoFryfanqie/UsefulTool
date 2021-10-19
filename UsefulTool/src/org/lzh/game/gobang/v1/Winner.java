package org.lzh.game.gobang.v1;

import java.util.Date;

public class Winner {

    private String winnerName;
    private Date time;
    private Integer stepNum;

    public String getWinnerName(){
        return this.winnerName;
    }
    public void setWinnerName(String winnerName){
        this.winnerName = winnerName;
    }
    public Date getTime(){
        return this.time;
    }
    public void setTime(Date time){
        this.time = time;
    }
    public Integer getStepNum(){
        return this.stepNum;
    }
    public void setStepNum(Integer stepNum){
        this.stepNum = stepNum;
    }

}
