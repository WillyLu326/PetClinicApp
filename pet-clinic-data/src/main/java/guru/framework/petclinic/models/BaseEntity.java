package guru.framework.petclinic.models;

import java.io.Serializable;

/**
 * @author zhenglu
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
