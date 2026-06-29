package exception.service;

import exception.dto.ReportRequest;
import exception.dto.ReportResponse;
import exception.entity.DailyReport;
import exception.entity.SensorDevice;
import exception.repository.DailyReportRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SensorDataService {
    private final DailyReportRepository reportRepo;

    public SensorDataService(DailyReportRepository reportRepo) {
        this.reportRepo = reportRepo;
    }

    @Transactional
    public ReportResponse createDailyReport(ReportRequest request) {
        System.out.println("Đang xử lý dữ liệu từ thiết bị: " + request.getDeviceCode());

        SensorDevice newSensor = new SensorDevice();
        newSensor.setDeviceCode(request.getDeviceCode());
        newSensor.setStatus("ACTIVE");

        DailyReport report = new DailyReport();
        report.setTemperature(request.getTemp());
        report.setHumidity(request.getHumidity());
        report.setSensorDevice(newSensor);

        reportRepo.save(report);

        return new ReportResponse(report.getId(), "SUCCESS");
    }
}
