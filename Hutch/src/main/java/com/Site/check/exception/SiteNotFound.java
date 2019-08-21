package com.Site.check.exception;

public class SiteNotFound extends Exception {
	private long site_id;
	public SiteNotFound(long site_id) {
	        super(String.format("Site is not found with id : '%s'", site_id));
	        }

}
