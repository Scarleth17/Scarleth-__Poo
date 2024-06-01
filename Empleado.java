abstract class Empleado {
    
    private String nombre;
    private String numeroId;
    private String EstadoCivil;

    public Empleado (String nombre, String numeroId, String EstadoCivil){
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.EstadoCivil = EstadoCivil;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNumeroId(){
        return numeroId;
    }
    public void setNumerId(String numeroId){
        this.numeroId = numeroId;
        
    }
    public String getEstadoCivil(){
        return EstadoCivil;
    }
    public void setEstadoCivil(String EstadoCivil){
        this.EstadoCivil = EstadoCivil;
        
    }
 
    //Metodo abstracto

    public abstract double calcularSalario();
    public abstract void calcularSalario(double calcularSalario);



}
