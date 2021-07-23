package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.template.AbcLongEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskHistory extends AbcLongEntity {

    @ManyToOne
    private Task task;

    @Column(nullable = false)
    private String changeFieldName;

    @Column(nullable = false)
    private String before;

    @Column(nullable = false)
    private String after;

    @Column(nullable = false)
    private String data;


}