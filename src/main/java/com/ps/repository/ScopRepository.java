package com.ps.repository;

import com.ps.model.Scop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by samchu on 2017/3/22.
 */
@RestResource(exported = false)
public interface ScopRepository extends JpaRepository<Scop, String> {

    List<Scop> findByResourceidIn(List<String> resourceidList);

    List<Scop> findByResourceidInAndScopidIn(List<String> resourceidList, List<String> scopidList);

    Scop findByResourceidAndScopid(String resourceid, String scopid);
}
