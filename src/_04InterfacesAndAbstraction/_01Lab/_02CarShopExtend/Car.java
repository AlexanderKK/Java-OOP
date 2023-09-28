package _04InterfacesAndAbstraction._01Lab._02CarShopExtend;

import java.io.Serializable;

public interface Car extends Serializable {

    int TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String getCountryProduced();

}
