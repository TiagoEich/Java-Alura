package interfaces;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFarenheit(double temperaturaCelsius) {
        return (temperaturaCelsius*9/5)+32;
    }

    @Override
    public double farenheitParaCelsius(double temperaturaFarenheit) {
        return (temperaturaFarenheit-32)*5/9;
    }
}

/* Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente
 uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados. */
