package org.geoseeds.georonshou.service;

import org.geoseeds.georonshou.domain.Context;
import org.geoseeds.georonshou.domain.Tree;
import org.geoseeds.georonshou.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.node.Neo4jHelper;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;

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

    @Value("${neo4j.servermode}") private boolean isNeo4jServerMode;

    @Rollback(false)
    @BeforeTransaction
    public void cleanGraph() {
//        System.out.println("is server mode?::: " + isNeo4jServerMode);
        if (!isNeo4jServerMode) Neo4jHelper.cleanDb(neo4jTemplate);
    }

    @Test
    public void anything() {
        assertTrue(true);
    }

    @Test
    public void createAndDisplayTree(){
        Tree t = new Tree();
        t.setAuthor(new User());
        t.setContexts(new HashSet<Context>() {{
            new Context();
        }});
        treeService.add(t);
        t = new Tree();
        treeService.add(t);
        t = new Tree();
        treeService.add(t);
        t = new Tree();
        treeService.add(t);

        for (Tree tree : treeService.getAll()) {
            System.out.println(tree);
        }

        assertEquals((Long) 4L,treeService.getQuantity());
    }

    @Test
    public void createAndDeleteTree(){
        Tree t = new Tree();
        treeService.add(t);

        assertEquals((Long) 1L,treeService.getQuantity());

        treeService.delete(t);

        assertEquals((Long) 0L,treeService.getQuantity());

    }

}
