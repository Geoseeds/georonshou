package org.geoseeds.georonshou.service;

import org.geoseeds.georonshou.domain.Tree;
import org.geoseeds.georonshou.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Service;

/**
 * Created by geoalban on 14/03/2014.
 */

@Service
public class TreeService {

    @Autowired
    TreeRepository treeRepository;

    public EndResult<Tree> getAll(){
        return treeRepository.findAll();
    }

    public void add(Tree tree){
        treeRepository.save(tree);
    }

    public Long getQuantity(){
        return treeRepository.count();
    }

    public void delete(Tree tree){
        treeRepository.delete(tree);
    }

//    Iterable<Movie> movies = repo.findAll();
//    Movie movie = repo.findByPropertyValue("title","Matrix");
//    repo.save(movie);
//
//    Iterable<Rating> ratings = repo.getRatings(movie);

}
