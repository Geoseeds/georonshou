package org.geoseeds.georonshou.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

import java.util.Date;
import java.util.Set;

/**
 * Created by geoalban on 13/03/2014.
 */

@NodeEntity
public class Tree {

    @GraphId
    private Long id;
    @Indexed
    private Set<Context> contexts;
    private User author;
    private Set<Score> scores;
    private Set<Leaf> roots;

    @CreatedDate
    private Date whenCreated;
    @LastModifiedDate
    private Date whenModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Context> getContexts() {
        return contexts;
    }

    public void setContexts(Set<Context> contexts) {
        this.contexts = contexts;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<Score> getScores() {
        return scores;
    }

    public void setScores(Set<Score> scores) {
        this.scores = scores;
    }

    public Set<Leaf> getRoots() {
        return roots;
    }

    public void setRoots(Set<Leaf> roots) {
        this.roots = roots;
    }

    public Date getWhenCreated() {
        return whenCreated;
    }

    public Date getWhenModified() {
        return whenModified;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", contexts=" + contexts +
                ", author=" + author +
                ", scores=" + scores +
                ", roots=" + roots +
                ", whenCreated=" + whenCreated +
                ", whenModified=" + whenModified +
                '}';
    }
}
