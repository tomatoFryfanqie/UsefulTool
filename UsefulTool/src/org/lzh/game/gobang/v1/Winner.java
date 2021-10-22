package org.lzh.game.gobang.v1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Winner {

    private String winnerName;
    private Long time;
    private Integer stepNum;

    public String getWinnerName(){
        return this.winnerName;
    }
    public void setWinnerName(String winnerName){
        this.winnerName = winnerName;
    }
    public Long getTime(){
        return this.time;
    }
    public void setTime(Long time){
        this.time = time;
    }
    public Integer getStepNum(){
        return this.stepNum;
    }
    public void setStepNum(Integer stepNum){
        this.stepNum = stepNum;
    }

    public String toString(){
        return "winnerName: "+getWinnerName()+"\n"+
                "winnerUsedTime: "+new SimpleDateFormat("mm:ss").format(getTime())+"\n"+
                "winnerUsedStep: "+getStepNum();
    }
}
