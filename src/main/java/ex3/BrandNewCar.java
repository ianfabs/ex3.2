package ex3;

public class BrandNewCar {
  String carName;

  Chasis chasis;
  Body body;

  public String getCarName() {
    return carName;
  }

  public String getCarSpecs() {
    StringBuffer carSpecs = new StringBuffer();
    carSpecs.append(" Today's car ->  ");
    carSpecs.append(" Specifications: ");
    carSpecs.append(this.chasis.getPartID() + ", ");
    carSpecs.append(this.body.getPartID() + ", ");
    return carSpecs.toString();
  }
}
