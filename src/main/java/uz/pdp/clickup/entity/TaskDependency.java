package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.enums.DependencyType;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskDependency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Task task;

    @ManyToOne
    private Attachment attachment;

    @ManyToOne
    private TaskDependency dependencyTask;

    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;

    private boolean pinCoverImage;
}