package principal;

public class Fecha {


  private int dia;
  private int mes;
  private int anio;

  // -----------------------------------------------------------------
  // Métodos
  // -----------------------------------------------------------------

  /**
   * Construye una fecha con los parámetros proporcionados <br>
   * <b>post: </b> El día, mes y año de la fecha tienen los valores dados por parámetro.
   *
   * @param pDia  Día de la fecha. pDia > 0 y pDia <= 31 y pDia es un valor válido según el mes.
   * @param pMes  Mes de la fecha. pMes > 0 y pMes <= 12.
   * @param pAnio Año de la fecha. pAnio > 0.
   */
  public Fecha(int pDia, int pMes, int pAnio) {
      dia = pDia;
      mes = pMes;
      anio = pAnio;
  }

  public Fecha(String text) {
	// TODO Auto-generated constructor stub
}

/**
   * Retorna el día de la fecha.
   *
   * @return Día de la fecha.
   */
  public int darDia() {
      return dia;
  }

  /**
   * Retorna el mes de la fecha.
   *
   * @return Mes de la fecha.
   */
  public int darMes() {
      return mes;
  }

  /**
   * Retorna el año de la fecha.
   *
   * @return Año de la fecha.
   */
  public int darAnio() {
      return anio;
  }

  /**
   * Retorna la diferencia en meses que hay entre dos fechas.
   *
   * @param pFecha Fecha contra la que se está comparando. pFecha != null.
   * @return Diferencia en meses de la fechas.
   */
  public int darDiferenciaEnMeses(Fecha pFecha) {
      int diferencia = 0;

      int otroAnho = pFecha.darAnio();
      int otroMes = pFecha.darMes();
      int otroDia = pFecha.darDia();

      // Calcula la diferencia en meses
      diferencia = 12 * (otroAnho - anio) + (otroMes - mes);

      // Si el día no es mayor, resta un mes
      if (otroDia < dia) {
          diferencia--;
      }

      return diferencia;
  }
  
  

  /**
   * Retorna una cadena que representa la fecha.
   *
   * @return Cadena con la información de la fecha, sigue el formato dia-mes-año.
   */
  public String toString() {
      return dia + "/" + mes + "/" + anio;
  }
}