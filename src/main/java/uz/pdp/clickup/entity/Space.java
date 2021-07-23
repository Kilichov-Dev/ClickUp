package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.template.AbcLongEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends AbcLongEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne(fetch = FetchType.LAZY)
    private Icon icon;

    @OneToOne
    private Attachment avatar;

    @Column(nullable = false)
    private String accessType;

    @ManyToOne(fetch = FetchType.LAZY)
    private WorkSpace workSpace;

    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;

    @PrePersist
    @PreUpdate
    public void setInitialLetterMyMethod() {
        this.initialLetter = name.substring(0, 1);
    }

    public Space(String name, String color, Icon icon, Attachment avatar, String accessType, WorkSpace workSpace, User owner) {
        this.name = name;
        this.color = color;
        this.icon = icon;
        this.avatar = avatar;
        this.accessType = accessType;
        this.workSpace = workSpace;
        this.owner = owner;
    }


}
