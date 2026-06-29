package exception.handler;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<Map<String, String>> handleDataAccessException(DataAccessException ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of("error", "DATABASE_ERROR", "message", "Không thể lưu dữ liệu đồng bộ"));
    }

    @ExceptionHandler(org.hibernate.TransientPropertyValueException.class)
    public ResponseEntity<Map<String, String>> handleTransientException(org.hibernate.TransientPropertyValueException ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of("error", "DATABASE_ERROR", "message", "Không thể lưu dữ liệu đồng bộ"));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGenericException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of("error", "UNKNOWN_ERROR", "message", "Đã xảy ra lỗi hệ thống"));
    }
}
