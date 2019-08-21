package com.Site.check.SiteRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Site.check.Site.Site1;

@Repository
public interface SiteRepository1 extends JpaRepository<Site1, Long> {

}
