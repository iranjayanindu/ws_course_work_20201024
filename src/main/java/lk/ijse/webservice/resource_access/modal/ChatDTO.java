package lk.ijse.webservice.resource_access.modal;

public class ChatDTO {
        private String sender;
        private String message;
        private String dataTime;

    public String getSender() { return sender; }

    public void setSender(String sender) { this.sender = sender; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public String getDataTime() { return dataTime; }

    public void setDataTime(String dataTime) { this.dataTime = dataTime; }

    @Override
    public String toString() {
        return "ChatDTO{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", dataTime='" + dataTime + '\'' +
                '}';
    }
}
