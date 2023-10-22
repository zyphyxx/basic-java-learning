package exercicios.colecoes.ex_1.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String userName;
    private Date moment;

    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;
        return Objects.equals(getUserName(), logEntry.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName());
    }
}
