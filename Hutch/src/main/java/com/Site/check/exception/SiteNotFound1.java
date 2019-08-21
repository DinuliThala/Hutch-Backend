package com.Site.check.exception;

public class SiteNotFound1 extends Exception {
	private long site_id;
	public SiteNotFound1(long site_id) {
	        super(String.format("Site is not found with id : '%s'", site_id));
	        }

}
