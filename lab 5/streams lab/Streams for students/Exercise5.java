



import java.util.Objects;
import java.util.Optional;


import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) 
    {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
       //write your answer here 
        List<Country> countries=countryDao.findAllCountries();
        countries.stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull) 
                .max(Comparator.comparing(City::getPopulation))
                .ifPresent(city -> System.out.println("Capital City: " + city.getName() + ", Population: " + city.getPopulation()));
    }

}