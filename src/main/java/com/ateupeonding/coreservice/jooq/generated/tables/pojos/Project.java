/*
 * This file is generated by jOOQ.
 */
package com.ateupeonding.coreservice.jooq.generated.tables.pojos;


import com.ateupeonding.coreservice.jooq.generated.enums.ProjectType;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID           id;
    private String         title;
    private String         description;
    private ProjectType    type;
    private UUID           accountId;
    private OffsetDateTime createdTimestamp;

    public Project() {}

    public Project(Project value) {
        this.id = value.id;
        this.title = value.title;
        this.description = value.description;
        this.type = value.type;
        this.accountId = value.accountId;
        this.createdTimestamp = value.createdTimestamp;
    }

    public Project(
        UUID           id,
        String         title,
        String         description,
        ProjectType    type,
        UUID           accountId,
        OffsetDateTime createdTimestamp
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.accountId = accountId;
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * Getter for <code>ateupeonding_core.project.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>ateupeonding_core.project.id</code>.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for <code>ateupeonding_core.project.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>ateupeonding_core.project.title</code>.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for <code>ateupeonding_core.project.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>ateupeonding_core.project.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>ateupeonding_core.project.type</code>.
     */
    public ProjectType getType() {
        return this.type;
    }

    /**
     * Setter for <code>ateupeonding_core.project.type</code>.
     */
    public void setType(ProjectType type) {
        this.type = type;
    }

    /**
     * Getter for <code>ateupeonding_core.project.account_id</code>.
     */
    public UUID getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for <code>ateupeonding_core.project.account_id</code>.
     */
    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for <code>ateupeonding_core.project.created_timestamp</code>.
     */
    public OffsetDateTime getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Setter for <code>ateupeonding_core.project.created_timestamp</code>.
     */
    public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Project (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(type);
        sb.append(", ").append(accountId);
        sb.append(", ").append(createdTimestamp);

        sb.append(")");
        return sb.toString();
    }
}