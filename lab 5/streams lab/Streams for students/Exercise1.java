

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {

   public static void main(String[] args) 
   {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here
      List<Country> countries=countryDao.findAllCountries();
      
      countries.stream().map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation))).filter(Optional::isPresent).map(Optional::get).forEach(city -> System.out.println("City: " + city.getName() + ", Population: " + city.getPopulation()));
   }

}