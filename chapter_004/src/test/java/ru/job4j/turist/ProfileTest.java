package ru.job4j.turist;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {

    @Test
    public void sortProfile() {

        Profiles profiles = new Profiles();

        Address addressFirst = new Address("Chelyabinsk", "Kirova", 20, 10);
        Address addressSecond = new Address("Chelyabinsk", "Kalinina", 30, 20);
        Address addressThird = new Address("Chelyabinsk", "Kaslinskaya", 10, 30);

        List<Profile> value = Arrays.asList(
                new Profile(addressFirst)
                , new Profile(addressSecond)
                , new Profile(addressThird));

        List<Address> result = profiles.collect(value);

        assertThat(result.get(0).getStreet(), is(addressSecond.getStreet()));
    }
}
