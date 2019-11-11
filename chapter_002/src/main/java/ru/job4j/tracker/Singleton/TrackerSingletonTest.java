package ru.job4j.tracker.Singleton;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;

public class TrackerSingletonTest {

    @Test
    public void whenDoesTheSameObjectReturnOne(){
        TrackerOne one = new TrackerOne();
        TrackerOne result = TrackerOne.getInstance();
        Assert.assertThat(result == one, is(false));
    }

    @Test
    public void whenDoesTheSameObjectReturnTwo(){
        TrackerTwo one = new TrackerTwo();
        TrackerTwo result = TrackerTwo.getInstance();
        Assert.assertThat(result == one, is(false));
    }

    @Test
    public void whenDoesTheSameObjectReturnThree(){
        TrackerThree one = new TrackerThree();
        TrackerThree result = TrackerThree.getInstance();
        Assert.assertThat(result == one, is(false));
    }

    @Test
    public void whenDoesTheSameObjectReturnFour(){
        TrackerFour one = TrackerFour.INSTANCE;
        TrackerFour result = TrackerFour.getInstance();
        Assert.assertThat(result == one, is(true));
    }
}
