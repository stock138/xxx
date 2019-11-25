package com.cn.lucky.morning.model.domain;

import java.sql.Timestamp;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.belong_custome
     *
     * @mbg.generated
     */
    private Long belongCustome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.is_super
     *
     * @mbg.generated
     */
    private Integer isSuper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.authority
     *
     * @mbg.generated
     */
    private String authority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.created
     *
     * @mbg.generated
     */
    private Timestamp created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.updated
     *
     * @mbg.generated
     */
    private Timestamp updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_role.creator_id
     *
     * @mbg.generated
     */
    private Long creatorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.id
     *
     * @return the value of m_role.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.id
     *
     * @param id the value for m_role.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.belong_custome
     *
     * @return the value of m_role.belong_custome
     *
     * @mbg.generated
     */
    public Long getBelongCustome() {
        return belongCustome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.belong_custome
     *
     * @param belongCustome the value for m_role.belong_custome
     *
     * @mbg.generated
     */
    public void setBelongCustome(Long belongCustome) {
        this.belongCustome = belongCustome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.name
     *
     * @return the value of m_role.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.name
     *
     * @param name the value for m_role.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.description
     *
     * @return the value of m_role.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.description
     *
     * @param description the value for m_role.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.is_super
     *
     * @return the value of m_role.is_super
     *
     * @mbg.generated
     */
    public Integer getIsSuper() {
        return isSuper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.is_super
     *
     * @param isSuper the value for m_role.is_super
     *
     * @mbg.generated
     */
    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.authority
     *
     * @return the value of m_role.authority
     *
     * @mbg.generated
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.authority
     *
     * @param authority the value for m_role.authority
     *
     * @mbg.generated
     */
    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.created
     *
     * @return the value of m_role.created
     *
     * @mbg.generated
     */
    public Timestamp getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.created
     *
     * @param created the value for m_role.created
     *
     * @mbg.generated
     */
    public void setCreated(Timestamp created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.updated
     *
     * @return the value of m_role.updated
     *
     * @mbg.generated
     */
    public Timestamp getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.updated
     *
     * @param updated the value for m_role.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_role.creator_id
     *
     * @return the value of m_role.creator_id
     *
     * @mbg.generated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_role.creator_id
     *
     * @param creatorId the value for m_role.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}