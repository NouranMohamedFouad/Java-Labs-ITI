package packageGeneric;

public class Complex<T extends Number> 
{
    private T real;
    private T imag;

    public Complex(T real, T imag) 
    {
        this.real=real;
        this.imag=imag;
    }

    public T getReal() 
    {
        return real;
    }

    public T getImaginary() {
        return imag;
    }

    public Complex<Double> add(Complex<T> c) {
        double realPart= this.real.doubleValue()+c.real.doubleValue();
        double imaginaryPart = this.imag.doubleValue() +c.imag.doubleValue();
        return new Complex<Double>(realPart, imaginaryPart);
    }
    
    public Complex<Double> subtract(Complex<T> c) {
        double realPart = this.real.doubleValue() - c.real.doubleValue();
        double imaginaryPart = this.imag.doubleValue()- c.imag.doubleValue();
        return new Complex<Double>(realPart, imaginaryPart);
    }
    
    public Complex<Double> multiply(Complex<T> c) {
        double realPart = (this.real.doubleValue() * c.real.doubleValue()) - (this.imag.doubleValue() * c.imag.doubleValue());
        double imaginaryPart = (this.real.doubleValue() * c.imag.doubleValue()) + (this.imag.doubleValue() * c.real.doubleValue());
       return new Complex<Double>(realPart, imaginaryPart);
    }
    
     public Complex<Double> divide(Complex<T> c) 
     {
        double divisor=Math.pow(c.real.doubleValue(), 2) + Math.pow(c.imag.doubleValue(), 2);
       
        double realPart = ((this.real.doubleValue() * c.real.doubleValue()) +
                           (this.imag.doubleValue() * c.imag.doubleValue())) / divisor;
        double imaginaryPart = ((this.imag.doubleValue() * c.real.doubleValue()) -
                                (this.real.doubleValue() * c.imag.doubleValue())) / divisor;
                                
       return new Complex<Double>(realPart, imaginaryPart);
    }
    
}
