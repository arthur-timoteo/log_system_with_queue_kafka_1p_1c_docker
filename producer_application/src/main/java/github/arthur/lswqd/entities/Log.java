package github.arthur.lswqd.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

public class Log {
    @Getter
    private String id, solution, application;
    @Getter @Setter
    private String typeLog, title, path, message;
    @Getter
    private LocalDateTime timestamp;

    public Log(){ startBasicParameter(); }

    public Log(String typeLog, String title, String message, String path){
        startBasicParameter();
        this.typeLog = typeLog;
        this.title = title;
        this.path = path;
        this.message = message;
    }

    private void startBasicParameter(){
        this.id = UUID.randomUUID().toString();
        this.solution = "LSWQD";
        this.application = "PRODUCER";
        this.timestamp = LocalDateTime.now();
    }
}
