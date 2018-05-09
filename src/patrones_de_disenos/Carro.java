package patrones_de_disenos;

/**
 *
 * @author Diego Chacon, David Hormaza
 */
public class Carro {
  private final String color; // required
  private final String marca; // required
  private final int modelo; // optional
 
  private Carro(CarroBuilder builder) {
    this.color = builder.color;
    this.marca = builder.marca;
    this.modelo = builder.modelo;
    
  }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

  
  
  

  public static class CarroBuilder {
    private final String color; // required
    private final String marca; // required
    private int modelo; // optional
 
    
    
    public CarroBuilder(String color, String marca) {
      this.color = color;
      this.marca = marca;
    }

    public CarroBuilder setModelo(int modelo) {
      this.modelo = modelo;
      return this;
    }

    public Carro build() {
      return new Carro(this);
    }

  }
}
