package ru.job4j.turist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {

        List<Address> result = new ArrayList<>();
        if (!profiles.isEmpty()) {
            result = profiles.stream().sorted(Comparator.comparing(p -> p.getAddress().getStreet())).map(Profile::getAddress).collect(Collectors.toList());
        }

        return result;
    }
}
