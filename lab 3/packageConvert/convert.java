package packageConvert;

import java.util.function.Function;

public class convert implements Function<Double,Double>
{ 
    @Override
    public Double apply(Double centigrade) 
    {
        return (centigrade*9.0/5.0)+32.0;
    }
}
