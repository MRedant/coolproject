package com.redant.coolproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class BaseEntity extends AuditEntity implements Serializable, Persistable<String> {

    @Id
    private String id;

    protected BaseEntity(){
        this.id = UUID.randomUUID().toString();
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return this.getCreatedOn() == null;
    }
}
