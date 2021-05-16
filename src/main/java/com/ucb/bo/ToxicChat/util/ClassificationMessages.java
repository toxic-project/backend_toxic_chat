package com.ucb.bo.ToxicChat.util;

import com.amazonaws.services.comprehend.model.SentimentScore;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class ClassificationMessages {
    public String compareSentimentResult(SentimentScore sentimentScore){
        if(sentimentScore.getPositive()>=sentimentScore.getNegative() && sentimentScore.getPositive()>=sentimentScore.getMixed() && sentimentScore.getPositive()>=sentimentScore.getNeutral()){
            return "mdi-emoticon";
        }
        if (sentimentScore.getNegative()>=sentimentScore.getPositive() && sentimentScore.getNegative()>=sentimentScore.getMixed() && sentimentScore.getNegative()>=sentimentScore.getNeutral()){
            return "mdi-emoticon-devil";
        }
        if (sentimentScore.getNeutral()>=sentimentScore.getPositive() && sentimentScore.getNeutral()>=sentimentScore.getMixed() && sentimentScore.getNeutral()>=sentimentScore.getNegative()){
            return "mdi-emoticon-neutral";
        }
        if (sentimentScore.getMixed()>=sentimentScore.getPositive() && sentimentScore.getMixed()>=sentimentScore.getNegative() && sentimentScore.getMixed()>=sentimentScore.getNeutral()){
            return "mdi-emoticon-confused";
        }else {
            return "";
        }
    }
    public String compareSentimentResultColor(SentimentScore sentimentScore){
        if(sentimentScore.getPositive()>=sentimentScore.getNegative() && sentimentScore.getPositive()>=sentimentScore.getMixed() && sentimentScore.getPositive()>=sentimentScore.getNeutral()){
            return "green";
        }
        if (sentimentScore.getNegative()>=sentimentScore.getPositive() && sentimentScore.getNegative()>=sentimentScore.getMixed() && sentimentScore.getNegative()>=sentimentScore.getNeutral()){
            return "red";
        }
        if (sentimentScore.getNeutral()>=sentimentScore.getPositive() && sentimentScore.getNeutral()>=sentimentScore.getMixed() && sentimentScore.getNeutral()>=sentimentScore.getNegative()){
            return "yellow";
        }
        if (sentimentScore.getMixed()>=sentimentScore.getPositive() && sentimentScore.getMixed()>=sentimentScore.getNegative() && sentimentScore.getMixed()>=sentimentScore.getNeutral()){
            return "";
        }else {
            return "";
        }
    }

}
