
package Dominio;

public class Paciente {
    private String _nombre,_apellido;
    private int _edad,_sesionesPrevistas;
    private boolean _obraSocial;

    public Paciente(String _nombre, String _apellido, int _edad, int _sesionesPrevistas, boolean _obraSocial) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._edad = _edad;
        this._sesionesPrevistas = _sesionesPrevistas;
        this._obraSocial = _obraSocial;
    }

    public Paciente() {
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public int getSesionesPrevistas() {
        return _sesionesPrevistas;
    }

    public void setSesionesPrevistas(int _sesionesPrevistas) {
        this._sesionesPrevistas = _sesionesPrevistas;
    }

    public boolean isObraSocial() {
        return _obraSocial;
    }

    public void setObraSocial(boolean _obraSocial) {
        this._obraSocial = _obraSocial;
    }

    @Override
    public String toString() {
        return _nombre + ", " + _apellido;
    }
    
    public Object[] toArray(){
        //Convertir el objeto en un arreglo:
        return new Object[]{this._nombre + this._apellido, this._edad, this._obraSocial, this._sesionesPrevistas};
    }
    
    
}
