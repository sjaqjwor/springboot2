package com.exam.scheduling.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class Timer {
    Logger logger = LoggerFactory.getLogger(this.getClass());

 //   before task end ->next task running after 100 ms
//    @Scheduled(fixedDelay = 100)
//    public void fixedDelay(){
//        for(int a=0;a<10;a++){
//            logger.info("fixedDelay : "+a);
//        }
//    }

 //   before task start -> next task running after 100ms
//    @Scheduled(fixedRate = 100)
//    public void fixedRate(){
//        for(int a=0;a<10;a++){
//            logger.info("fixedDelay : "+a);
//        }
//    }
    // cron은 특정 시간 설정 가능
    // second minutes  Hours dayofMonth month dayofweek years
    // 0 0 12 * * * 매일 12시 실행
    // 매 1분마다 실행
    @Scheduled(cron = "0 0/1 * * * ?")
    public void cron(){
        logger.info("cron :"+ System.currentTimeMillis());
    }
}
