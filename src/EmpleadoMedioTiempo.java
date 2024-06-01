public class EmpleadoMedioTiempo extends Empleado {

    private double salarioXhora;
    private int horastrabajadasXsemana;

    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion, double salarioXhora, int horastrabajadasXsemana){
        super(nombre, numeroIdentificacion);
        this.salarioXhora = salarioXhora;
        this.horastrabajadasXsemana = horastrabajadasXsemana;
    }

    @Override
    public double calcularSalario(){
        return salarioXhora * horastrabajadasXsemana * 4; //Salario mensual
    }
}
