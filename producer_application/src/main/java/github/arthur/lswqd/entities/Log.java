package github.arthur.lswqd.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Log {
    private String solution;
    private String application;
    private String typeLog;
    private String title;
    private String message;
    private String path;

    public Log(){}

    public Log(String solution, String application, String typeLog, String title, String message, String path){
        this.solution = solution;
        this.application = application;
        this.typeLog = typeLog;
        this.title = title;
        this.message = message;
        this.path = path;
    }
}
