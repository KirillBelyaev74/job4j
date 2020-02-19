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

        Address addressFirst = new Address("Ekaterenburg", "Kirova", 20, 10);
        Address addressSecond = new Address("Ekaterenburg", "Kirova", 20, 10);
        Address addressThird = new Address("Chelyabinsk", "Kaslinskaya", 10, 30);
        Address addressFourth = new Address("Chelyabinsk", "Kaslinskaya", 10, 30);
        Address addressFifth = new Address("Magnitogorsk", "Kalinina", 30, 20);
        Address addressSixth = new Address("Magnitogorsk", "Kalinina", 30, 20);

        List<Profile> value = List.of(
                new Profile(addressFirst)
                , new Profile(addressSecond)
                , new Profile(addressThird)
                , new Profile(addressFourth)
                , new Profile(addressFifth)
                , new Profile(addressSixth));

        List<Address> result = profiles.collect(value);

        List<Address> expect = List.of(addressThird, addressFirst, addressFifth);

        for(int index = 0; index != expect.size(); index++) {
            assertThat(result.get(index).getCity(), is(expect.get(index).getCity()));
        }
    }
}
