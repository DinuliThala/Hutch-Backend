package com.Site.check.SiteRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Site.check.Site.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

}
