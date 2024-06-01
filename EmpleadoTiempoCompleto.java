  public class EmpleadoTiempoCompleto extends Empleado {

    private double SalarioAnual;

    //Constructor 
    public EmpleadoTiempoCompleto(String nombre ,String numeroId,double salarioAnual,String EstadoCivil){
          super(nombre,numeroId,EstadoCivil);
          this.SalarioAnual=salarioAnual;
    }

    public double SalarioAnual(){
        return SalarioAnual;
    }
    public void salarioAnual(double salarioAnual){
        this.SalarioAnual=salarioAnual;
    }
    @Override

    public double calcularSalario(){

        return SalarioAnual /12;
    }

    public double getSalarioAnual() {
        return SalarioAnual;
    }
   

    @Override
    public void calcularSalario(double calcularSalario) {
        
    }

    
}