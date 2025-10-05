package github.arthur.lswqd.consumer.domain;

import java.time.LocalDateTime;

public class Log {
    private String id, solution, application, typeLog, title, path, message;
    private LocalDateTime timestamp;

    public Log(String id, String solution, String application, String typeLog, String title, String path, String message, LocalDateTime timestamp){
        this.id = id;
        this.solution = solution;
        this.application = application;
        this.typeLog = typeLog;
        this.title = title;
        this.path = path;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getId(){ return this.id; }
    public String getSolution(){ return this.solution; }
    public String getApplication(){ return this.application; }
    public String getTypeLog(){ return this.typeLog; }
    public String getTitle(){ return this.title; }
    public String getPath(){ return this.path; }
    public String getMessage(){ return this.message; }
    public LocalDateTime getTimestamp(){ return this.timestamp; }
}
