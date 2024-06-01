public class EmpleadoMedioTiempo extends Empleado {
    
    private double SalarioHora;
    private double HorasT;

    

    public EmpleadoMedioTiempo (String nombre , String nuemroId,double SalarioHora,
         double HorasT,String EstadoCivil){
            super(nombre, nuemroId, EstadoCivil);

            this.SalarioHora = SalarioHora;
            this.HorasT = HorasT;

    }

    @Override
    public double calcularSalario(){
        return SalarioHora * HorasT * 4 ;
    }

    public double getSalarioHora() {
        return SalarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        SalarioHora = salarioHora;
    }

    public double getHorasTrabajadas() {
        return HorasT;
    }

    public void setHorasTrabajadas(double horasT) {
        HorasT = horasT;
    }

    @Override
    public void calcularSalario(double calcularSalario) {
       
    }

    
}
