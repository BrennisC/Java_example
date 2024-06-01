import java.util.List;
import java.util.Properties;

public class Auto {
    private long id;
    private String marca;
    private String modelo;
    public Auto(){

    }

    public Auto(long id, String marca, String modelo, List<Properties> prop){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
