package dominio;

public class Pelicula {
    private String nombre;

    public Pelicula(){

    }

    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pelicula other = (Pelicula) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public static void main(String[] args) {
        var pelicula1 = new Pelicula("Batman");
        var pelicula2 = new Pelicula("Superman");
        System.out.println(pelicula1);
        System.out.println(pelicula2);
    }
}
