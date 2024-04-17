package principal;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Empleado {

  private String nombre;
  private String apellido;
  private String genero;
  private Fecha fechaNacimiento;
  private Fecha fechaIngreso;
  private String imagen;
  private double salario;
  private int emplenumhijos;

  
  public Empleado() {
      nombre = "Pedro";
      apellido = "Matallana";
      genero = "Masculino";
      fechaNacimiento = new Fecha(16, 6, 1982);
      fechaIngreso = new Fecha(5, 4, 2000);
      imagen = "Pendiente";
      salario = 1500000;
      emplenumhijos = 3;
  }

  

  public Empleado(String pNombre, String pApellido, String pGenero, Fecha pFechaNacimiento, Fecha pFechaIngreso, double salarioN, String pImagen, int emplenumhijos) {
      this.nombre = pNombre;
      this.apellido = pApellido;
      this.genero = pGenero;
      this.fechaNacimiento = pFechaNacimiento;
      this.fechaIngreso = pFechaIngreso;
      this.salario = salarioN;
      this.imagen = pImagen;
      this.emplenumhijos = emplenumhijos;
  }

  /**
   * Retorna el nombre del empleado.
   *
   * @return Nombre del empleado.
   */
  public String getNombre() {
      return nombre;
  }

  /**
   * Retorna el genero del empleado.
   *
   * @return Genero del empleado.
   */
  public String getGenero() {
      return genero;
  }

  /**
 * @param salario the salario to set
 */
public void setSalario(double salario) {
	this.salario = salario;
}



/**
   * Retorna la fecha de nacimiento del empleado en una cadena.
   *
   * @return Fecha de nacimiento del empleado.
   */
  public String darFechaNacimiento() {
      String sFecha = fechaNacimiento.toString();
      return sFecha;
  }

  /**
   * Retorna la fecha de ingreso del empleado en una cadena.
   *
   * @return Fecha de ingreso del empleado.
   */
  public String darFechaIngreso() {
      String strFecha = fechaIngreso.toString();
      return strFecha;
  }

  /**
   * Retorna la ruta de la imagen del empleado.
   *
   * @return Ruta de la imagen.
   */
  public String getImagen() {
      return imagen;
  }

  /**
   * Retorna el salario del empleado.
   *
   * @return Salario del empleado.
   */
  public double getSalario() {
      return salario;
  }

  /**
   * Retorna el apellido del empleado.
   *
   * @return Apellido del empleado.
   */
  public String getApellido() {
      return apellido;
  }


  /**
 * @return the emplenumhijos
 */
public int getEmplenumhijos() {
	return emplenumhijos;
}

/**
 * @param emplenumhijos the emplenumhijos to set
 */
public void setEmplenumhijos(int emplenumhijos) {
	this.emplenumhijos = emplenumhijos;
}


/**
   * Retorna la edad del empleado
   * @return Edad del empleado en años.
   */
  public int calcularEdad() {
      Fecha hoy = darFechaActual();
      int edad = fechaNacimiento.darDiferenciaEnMeses(hoy) / 12;

      return edad;
  }

  public int calcularAntiguedad() {
      Fecha hoy = darFechaActual();
      int antiguedad = fechaIngreso.darDiferenciaEnMeses(hoy) / 12;

      return antiguedad;
  }

  public double calcularPrestaciones() {
      int antiguedad = calcularAntiguedad();
      double prestaciones = ((double) (antiguedad * salario)) / 12;
      return prestaciones;
  }

  public void cambiarEmpleado(String pNombre, String pApellido, String pGenero, Fecha pFechaNacimiento, Fecha pFechaIngreso, double salarioN, String pImagen,int empleHijosa) {
      nombre = pNombre;
      apellido = pApellido;
      genero = pGenero;
      fechaNacimiento = pFechaNacimiento;
      fechaIngreso = pFechaIngreso;
      salario = salarioN;
      imagen = pImagen;
      emplenumhijos=empleHijosa;
  }

  public void cambiarSalario(double pSalario) {
      salario = pSalario;
  }

  public Fecha darFechaActual() {
      GregorianCalendar gc = new GregorianCalendar();

      int dia = gc.get(Calendar.DAY_OF_MONTH);
      int mes = gc.get(Calendar.MONTH) + 1;
      int anho = gc.get(Calendar.YEAR);
      Fecha hoy = new Fecha(dia, mes, anho);

      return hoy;

  }
  
  public double DiferenciaSalarios(Empleado Empleado2) {
	    double salarioEmple1 = this.getSalario();
	    double salarioEmple2 = Empleado2.getSalario();
	    double diferencia = Math.abs(salarioEmple1 - salarioEmple2);
	    return diferencia;
	}
  
  public double calcularAuxilioEducativo(int emplenumHijos) {
      double auxilio = salario * 0.05 * emplenumHijos;
      return auxilio;
  }
  public double calcularAuxilioEducativoPorcent(int emplenumHijos, double porcentaje) {
      double auxilio = salario * (porcentaje/100) * emplenumHijos;
      return auxilio;
  }


public void mostrarInformacion() {
	    System.out.println("---DATOS DEL EMPLEADO---");

	  	System.out.println("\n-------------------------------------------------------------");
	    System.out.println("Nombre: " + this.getNombre());
	    System.out.println("Apellido: " + this.getApellido());
	    System.out.println("Género: " + this.getGenero());
	    System.out.println("Fecha de nacimiento: " + this.darFechaNacimiento());
	    System.out.println("Fecha de ingreso: " + this.darFechaIngreso());
	    System.out.println("Salario: " + this.getSalario());
	    System.out.println("Numero de hijos del empleado: " + this.getEmplenumhijos());
	  	System.out.println("-------------------------------------------------------------");
	}

}