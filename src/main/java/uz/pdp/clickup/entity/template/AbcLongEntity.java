package uz.pdp.clickup.entity.template;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public abstract class AbcLongEntity extends AbcMainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
