package org.geoseeds.georonshou.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.node.Neo4jHelper;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by geoalban on 14/03/2014.
 */

@ContextConfiguration(locations = "classpath:/spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class TreeServiceTest {

    @Autowired private Neo4jTemplate neo4jTemplate;

    @Autowired private TreeService treeService;

    @Rollback(false)
    @BeforeTransaction
    public void cleanGraph() {
        Neo4jHelper.cleanDb(neo4jTemplate);
    }

    @Test
    public void anything() {
        assertTrue(true);
    }

}
