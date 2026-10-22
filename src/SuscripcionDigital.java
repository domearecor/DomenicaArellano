public class SuscripcionDigital {

    private int id;
    private String nombre;
    private int mesesDisponibles;
    private static  int contadorSuscripciones=0;

    public SuscripcionDigital(int id, String nombre){
        if(id>0 && nombre!=null || nombre.trim().isEmpty()){
            this.id = id;
            contadorSuscripciones++;
        }

    }
    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        if (nombre!=null || nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setMesesDisponibles(int mesesDisponibles) {
            if (mesesDisponibles>0) {
                this.mesesDisponibles = mesesDisponibles;
            }

    }

    public int getMesesDisponibles() {
        return mesesDisponibles;
    }

    void agregarMeses(int meses){
    }


}