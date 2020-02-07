package szu.panda.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import szu.panda.strategy.service.MiniDuckSimulator;
import szu.panda.strategy.service.MiniDuckSimulator1;

/**
 * @author : wuniting
 * @date :   2020-01-15
 * @description :
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestStrategy {
    @Autowired
    MiniDuckSimulator miniDuckSimulator;

    @Autowired
    MiniDuckSimulator1 miniDuckSimulator1;

    @Test
    public void testStrategy(){
//        miniDuckSimulator.MiniDuckSimulator();
        miniDuckSimulator1.MiniDuckSimulator1();
    }
}
