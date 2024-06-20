package error.demo.exception;

import java.util.Date;

public class ErrorMessage {

    private int statusCode;
    private Date timesTamp;
    private String message;
    private String description;

    public ErrorMessage(int statusCode, Date timesTamp, String message, String description) {
        this.statusCode = statusCode;
        this.timesTamp = timesTamp;
        this.message = message;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Date getTimesTamp() {
        return timesTamp;
    }

    public void setTimesTamp(Date timesTamp) {
        this.timesTamp = timesTamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
