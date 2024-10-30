package gestores;

import modelos.Sensor;
import modelos.Plaga;
import java.util.ArrayList;
import java.util.List;

public class GestorSensor {
    private List<Sensor> listaSensores;

    public GestorSensor() {
        this.listaSensores = new ArrayList<>();
    }

    public void registrarSensor(Sensor sensor) {
        listaSensores.add(sensor);
    }

    public Sensor buscarSensorPorId(String id) {
        for (Sensor sensor : listaSensores) {
            if (sensor.getId().equals(id)) {
                return sensor;
            }
        }
        return null;
    }

    public boolean modificarEstadoSensor(String id, boolean nuevoEstado) {
        Sensor sensor = buscarSensorPorId(id);
        if (sensor != null) {
            sensor.setActivo(nuevoEstado);
            return true;
        }
        return false;
    }

    public List<Sensor> obtenerSensoresInactivos() {
        List<Sensor> sensoresInactivos = new ArrayList<>();
        for (Sensor sensor : listaSensores) {
            if (!sensor.isActivo()) {
                sensoresInactivos.add(sensor);
            }
        }
        return sensoresInactivos;
    }
}
