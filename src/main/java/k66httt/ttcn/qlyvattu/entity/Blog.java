package k66httt.ttcn.qlyvattu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "article")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String slug;
    private String description;
    @Column(columnDefinition = "LONGTEXT")
    private String content;
    private String imageBanner;
    private LocalDate createdDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
}

