package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import uz.pdp.clickup.entity.enums.WorkspaceRoleName;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(callSuper = true)

public class WorkspaceRole extends AbsUUIDEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkSpace workSpace;

    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private WorkspaceRoleName extendsRole;
}
