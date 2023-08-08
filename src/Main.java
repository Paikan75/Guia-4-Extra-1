
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
    LocalDate fechaAlquiler = LocalDate.of(2023, 5, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 5, 10);

        Barco velero = new Velero("ABC123", 10.5, 2018, 2);
        Alquiler alquilerVelero = new Alquiler("Juan", "12345678", fechaAlquiler, fechaDevolucion, 1, velero);
        double precioVelero = alquilerVelero.calcularPrecio();
        System.out.println("Precio del alquiler de un velero: $" + precioVelero);

        Barco barcoMotor = new BarcoAMotor("DEF456", 15.2, 2020, 200);
        Alquiler alquilerBarcoMotor = new Alquiler("María", "87654321", fechaAlquiler, fechaDevolucion, 2, barcoMotor);
        double precioBarcoMotor = alquilerBarcoMotor.calcularPrecio();
        System.out.println("Precio del alquiler de un barco a motor: $" + precioBarcoMotor);

        Barco yate = new YateDeLujo("GHI789", 20.0, 2019, 300, 4);
        Alquiler alquilerYate = new Alquiler("Pedro", "56789123", fechaAlquiler, fechaDevolucion, 3, yate);
        double precioYate = alquilerYate.calcularPrecio();
        System.out.println("Precio del alquiler de un yate de lujo: $" + precioYate);
        
    }
}
