package programame;

import org.w3c.dom.ranges.RangeException;

public class Sensor {
    private int idSensor;
    private int medidaCO2;

    public Sensor(int idSensor, int medidaCO2) {
        setIdSensor(idSensor);
        setMedidaCO2(medidaCO2);
    }

    public void setIdSensor(int idSensor) {
        if (idSensor<1 || idSensor>1000){
            throw new IllegalArgumentException("el id sale del rango permitido");
        }else {
            this.idSensor = idSensor;
        }
    }

    public void setMedidaCO2(int medidaCO2) {
        if (medidaCO2<1 || medidaCO2 >1000000){
            throw new IllegalArgumentException("el rango está fuera de los limites permitidos");
        }else {
            this.medidaCO2 = medidaCO2;
        }
    }
}
