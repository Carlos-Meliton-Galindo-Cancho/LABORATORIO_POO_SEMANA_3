public class Utilidades {
    // Método estático para convertir Celsius a Fahrenheit
    public static double convertirCelsiusAFahrenheit(double celsius) {
        // Usamos la fórmula para convertir Celsius a Fahrenheit
        return (celsius * 9/5) + 32; // (C * 9/5) + 32
    }

    // Método estático main
    public static void main(String[] args) {
        
        double temperaturaCelsius = 25.0; // Temperatura en grados Celsius
        double temperaturaFahrenheit = convertirCelsiusAFahrenheit(temperaturaCelsius); // Convertimos a Fahrenheit

        // Mostramos el resultado de la conversión
        System.out.println(temperaturaCelsius + " °C es equivalente a " + temperaturaFahrenheit + " °F");
    }
}



















