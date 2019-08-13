package ex3;

public abstract class MidSizeCarBuilder {
  BrandNewCar brandNewCar;

  public BrandNewCar getBrandNewCar() {
    return brandNewCar;
  }

  public void buildBrandNewCar() {
    brandNewCar = new BrandNewCar();
  }

  public abstract void setCarName();
} 
