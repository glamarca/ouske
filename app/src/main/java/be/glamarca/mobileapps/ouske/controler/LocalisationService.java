package be.glamarca.mobileapps.ouske.controler;

/**
 * Created by sarace on 6/08/15.
 */
public class LocalisationService {

    private static final LocalisationService instance = new LocalisationService();
    private LocalisationService(){};

    public static final LocalisationService getInstance(){
        return instance;
    }

    public Coordonates getCoordonates(){
        return null;
    }

    public class Coordonates {
        private Long longitude;
        private Long latitude;

        public Long getLongitude() {
            return longitude;
        }

        public void setLongitude(Long longitude) {
            this.longitude = longitude;
        }

        public Long getLatitude() {
            return latitude;
        }

        public void setLatitude(Long latitude) {
            this.latitude = latitude;
        }
    }
}
