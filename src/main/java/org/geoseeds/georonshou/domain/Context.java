package org.geoseeds.georonshou.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Created by geoalban on 13/03/2014.
 */

@NodeEntity
public class Context {

    @GraphId Long id;
    

}
