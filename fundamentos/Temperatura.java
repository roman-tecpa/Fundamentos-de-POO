package Temperatura;

public class Temperatura {
	public Double temperatura;

    public Temperatura(Double celsius) {
        this.temperatura = celsius;
    }

    public Double celsiusToFahrenheit() {
        return (this.temperatura * 9/5) + 32;
    }

    public Double fahrenheitToCelsius() {
        return (this.temperatura - 32) * 5/9;
    }

}
