package com.verteilte.project.events;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "catalog", path = "catalog")
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

	List<Event> findByNameContaining(@Param("name") String name);

}
