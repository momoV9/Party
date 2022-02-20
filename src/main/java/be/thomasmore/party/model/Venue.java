package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;


    @Entity

    public class Venue {
        @Id


        private Integer id;
        private String venueName;
        private String linkMoreInfo;
        private int capacity;
        private boolean foodProvided;
        private boolean indoor;
        private boolean outdoor;
        private boolean freeParkingAvailable;
        private String city;
        private double distanceFromPublicTransportInKm;

        public Venue() {
        }


    public Venue(String venueName, String linkMoreInfo) {
        this.venueName = venueName;
        this.linkMoreInfo = linkMoreInfo;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }}