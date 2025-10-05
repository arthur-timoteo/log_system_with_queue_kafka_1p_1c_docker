package github.arthur.lswqd.consumer.infra.dabase.postegresql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;
import java.time.Instant;

@Entity
@Table(name = "log_record")
@Getter @Setter
public class LogEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "solution")
    private String solution;

    @Column(name = "application")
    private String application;

    @Column(name = "type_log")
    private String typeLog;

    @Column(name = "title")
    private String title;

    @Column(name = "path")
    private String path;

    @Column(name = "message")
    private String message;

    @Column(name = "timestamp")
    private Instant timestamp;
}
