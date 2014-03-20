package org.geoseeds.georonshou.repository;

import org.geoseeds.georonshou.domain.Tree;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by geoalban on 16/03/2014.
 */

@Repository
public interface TreeRepository extends GraphRepository<Tree> {

//    @Query("start movie={0} match m<-[rating:RATED]-user
//            return rating")
//            Iterable<Rating> getRatings(Movie movie);
//
//    // Co-Actors
//    Iterable<Person> findByActorsMoviesActorName(name)
}
