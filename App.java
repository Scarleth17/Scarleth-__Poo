 public class App {

    public static void main(String[] args) throws Exception {
        // Create a new instance of the class
        Empleado[] empleados = new Empleado[5];

       empleados[0] = new EmpleadoMedioTiempo("Juan Martinez","1234",150.00,7.00,"Soltero");

       empleados[1] = new EmpleadoTiempoCompleto("Pedro Jarquin","5678",5000.00 ,"Casado");

       empleados[2]=new EmpleadoMedioTiempo("Lester Gonzalez ","20241643",1500.00,6.00,"Casado");

       empleados[3] = new EmpleadoTiempoCompleto("Aracely Miranda","20241633",30000.00,"Soltera");

       empleados[4]=new EmpleadoTiempoCompleto("Isaura Lopez ","2023456",150000.00,"Soltera");
        
         System.out.println();
         for(Empleado empleado :empleados){
            System.out.println("Empleado: " + empleado.getNombre() + " ,Salario: " +   empleado.calcularSalario() +
            ", Identificacion: " +  empleado.getNumeroId() + ", Estado Civil: "+ empleado.getEstadoCivil());
         }




    }
}
