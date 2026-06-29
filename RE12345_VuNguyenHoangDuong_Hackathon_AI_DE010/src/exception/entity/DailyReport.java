package exception.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "daily_reports")
public class DailyReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double temperature;

    @Column(nullable = false)
    private Double humidity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sensor_device_id", nullable = false)
    private SensorDevice sensorDevice;

    public DailyReport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public SensorDevice getSensorDevice() {
        return sensorDevice;
    }

    public void setSensorDevice(SensorDevice sensorDevice) {
        this.sensorDevice = sensorDevice;
    }
}
